package cn.keyrisk.ftp.v1;

import java.util.Objects;

public class Dimension {


  private Long id;

  private String dimensionId;


  private String dimensionName;


  private String dimensionColumn;


  private String dimensionColumnName;


  private String isInternal;


  private String isEditable;


  private String dimensionDesc;

  public Dimension() {
  }

  public Dimension(Long id, String dimensionId, String dimensionName,
      String dimensionColumn,
      String dimensionColumnName, String isInternal, String isEditable,
      String dimensionDesc) {
    this.id = id;
    this.dimensionId = dimensionId;
    this.dimensionName = dimensionName;
    this.dimensionColumn = dimensionColumn;
    this.dimensionColumnName = dimensionColumnName;
    this.isInternal = isInternal;
    this.isEditable = isEditable;
    this.dimensionDesc = dimensionDesc;
  }

  public String getDimensionId() {
    return dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
  }

  public String getDimensionName() {
    return dimensionName;
  }

  public void setDimensionName(String dimensionName) {
    this.dimensionName = dimensionName;
  }

  public String getDimensionColumn() {
    return dimensionColumn;
  }

  public void setDimensionColumn(String dimensionColumn) {
    this.dimensionColumn = dimensionColumn;
  }

  public String getDimensionColumnName() {
    return dimensionColumnName;
  }

  public void setDimensionColumnName(String dimensionColumnName) {
    this.dimensionColumnName = dimensionColumnName;
  }

  public String getIsInternal() {
    return isInternal;
  }

  public void setIsInternal(String isInternal) {
    this.isInternal = isInternal;
  }

  public String getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(String isEditable) {
    this.isEditable = isEditable;
  }

  public String getDimensionDesc() {
    return dimensionDesc;
  }

  public void setDimensionDesc(String dimensionDesc) {
    this.dimensionDesc = dimensionDesc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimension dimension = (Dimension) o;
    return Objects.equals(id, dimension.id) && Objects
        .equals(dimensionId, dimension.dimensionId) && Objects
        .equals(dimensionName, dimension.dimensionName) && Objects
        .equals(dimensionColumn, dimension.dimensionColumn) && Objects
        .equals(dimensionColumnName, dimension.dimensionColumnName) && Objects
        .equals(isInternal, dimension.isInternal) && Objects
        .equals(isEditable, dimension.isEditable) && Objects
        .equals(dimensionDesc, dimension.dimensionDesc);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimensionId, dimensionName, dimensionColumn, dimensionColumnName, isInternal,
            isEditable, dimensionDesc);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
