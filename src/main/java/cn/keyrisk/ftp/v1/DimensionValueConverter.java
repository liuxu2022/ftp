package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionValueEntity;

public class DimensionValueConverter {

  public static DimensionValue convert(DimensionValueEntity entity){
    if(entity == null){
      return null;
    }
    DimensionValue dimensionValue = new DimensionValue();
    dimensionValue.setId(entity.getId());
    dimensionValue.setDimensionId(entity.getDimensionId());
    dimensionValue.setDimensionName(entity.getDimensionName());
    dimensionValue.setDimensionValueId(entity.getDimensionValueId());
    dimensionValue.setDimensionValueName(entity.getDimensionValueName());
    return dimensionValue;
  }

  public static DimensionValueEntity convert(DimensionValue dimensionValue){
    DimensionValueEntity entity = new DimensionValueEntity();
    entity.setId(dimensionValue.getId());
    entity.setDimensionId(dimensionValue.getDimensionId());
    entity.setDimensionName(dimensionValue.getDimensionName());
    entity.setDimensionValueId(dimensionValue.getDimensionValueId());
    entity.setDimensionValueName(dimensionValue.getDimensionValueName());
    return entity;
  }

}
