package cn.keyrisk.ftp.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DimensionHierarchy")
public class DimensionHierarchyEntity {

  @Id
  @GeneratedValue(generator = "dimension_hierarchy_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "dimension_hierarchy_id", sequenceName = "seq_dimension_hierarchy_id", allocationSize = 1)
  private Long id;

  private String dimensionHierarchyId;

  private String dimensionHierarchyName;

  private String legalEntityId;

  private String dimensionId;

  private String dimensionName;

  private String dimensionHierarchyDesc;

  private String displayDimensionId;

  private String configureFlag;


  public DimensionHierarchyEntity() {
  }

  public DimensionHierarchyEntity(String dimensionHierarchyId,
      String dimensionHierarchyName, String legalEntityId, String dimensionId,
      String dimensionName, String dimensionHierarchyDesc, String displayDimensionId,
      String configureFlag) {
    this.dimensionHierarchyId = dimensionHierarchyId;
    this.dimensionHierarchyName = dimensionHierarchyName;
    this.legalEntityId = legalEntityId;
    this.dimensionId = dimensionId;
    this.dimensionName = dimensionName;
    this.dimensionHierarchyDesc = dimensionHierarchyDesc;
    this.displayDimensionId = displayDimensionId;
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
    DimensionHierarchyEntity that = (DimensionHierarchyEntity) o;
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

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
