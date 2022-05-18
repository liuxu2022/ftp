package cn.keyrisk.ftp;

import cn.keyrisk.ftp.service.CurrencyService;
import cn.keyrisk.ftp.service.DimensionHierarchyService;
import cn.keyrisk.ftp.service.DimensionService;
import cn.keyrisk.ftp.service.DimensionValueService;
import cn.keyrisk.ftp.v1.Currency;
import cn.keyrisk.ftp.v1.Dimension;
import cn.keyrisk.ftp.v1.DimensionHierarchy;
import cn.keyrisk.ftp.v1.DimensionValue;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class KeyFtpApplication {

  @Autowired
  CurrencyService service;

  @Autowired
  DimensionService dimensionService;

  @Autowired
  DimensionValueService dimensionValueService;

  @Autowired
  DimensionHierarchyService dimensionHierarchyService;

  @EventListener
  @Transactional
  public void afterStartup(ApplicationStartedEvent ev) {
    AutoLoader loader = new AutoLoader();
    List<Currency> currencys = loader.randomCurrencys();
    List<Dimension> dimensions = loader.randomDimension();
    List<DimensionValue> dimensionValues = loader.randomDimensionValue();
    List<DimensionHierarchy> dimensionHierarchyList = loader.randomDimensionHierarchy();
    for (Currency currency : currencys) {
      service.save(currency);
    }
    for (Dimension dimension : dimensions) {
      dimensionService.save(dimension);
    }
    for (DimensionValue dimensionValue : dimensionValues) {
      dimensionValueService.save(dimensionValue);
    }
    for (DimensionHierarchy dimensionHierarchy : dimensionHierarchyList) {
      dimensionHierarchyService.save(dimensionHierarchy);
    }
    System.out.println("测试数据准备完毕");
  }
  public static void main(String[] args) {
    SpringApplication.run(KeyFtpApplication.class, args);
  }

}
