package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;
import cn.keyrisk.ftp.entity.DimensionHierarchyValueEntity;
import java.util.ArrayList;
import java.util.List;


public  class DimensionHierarchyConverter {


  public static DimensionHierarchy convert(DimensionHierarchyEntity entity){
    if(entity == null){
      return null;
    }
    DimensionHierarchy dimensionHierarchy = new DimensionHierarchy();
    dimensionHierarchy.setDimensionId(entity.getDimensionId());
    dimensionHierarchy.setDimensionHierarchyCd(entity.getDimensionHierarchyCd());
    dimensionHierarchy.setDimensionHierarchyName(entity.getDimensionHierarchyName());
    dimensionHierarchy.setDimensionHierarchyDesc(entity.getDimensionHierarchyDesc());
    dimensionHierarchy.setConfigureFlag(entity.getConfigureFlag());

    List<DimensionHierarchyValue> dimensionHierarchyValueList = new ArrayList<>();
    List<DimensionHierarchyValueEntity> dimensionHierarchyValueEntityList = entity
        .getDimensionHierarchyValueEntityList();
    if(dimensionHierarchyValueEntityList != null){
      for (DimensionHierarchyValueEntity dimensionHierarchyValueEntity : dimensionHierarchyValueEntityList) {
        dimensionHierarchyValueList.add(DimensionHierarchyValueConverter.convert(dimensionHierarchyValueEntity));
      }
    }

    return dimensionHierarchy;
  }


  public static DimensionHierarchyEntity convert(DimensionHierarchy dimensionHierarchy){
    if(dimensionHierarchy == null){
      return null;
    }
    DimensionHierarchyEntity entity = new DimensionHierarchyEntity();
    entity.setDimensionId(dimensionHierarchy.getDimensionId());
    entity.setDimensionHierarchyCd(dimensionHierarchy.getDimensionHierarchyCd());
    entity.setDimensionHierarchyName(dimensionHierarchy.getDimensionHierarchyName());
    entity.setDimensionHierarchyDesc(dimensionHierarchy.getDimensionHierarchyDesc());
    entity.setConfigureFlag(dimensionHierarchy.getConfigureFlag());

    List<DimensionHierarchyValue> list = new ArrayList<>();
    List<DimensionHierarchyValueEntity> dimensionHierarchyValueEntityList = entity
        .getDimensionHierarchyValueEntityList();

    if(dimensionHierarchyValueEntityList != null){
      for (DimensionHierarchyValueEntity dimensionHierarchyValueEntity : dimensionHierarchyValueEntityList) {
        list.add(DimensionHierarchyValueConverter.convert(dimensionHierarchyValueEntity));
      }
    }

    return entity;
  }

}
