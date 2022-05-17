package cn.keyrisk.ftp;

import cn.keyrisk.ftp.service.CurrencyService;
import cn.keyrisk.ftp.v1.Currency;
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

  @EventListener
  @Transactional
  public void afterStartup(ApplicationStartedEvent ev) {
    CurrencyLoader loader = new CurrencyLoader();
    List<Currency> currencys = loader.randomCurrencys();
    for (Currency currency : currencys) {
      service.save(currency);
    }
    System.out.println("测试数据准备完毕");
  }
  public static void main(String[] args) {
    SpringApplication.run(KeyFtpApplication.class, args);
  }

}
