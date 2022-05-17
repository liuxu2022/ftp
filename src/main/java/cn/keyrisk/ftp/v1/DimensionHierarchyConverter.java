package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionHierarchyEntity;


public  class DimensionHierarchyConverter {


  public static DimensionHierarchy convert(DimensionHierarchyEntity entity){
    if(entity == null){
      return null;
    }
    DimensionHierarchy dimensionHierarchy = new DimensionHierarchy();
    dimensionHierarchy.setDimensionId(entity.getDimensionId());
    dimensionHierarchy.setDimensionName(entity.getDimensionName());
    dimensionHierarchy.setDimensionHierarchyId(entity.getDimensionHierarchyId());
    dimensionHierarchy.setDimensionHierarchyName(entity.getDimensionHierarchyName());
    dimensionHierarchy.setDimensionHierarchyDesc(entity.getDimensionHierarchyDesc());
    dimensionHierarchy.setConfigureFlag(entity.getConfigureFlag());
    dimensionHierarchy.setDisplayDimensionId(entity.getDisplayDimensionId());
    dimensionHierarchy.setLegalEntityId(entity.getLegalEntityId());

    return dimensionHierarchy;
  }


  public static DimensionHierarchyEntity convert(DimensionHierarchy dimensionHierarchy){
    if(dimensionHierarchy == null){
      return null;
    }
    DimensionHierarchyEntity entity = new DimensionHierarchyEntity();
    entity.setDimensionId(dimensionHierarchy.getDimensionId());
    entity.setDimensionName(dimensionHierarchy.getDimensionName());
    entity.setDimensionHierarchyId(dimensionHierarchy.getDimensionHierarchyId());
    entity.setDimensionHierarchyName(dimensionHierarchy.getDimensionHierarchyName());
    entity.setDimensionHierarchyDesc(dimensionHierarchy.getDimensionHierarchyDesc());
    entity.setConfigureFlag(dimensionHierarchy.getConfigureFlag());
    entity.setDisplayDimensionId(dimensionHierarchy.getDisplayDimensionId());
    entity.setLegalEntityId(dimensionHierarchy.getLegalEntityId());

    return entity;
  }

}
