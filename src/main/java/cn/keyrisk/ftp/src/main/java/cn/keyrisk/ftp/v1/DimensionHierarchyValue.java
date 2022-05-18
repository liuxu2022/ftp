package cn.keyrisk.ftp.v1;

import java.util.Objects;


public class DimensionHierarchyValue {

  private Long id;

  /** 维度树编码 */
  private String dimensionHierarchyCd;

  /** 维度树名称 */
  private String dimensionHierarchyName;

  /** 维度值ID */
  private String dimensionValueId;

  private String dimensionValueName;

  /** 维度父值 */
  private String dimensionValuePid;

  /** 是否已配置 */
  private String configureFlag;

  private String leafOnlyFlag;

  /** 节点深度 */
  private Long dimensionDepthNum;

  /** 显示顺序 */
  private Long displayOrderNum;

  public DimensionHierarchyValue(Long id, String dimensionHierarchyCd,
      String dimensionHierarchyName, String dimensionValueId, String dimensionValueName,
      String dimensionValuePid, String configureFlag, String leafOnlyFlag,
      Long dimensionDepthNum, Long displayOrderNum) {
    this.id = id;
    this.dimensionHierarchyCd = dimensionHierarchyCd;
    this.dimensionHierarchyName = dimensionHierarchyName;
    this.dimensionValueId = dimensionValueId;
    this.dimensionValueName = dimensionValueName;
    this.dimensionValuePid = dimensionValuePid;
    this.configureFlag = configureFlag;
    this.leafOnlyFlag = leafOnlyFlag;
    this.dimensionDepthNum = dimensionDepthNum;
    this.displayOrderNum = displayOrderNum;
  }

  public DimensionHierarchyValue() {
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

  public String getDimensionValueId() {
    return dimensionValueId;
  }

  public void setDimensionValueId(String dimensionValueId) {
    this.dimensionValueId = dimensionValueId;
  }

  public String getDimensionValueName() {
    return dimensionValueName;
  }

  public void setDimensionValueName(String dimensionValueName) {
    this.dimensionValueName = dimensionValueName;
  }

  public String getDimensionValuePid() {
    return dimensionValuePid;
  }

  public void setDimensionValuePid(String dimensionValuePid) {
    this.dimensionValuePid = dimensionValuePid;
  }

  public String getConfigureFlag() {
    return configureFlag;
  }

  public void setConfigureFlag(String configureFlag) {
    this.configureFlag = configureFlag;
  }

  public String getLeafOnlyFlag() {
    return leafOnlyFlag;
  }

  public void setLeafOnlyFlag(String leafOnlyFlag) {
    this.leafOnlyFlag = leafOnlyFlag;
  }

  public Long getDimensionDepthNum() {
    return dimensionDepthNum;
  }

  public void setDimensionDepthNum(Long dimensionDepthNum) {
    this.dimensionDepthNum = dimensionDepthNum;
  }

  public Long getDisplayOrderNum() {
    return displayOrderNum;
  }

  public void setDisplayOrderNum(Long displayOrderNum) {
    this.displayOrderNum = displayOrderNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionHierarchyValue that = (DimensionHierarchyValue) o;
    return Objects.equals(id, that.id) && Objects
        .equals(dimensionHierarchyCd, that.dimensionHierarchyCd) && Objects
        .equals(dimensionHierarchyName, that.dimensionHierarchyName) && Objects
        .equals(dimensionValueId, that.dimensionValueId) && Objects
        .equals(dimensionValueName, that.dimensionValueName) && Objects
        .equals(dimensionValuePid, that.dimensionValuePid) && Objects
        .equals(configureFlag, that.configureFlag) && Objects
        .equals(leafOnlyFlag, that.leafOnlyFlag) && Objects
        .equals(dimensionDepthNum, that.dimensionDepthNum) && Objects
        .equals(displayOrderNum, that.displayOrderNum);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimensionHierarchyCd, dimensionHierarchyName, dimensionValueId,
            dimensionValueName,
            dimensionValuePid, configureFlag, leafOnlyFlag, dimensionDepthNum, displayOrderNum);
  }
}
