package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.entity.DimensionEntity;
import cn.keyrisk.ftp.entity.DimensionMapEntity;
import cn.keyrisk.ftp.repo.DimensionMapRepository;
import cn.keyrisk.ftp.repo.DimensionRepository;
import cn.keyrisk.ftp.v1.Dimension;
import cn.keyrisk.ftp.v1.DimensionConverter;
import cn.keyrisk.ftp.v1.DimensionMap;
import cn.keyrisk.ftp.v1.DimensionMapConverter;
import cn.keyrisk.ftp.v1.Utils;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DimensionMapServiceImpl implements DimensionMapService {


  private final DimensionMapRepository repo;

  public DimensionMapServiceImpl(DimensionMapRepository repo) {
    this.repo = repo;
  }


  @Override
  public void save(DimensionMap dimensionMap) {
    DimensionMapEntity entity =
        DimensionMapConverter.convert(dimensionMap);
    repo.save(entity);
  }

  @Override
  public Page<DimensionMap> search(Map<String, String> map, Pageable pageable) {
    Specification<DimensionMapEntity> spec = (Specification<DimensionMapEntity>) Utils.findAny(map);
    Page<DimensionMapEntity> all = repo.findAll(spec,pageable);
    return all.map(DimensionMapConverter::convert);
  }

  @Override
  public DimensionMap load(Long id) {
    Optional<DimensionMapEntity> data = repo.findById(id);
    return data.map(DimensionMapConverter::convert).orElse(null);
  }

  @Override
  public void del(Long id) {
    repo.deleteById(id);
  }
}
