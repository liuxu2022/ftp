package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.entity.DimensionValueEntity;
import cn.keyrisk.ftp.v1.DimensionValue;
import cn.keyrisk.ftp.repo.DimensionValueRepository;
import cn.keyrisk.ftp.v1.DimensionValueConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import javax.persistence.criteria.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DimensionValueServiceImpl implements DimensionValueService {

  //private final DimensionValueConverter converter;
  private final DimensionValueRepository repo;

  public DimensionValueServiceImpl(
      DimensionValueRepository repo) {
    this.repo = repo;
  }


  @Override
  public void save(DimensionValue dimensionValue) {
    DimensionValueEntity entity = DimensionValueConverter.convert(dimensionValue);
    repo.save(entity);
  }

  @Override
  public Page<DimensionValue> search(Map<String, String> map, Pageable pageable) {
    Specification<DimensionValueEntity> spec = DimensionValueSpecification.findAny(map);
    Page<DimensionValueEntity> all = repo.findAll(spec,pageable);
    return all.map(DimensionValueConverter::convert);
  }

  @Override
  public DimensionValue load(Long id) {
    Objects.requireNonNull(id);
    Optional<DimensionValueEntity> entity = repo.findById(id);
    return entity.map(DimensionValueConverter::convert).orElse(null);
  }

  @Override
  public void del(Long id) {
    repo.deleteById(id);
  }

  private static class DimensionValueSpecification {
    private static Specification<DimensionValueEntity> findAny(Map<String, String> map){
      return (root,query,cb) -> {
        List<Predicate> predicateList = new ArrayList<>();
        for (Entry<String, String> entry : map.entrySet()) {
          Predicate pre = cb.equal(root.get(entry.getKey()), entry.getValue());
          predicateList.add(pre);
        }
        return cb.and(predicateList.toArray(new Predicate[0]));
      };
    }
  }
}
