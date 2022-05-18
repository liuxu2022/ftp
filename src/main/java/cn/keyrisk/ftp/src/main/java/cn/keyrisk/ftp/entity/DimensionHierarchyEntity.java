package cn.keyrisk.ftp.entity;

import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "DimensionHierarchy")
public class DimensionHierarchyEntity {

  @Id
  @GeneratedValue(generator = "dimension_hierarchy_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "dimension_hierarchy_id", sequenceName = "seq_dimension_hierarchy_id", allocationSize = 1)
  private Long id;

  private String dimensionHierarchyCd;

  private String dimensionHierarchyName;

  private String dimensionHierarchyDesc;

  private String dimensionId;

  private String configureFlag;

  @OrderColumn
  @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
  @OneToMany(mappedBy = "dimensionHierarchy", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  private List<DimensionHierarchyValueEntity> dimensionHierarchyValueEntityList;

  public List<DimensionHierarchyValueEntity> getDimensionHierarchyValueEntityList() {
    return dimensionHierarchyValueEntityList;
  }

  public void setDimensionHierarchyValueEntityList(
      List<DimensionHierarchyValueEntity> dimensionHierarchyValueEntityList) {
    this.dimensionHierarchyValueEntityList = dimensionHierarchyValueEntityList;
  }

  public DimensionHierarchyEntity() {
  }

  public DimensionHierarchyEntity(Long id, String dimensionHierarchyCd,
      String dimensionHierarchyName, String dimensionHierarchyDesc, String dimensionId,
      String configureFlag,
      List<DimensionHierarchyValueEntity> dimensionHierarchyValueEntityList) {
    this.id = id;
    this.dimensionHierarchyCd = dimensionHierarchyCd;
    this.dimensionHierarchyName = dimensionHierarchyName;
    this.dimensionHierarchyDesc = dimensionHierarchyDesc;
    this.dimensionId = dimensionId;
    this.configureFlag = configureFlag;
    this.dimensionHierarchyValueEntityList = dimensionHierarchyValueEntityList;
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
    DimensionHierarchyEntity that = (DimensionHierarchyEntity) o;
    return Objects.equals(id, that.id) && Objects
        .equals(dimensionHierarchyCd, that.dimensionHierarchyCd) && Objects
        .equals(dimensionHierarchyName, that.dimensionHierarchyName) && Objects
        .equals(dimensionHierarchyDesc, that.dimensionHierarchyDesc) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(configureFlag, that.configureFlag) && Objects
        .equals(dimensionHierarchyValueEntityList, that.dimensionHierarchyValueEntityList);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimensionHierarchyCd, dimensionHierarchyName, dimensionHierarchyDesc, dimensionId,
            configureFlag, dimensionHierarchyValueEntityList);
  }
}
