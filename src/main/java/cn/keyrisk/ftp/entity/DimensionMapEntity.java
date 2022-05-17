package cn.keyrisk.ftp.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DimensionMap")
public class DimensionMapEntity {

  @Id
  @GeneratedValue(generator = "dimension_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "dimension_id", sequenceName = "seq_dimension_id", allocationSize = 1)

  Long id;

  /** 维度映射编码 */
  private String dimMapId;

  /** 维度映射名称 */
  private String dimMapName;

  /** 维度映射描述 */
  private String dimMapDesc;

  /** 维度编码 */
  private String dimensionId;

  /** 维度树编码 */
  private String dimensionHierarchyId;

  /** 法人维度值 */
  private String legalEntityId;

  /** 是否已配置 */
  private String configureFlag;

  public DimensionMapEntity(Long id, String dimMapId, String dimMapName, String dimMapDesc,
      String dimensionId, String dimensionHierarchyId, String legalEntityId,
      String configureFlag) {
    this.id = id;
    this.dimMapId = dimMapId;
    this.dimMapName = dimMapName;
    this.dimMapDesc = dimMapDesc;
    this.dimensionId = dimensionId;
    this.dimensionHierarchyId = dimensionHierarchyId;
    this.legalEntityId = legalEntityId;
    this.configureFlag = configureFlag;
  }

  public DimensionMapEntity() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDimMapId() {
    return dimMapId;
  }

  public void setDimMapId(String dimMapId) {
    this.dimMapId = dimMapId;
  }

  public String getDimMapName() {
    return dimMapName;
  }

  public void setDimMapName(String dimMapName) {
    this.dimMapName = dimMapName;
  }

  public String getDimMapDesc() {
    return dimMapDesc;
  }

  public void setDimMapDesc(String dimMapDesc) {
    this.dimMapDesc = dimMapDesc;
  }

  public String getDimensionId() {
    return dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
  }

  public String getDimensionHierarchyId() {
    return dimensionHierarchyId;
  }

  public void setDimensionHierarchyId(String dimensionHierarchyId) {
    this.dimensionHierarchyId = dimensionHierarchyId;
  }

  public String getLegalEntityId() {
    return legalEntityId;
  }

  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
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
    DimensionMapEntity that = (DimensionMapEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(dimMapId, that.dimMapId)
        && Objects.equals(dimMapName, that.dimMapName) && Objects
        .equals(dimMapDesc, that.dimMapDesc) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(dimensionHierarchyId, that.dimensionHierarchyId) && Objects
        .equals(legalEntityId, that.legalEntityId) && Objects
        .equals(configureFlag, that.configureFlag);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimMapId, dimMapName, dimMapDesc, dimensionId, dimensionHierarchyId,
            legalEntityId,
            configureFlag);
  }
}
