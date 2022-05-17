package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.v1.Currency;
import cn.keyrisk.ftp.v1.Dimension;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DimensionService {

  void save(Dimension dimension);

  Page<Dimension> search(Map<String, String> map, Pageable pageable);

  Dimension load(Long id);

  void del(Long id);
}