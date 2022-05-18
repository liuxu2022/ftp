package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.v1.Dimension;
import cn.keyrisk.ftp.v1.DimensionMap;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DimensionMapService {

  void save(DimensionMap dimensionMap);

  Page<DimensionMap> search(Map<String, String> map, Pageable pageable);

  DimensionMap load(Long id);

  void del(Long id);
}