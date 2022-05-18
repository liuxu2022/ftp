package cn.keyrisk.ftp;

import cn.keyrisk.ftp.v1.Currency;
import cn.keyrisk.ftp.v1.Dimension;
import cn.keyrisk.ftp.v1.DimensionHierarchy;
import cn.keyrisk.ftp.v1.DimensionValue;
import java.util.ArrayList;
import java.util.List;

public class AutoLoader {

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

  public List<Dimension> randomDimension(){
    List<Dimension> list = new ArrayList<>();
    final String[][] strs = {
        {"ALM_COA_CODE","COA账户册","COA账户册","COA","COA编码","1","1"},
        {"GL_ACCOUNT","科目","科目","GL_ACCOUNT","科目编码","1","1"}
    };
    for (String[] str : strs) {
      Dimension dimension = new Dimension();
      dimension.setDimensionId(str[0]);
      dimension.setDimensionName(str[1]);
      dimension.setDimensionDesc(str[2]);
      dimension.setDimensionColumn(str[3]);
      dimension.setDimensionColumnName(str[4]);
      dimension.setIsInternal(str[5]);
      dimension.setIsEditable(str[6]);
      list.add(dimension);
    }

    return list;
  }

  public List<DimensionValue> randomDimensionValue(){
    List<DimensionValue> list = new ArrayList<>();
    final String[][] strs = {
        {"ALM_COA_CODE","10010101","库存现金","1","1"},
        {"ALM_COA_CODE","10010201","自助设备占款","1","1"},
        {"GL_ACCOUNT","100101","库存现金","1","1"},
        {"GL_ACCOUNT","100102","自助设备占款","1","1"},
    };
    for (String[] str : strs) {
      DimensionValue dimensionValue = new DimensionValue();
      dimensionValue.setDimensionId(str[0]);
      dimensionValue.setDimensionValueId(str[1]);
      dimensionValue.setDimensionValueName(str[2]);
      dimensionValue.setLeafOnlyFlag(str[3]);
      dimensionValue.setEnabledFlag(str[4]);
      list.add(dimensionValue);
    }

    return list;
  }

  public List<DimensionHierarchy> randomDimensionHierarchy(){
    List<DimensionHierarchy> list = new ArrayList<>();
    final String[][] strs = {
        {"ALM_COA01","ALM-COA账户册树","ALM-COA账户册树（账户初始化测试）","ALM_COA_CODE","1"},
        {"TR_GL_ACOUNT_01","ALM-科目树","ALM-科目树","GL_ACCOUNT","1"}
    };
    for (String[] str : strs) {
      DimensionHierarchy dimensionHierarchy = new DimensionHierarchy();
      dimensionHierarchy.setDimensionHierarchyCd(str[0]);
      dimensionHierarchy.setDimensionHierarchyName(str[1]);
      dimensionHierarchy.setDimensionHierarchyDesc(str[2]);
      dimensionHierarchy.setDimensionId(str[3]);
      dimensionHierarchy.setConfigureFlag(str[4]);
      list.add(dimensionHierarchy);
    }

    return list;
  }

}
