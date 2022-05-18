package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;
import cn.keyrisk.ftp.entity.DimensionHierarchyValueEntity;
import java.util.ArrayList;
import java.util.List;


public  class DimensionHierarchyValueConverter {


  public static DimensionHierarchyValue convert(DimensionHierarchyValueEntity entity){
    if(entity == null){
      return null;
    }
    DimensionHierarchyValue dimensionHierarchyValue = new DimensionHierarchyValue();
    dimensionHierarchyValue.setDimensionHierarchyCd(entity.getDimensionHierarchyCd());
    dimensionHierarchyValue.setDimensionValueId(entity.getDimensionValueId());
    //todo 完善所有属性转换

    return dimensionHierarchyValue;
  }


  public static DimensionHierarchyValueEntity convert(DimensionHierarchyValue dimensionHierarchyValue){
    if(dimensionHierarchyValue == null){
      return null;
    }
    DimensionHierarchyValueEntity entity = new DimensionHierarchyValueEntity();
    entity.setDimensionHierarchyCd(dimensionHierarchyValue.getDimensionHierarchyCd());
    entity.setDimensionValueId(dimensionHierarchyValue.getDimensionValueId());

    return entity;
  }

}
