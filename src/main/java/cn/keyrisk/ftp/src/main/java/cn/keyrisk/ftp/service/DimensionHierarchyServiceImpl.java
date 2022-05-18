package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;
import cn.keyrisk.ftp.entity.DimensionHierarchyValueEntity;
import cn.keyrisk.ftp.repo.DimensionHierarchyRepository;
import cn.keyrisk.ftp.repo.DimensionHierarchyValueRepository;
import cn.keyrisk.ftp.v1.DimensionHierarchy;
import cn.keyrisk.ftp.v1.DimensionHierarchyConverter;
import cn.keyrisk.ftp.v1.Utils;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DimensionHierarchyServiceImpl implements
    DimensionHierarchyService {

  private final DimensionHierarchyRepository repo;


  public DimensionHierarchyServiceImpl(DimensionHierarchyRepository repo) {
    this.repo = repo;

  }


  @Override
  public void save(DimensionHierarchy dimensionHierarchy) {
    DimensionHierarchyEntity entity =
        DimensionHierarchyConverter.convert(dimensionHierarchy);
    repo.save(entity);
  }

  @Override
  public DimensionHierarchy load(Long id) {
    Optional<DimensionHierarchyEntity> entity = repo.findById(id);


    return entity.map(DimensionHierarchyConverter::convert).orElse(null);
  }

  @Override
  public Page<DimensionHierarchy> search(Map<String, String> map,Pageable pageable) {

    Specification<DimensionHierarchyEntity> spec = (Specification<DimensionHierarchyEntity>) Utils.findAny(map);
    Page<DimensionHierarchyEntity> all = repo.findAll(spec,pageable);
    return all.map(DimensionHierarchyConverter::convert);
  }

  @Override
  public void del(Long id) {
    repo.deleteById(id);
  }

  @Override
  public void saveEntity(DimensionHierarchyEntity entity) {
    repo.save(entity);
  }


}
