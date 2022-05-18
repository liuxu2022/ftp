package cn.keyrisk.ftp.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Dimension")
public class DimensionEntity {

  @Id
  @GeneratedValue(generator = "dimension_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "dimension_id", sequenceName = "seq_dimension_id", allocationSize = 1)
  private Long id;
  private String dimensionId;



  private String dimensionName;



  private String dimensionColumn;


  private String dimensionColumnName;


  private String isInternal;


  private String isEditable;


  private String dimensionDesc;



  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
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

  public String getDimensionId() {
    return dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionEntity that = (DimensionEntity) o;
    return Objects.equals(id, that.id) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(dimensionName, that.dimensionName) && Objects
        .equals(dimensionColumn, that.dimensionColumn) && Objects
        .equals(dimensionColumnName, that.dimensionColumnName) && Objects
        .equals(isInternal, that.isInternal) && Objects.equals(isEditable, that.isEditable)
        && Objects.equals(dimensionDesc, that.dimensionDesc);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, dimensionId, dimensionName, dimensionColumn, dimensionColumnName, isInternal,
            isEditable, dimensionDesc);
  }
}
