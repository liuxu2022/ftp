package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.v1.DimensionValue;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DimensionValueService {

  void save(DimensionValue dimensionValue);

  Page<DimensionValue> search(Map<String, String> map, Pageable pageable);

  DimensionValue load(Long id);

  void del(Long id);
}
