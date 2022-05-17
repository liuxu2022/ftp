package cn.keyrisk.ftp.service;

import cn.keyrisk.ftp.entity.CurrencyEntity;
import cn.keyrisk.ftp.entity.DimensionValueEntity;
import cn.keyrisk.ftp.v1.Currency;
import cn.keyrisk.ftp.v1.CurrencyConverter;
import cn.keyrisk.ftp.v1.DimensionValueConverter;
import cn.keyrisk.ftp.v1.Utils;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import cn.keyrisk.ftp.repo.CurrencyRepository;

@Service
public class CurrencyServiceImpl implements CurrencyService {

  final CurrencyRepository repo;

  public CurrencyServiceImpl(CurrencyRepository repo) {
    this.repo = repo;
  }

  @Override
  public Page<Currency> search(Map<String, String> map, Pageable pageable) {
    Specification<CurrencyEntity> spec = (Specification<CurrencyEntity>) Utils.findAny(map);
    Page<CurrencyEntity> all = repo.findAll(spec,pageable);
    return all.map(CurrencyConverter::convert);
  }

  @Override
  public void save(Currency currency) {
    CurrencyEntity entity = CurrencyConverter.convert(currency);
    repo.save(entity);
  }

  @Override
  public Currency load(Long id) {
    Optional<CurrencyEntity> entity = repo.findById(id);
    return entity.map(CurrencyConverter::convert).orElse(null);
  }
}
