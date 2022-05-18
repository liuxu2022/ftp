package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionEntity;
import cn.keyrisk.ftp.entity.DimensionMapEntity;

public class DimensionMapConverter {
  public static DimensionMap convert(DimensionMapEntity entity){
    DimensionMap dimensionMap = new DimensionMap();
    if(entity == null){
      return null;
    }
    dimensionMap.setId(entity.getId());
    dimensionMap.setDimMapId(entity.getDimMapId());
    dimensionMap.setDimMapName(entity.getDimMapName());
    dimensionMap.setDimMapDesc(entity.getDimMapDesc());
    dimensionMap.setDimensionId(entity.getDimensionId());
    dimensionMap.setDimensionHierarchyId(entity.getDimensionHierarchyId());
    dimensionMap.setLegalEntityId(entity.getLegalEntityId());
    dimensionMap.setConfigureFlag(entity.getConfigureFlag());

    return dimensionMap;
  }

  public static DimensionMapEntity convert(DimensionMap dimensionMap){
    DimensionMapEntity entity = new DimensionMapEntity();
    if(dimensionMap == null){
      return null;
    }
    entity.setId(dimensionMap.getId());
    entity.setDimMapId(dimensionMap.getDimMapId());
    entity.setDimMapName(dimensionMap.getDimMapName());
    entity.setDimMapDesc(dimensionMap.getDimMapDesc());
    entity.setDimensionId(dimensionMap.getDimensionId());
    entity.setDimensionHierarchyId(dimensionMap.getDimensionHierarchyId());
    entity.setLegalEntityId(dimensionMap.getLegalEntityId());
    entity.setConfigureFlag(dimensionMap.getConfigureFlag());

    return entity;
  }
}
