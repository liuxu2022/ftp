package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.CurrencyEntity;

public class CurrencyConverter {
  public static Currency convert(CurrencyEntity entity){
    Currency currency = new Currency();
    if(entity == null){
      return null;
    }
    currency.setId(entity.getId());
    currency.setIsoCurrencyCd(entity.getIsoCurrencyCd());
    currency.setCurrencyName(entity.getCurrencyName());
    currency.setCurrencyStatusCd(entity.getCurrencyStatusCd());
    currency.setReportingFlg(entity.getReportingFlg());

    return currency;
  }

  public static CurrencyEntity convert(Currency currency){
    if(currency == null){
      return null;
    }

    CurrencyEntity entity = new CurrencyEntity();
    entity.setId(currency.getId());
    entity.setIsoCurrencyCd(currency.getIsoCurrencyCd());
    entity.setCurrencyName(currency.getCurrencyName());
    entity.setCurrencyStatusCd(currency.getStatus());
    entity.setReportingFlg(currency.getReportingFlg());

    return entity;
  }

}
