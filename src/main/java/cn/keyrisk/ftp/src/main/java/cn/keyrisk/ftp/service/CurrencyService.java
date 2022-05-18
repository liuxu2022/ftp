package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.v1.Currency;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CurrencyService {

  Page<Currency> search(Map<String, String> map, Pageable pageable);

  void save(Currency currency);

  Currency load(Long id);
}
