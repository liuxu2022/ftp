package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.entity.CurrencyEntity;
import cn.keyrisk.ftp.entity.DimensionEntity;
import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;
import cn.keyrisk.ftp.v1.Currency;
import cn.keyrisk.ftp.v1.CurrencyConverter;
import cn.keyrisk.ftp.v1.Dimension;
import cn.keyrisk.ftp.repo.DimensionRepository;
import cn.keyrisk.ftp.v1.DimensionConverter;
import cn.keyrisk.ftp.v1.DimensionHierarchyConverter;
import cn.keyrisk.ftp.v1.Utils;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DimensionServiceImpl implements DimensionService {


  private final DimensionRepository repo;

  public DimensionServiceImpl(DimensionRepository repo) {
    this.repo = repo;
  }


  @Override
  public void save(Dimension dimension) {
    DimensionEntity entity =
        DimensionConverter.convert(dimension);
    repo.save(entity);
  }

  @Override
  public Page<Dimension> search(Map<String, String> map, Pageable pageable) {
    Specification<DimensionEntity> spec = (Specification<DimensionEntity>) Utils.findAny(map);
    Page<DimensionEntity> all = repo.findAll(spec,pageable);
    return all.map(DimensionConverter::convert);
  }

  @Override
  public Dimension load(Long id) {
    Optional<DimensionEntity> data = repo.findById(id);
    return data.map(DimensionConverter::convert).orElse(null);
  }

  @Override
  public void del(Long id) {
    repo.deleteById(id);
  }
}
