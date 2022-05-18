package cn.keyrisk.ftp.entity;

import java.util.Objects;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DimensionValue")
@Cacheable
public class DimensionValueEntity {

  @Id
  @GeneratedValue(generator = "dimension_value_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "dimension_value_id", sequenceName = "seq_dimension_value_id", allocationSize = 1)
  private Long id;

  private String dimensionId;

  private String dimensionValueId;

  private String dimensionValueName;

  private String leafOnlyFlag;

  private String enabledFlag;

  public DimensionValueEntity() {
  }

  public DimensionValueEntity(Long id, String dimensionId, String dimensionValueId,
      String dimensionValueName, String leafOnlyFlag, String enabledFlag) {
    this.id = id;
    this.dimensionId = dimensionId;
    this.dimensionValueId = dimensionValueId;
    this.dimensionValueName = dimensionValueName;
    this.leafOnlyFlag = leafOnlyFlag;
    this.enabledFlag = enabledFlag;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDimensionId() {
    return dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
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

  public String getLeafOnlyFlag() {
    return leafOnlyFlag;
  }

  public void setLeafOnlyFlag(String leafOnlyFlag) {
    this.leafOnlyFlag = leafOnlyFlag;
  }

  public String getEnabledFlag() {
    return enabledFlag;
  }

  public void setEnabledFlag(String enabledFlag) {
    this.enabledFlag = enabledFlag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionValueEntity that = (DimensionValueEntity) o;
    return Objects.equals(id, that.id) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(dimensionValueId, that.dimensionValueId) && Objects
        .equals(dimensionValueName, that.dimensionValueName) && Objects
        .equals(leafOnlyFlag, that.leafOnlyFlag) && Objects
        .equals(enabledFlag, that.enabledFlag);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimensionId, dimensionValueId, dimensionValueName, leafOnlyFlag, enabledFlag);
  }
}
