package cn.keyrisk.ftp;

import cn.keyrisk.ftp.v1.Currency;
import java.util.ArrayList;
import java.util.List;

public class CurrencyLoader {

  public List<Currency> randomCurrencys(){
    List<Currency> list = new ArrayList<>();

    final Object[][] strs = {
        {"CNY","人民币",true,"1"},
        {"USD","美元",true,"1"}
    };
    for (Object[] str : strs) {
      Currency currency = new Currency();
      currency.setIsoCurrencyCd(str[0].toString());
      currency.setCurrencyName(str[1].toString());
      currency.setCurrencyStatusCd(Boolean.valueOf(str[2].toString()));
      currency.setReportingFlg(str[3].toString());
      list.add(currency);
    }
    return list;
  }

}
