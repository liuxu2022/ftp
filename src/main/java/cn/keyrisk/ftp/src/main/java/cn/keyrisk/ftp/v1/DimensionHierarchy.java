package cn.keyrisk.ftp.v1;

import java.util.List;
import java.util.Objects;

public class DimensionHierarchy {

  private Long id;

  private String dimensionHierarchyCd;

  private String dimensionHierarchyName;

  private String dimensionHierarchyDesc;

  private String dimensionId;

  private String configureFlag;

  private List<DimensionHierarchyValue> dimensionHierarchyValueList;

  public List<DimensionHierarchyValue> getDimensionHierarchyValueList() {
    return dimensionHierarchyValueList;
  }

  public void setDimensionHierarchyValueList(
      List<DimensionHierarchyValue> dimensionHierarchyValueList) {
    this.dimensionHierarchyValueList = dimensionHierarchyValueList;
  }

  public DimensionHierarchy() {
  }

  public DimensionHierarchy(Long id, String dimensionHierarchyCd,
      String dimensionHierarchyName, String dimensionHierarchyDesc, String dimensionId,
      String configureFlag,
      List<DimensionHierarchyValue> dimensionHierarchyValueList) {
    this.id = id;
    this.dimensionHierarchyCd = dimensionHierarchyCd;
    this.dimensionHierarchyName = dimensionHierarchyName;
    this.dimensionHierarchyDesc = dimensionHierarchyDesc;
    this.dimensionId = dimensionId;
    this.configureFlag = configureFlag;
    this.dimensionHierarchyValueList = dimensionHierarchyValueList;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDimensionHierarchyCd() {
    return dimensionHierarchyCd;
  }

  public void setDimensionHierarchyCd(String dimensionHierarchyCd) {
    this.dimensionHierarchyCd = dimensionHierarchyCd;
  }

  public String getDimensionHierarchyName() {
    return dimensionHierarchyName;
  }

  public void setDimensionHierarchyName(String dimensionHierarchyName) {
    this.dimensionHierarchyName = dimensionHierarchyName;
  }

  public String getDimensionHierarchyDesc() {
    return dimensionHierarchyDesc;
  }

  public void setDimensionHierarchyDesc(String dimensionHierarchyDesc) {
    this.dimensionHierarchyDesc = dimensionHierarchyDesc;
  }

  public String getDimensionId() {
    return dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
  }

  public String getConfigureFlag() {
    return configureFlag;
  }

  public void setConfigureFlag(String configureFlag) {
    this.configureFlag = configureFlag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionHierarchy that = (DimensionHierarchy) o;
    return Objects.equals(id, that.id) && Objects
        .equals(dimensionHierarchyCd, that.dimensionHierarchyCd) && Objects
        .equals(dimensionHierarchyName, that.dimensionHierarchyName) && Objects
        .equals(dimensionHierarchyDesc, that.dimensionHierarchyDesc) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(configureFlag, that.configureFlag) && Objects
        .equals(dimensionHierarchyValueList, that.dimensionHierarchyValueList);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimensionHierarchyCd, dimensionHierarchyName, dimensionHierarchyDesc, dimensionId,
            configureFlag, dimensionHierarchyValueList);
  }
}
