package cn.keyrisk.ftp.v1;

import java.util.Objects;

public class DimensionHierarchy {

  private String dimensionHierarchyId;

  private String dimensionHierarchyName;

  private String legalEntityId;

  private String dimensionId;

  private String dimensionName;

  private String dimensionHierarchyDesc;

  private String displayDimensionId;

  private String configureFlag;

  public DimensionHierarchy() {
  }

  public DimensionHierarchy(String dimensionHierarchyId, String dimensionHierarchyName,
      String legalEntityId, String dimensionId, String dimensionName,
      String dimensionHierarchyDesc, String displayDimensionId, String configureFlag) {
    this.dimensionHierarchyId = dimensionHierarchyId;
    this.dimensionHierarchyName = dimensionHierarchyName;
    this.legalEntityId = legalEntityId;
    this.dimensionId = dimensionId;
    this.dimensionName = dimensionName;
    this.dimensionHierarchyDesc = dimensionHierarchyDesc;
    this.displayDimensionId = displayDimensionId;
    this.configureFlag = configureFlag;
  }

  public String getDimensionHierarchyId() {
    return dimensionHierarchyId;
  }

  public void setDimensionHierarchyId(String dimensionHierarchyId) {
    this.dimensionHierarchyId = dimensionHierarchyId;
  }

  public String getDimensionHierarchyName() {
    return dimensionHierarchyName;
  }

  public void setDimensionHierarchyName(String dimensionHierarchyName) {
    this.dimensionHierarchyName = dimensionHierarchyName;
  }

  public String getLegalEntityId() {
    return legalEntityId;
  }

  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
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

  public String getDimensionHierarchyDesc() {
    return dimensionHierarchyDesc;
  }

  public void setDimensionHierarchyDesc(String dimensionHierarchyDesc) {
    this.dimensionHierarchyDesc = dimensionHierarchyDesc;
  }

  public String getDisplayDimensionId() {
    return displayDimensionId;
  }

  public void setDisplayDimensionId(String displayDimensionId) {
    this.displayDimensionId = displayDimensionId;
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
    return Objects.equals(dimensionHierarchyId, that.dimensionHierarchyId)
        && Objects.equals(dimensionHierarchyName, that.dimensionHierarchyName)
        && Objects.equals(legalEntityId, that.legalEntityId) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(dimensionName, that.dimensionName) && Objects
        .equals(dimensionHierarchyDesc, that.dimensionHierarchyDesc) && Objects
        .equals(displayDimensionId, that.displayDimensionId) && Objects
        .equals(configureFlag, that.configureFlag);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(dimensionHierarchyId, dimensionHierarchyName, legalEntityId, dimensionId,
            dimensionName,
            dimensionHierarchyDesc, displayDimensionId, configureFlag);
  }
}
