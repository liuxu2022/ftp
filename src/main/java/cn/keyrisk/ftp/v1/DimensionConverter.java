package cn.keyrisk.ftp.v1;

import cn.keyrisk.ftp.entity.DimensionEntity;

public class DimensionConverter {
  public static Dimension convert(DimensionEntity entity){
    Dimension dimension = new Dimension();
    if(entity == null){
      return null;
    }
    dimension.setId(entity.getId());
    dimension.setDimensionId(entity.getDimensionId());
    dimension.setDimensionName(entity.getDimensionName());
    dimension.setDimensionDesc(entity.getDimensionDesc());
    dimension.setDimensionColumn(entity.getDimensionColumn());
    dimension.setDimensionColumnName(entity.getDimensionColumnName());
    dimension.setIsEditable(entity.getIsEditable());
    dimension.setIsInternal(entity.getIsInternal());

    return dimension;
  }

  public static DimensionEntity convert(Dimension dimension){
    DimensionEntity entity = new DimensionEntity();
    if(dimension == null){
      return null;
    }
    entity.setId(dimension.getId());
    entity.setDimensionId(dimension.getDimensionId());
    entity.setDimensionName(dimension.getDimensionName());
    entity.setDimensionDesc(dimension.getDimensionDesc());
    entity.setDimensionColumn(dimension.getDimensionColumn());
    entity.setDimensionColumnName(dimension.getDimensionColumnName());
    entity.setIsEditable(dimension.getIsEditable());
    entity.setIsInternal(dimension.getIsInternal());

    return entity;
  }
}
