package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.v1.DimensionHierarchy;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DimensionHierarchyService {

  void save(DimensionHierarchy dimensionHierarchy);

  DimensionHierarchy load(Long id);

  Page<DimensionHierarchy> search(Map<String, String> map, Pageable pageable);

  void del(Long id);
}
