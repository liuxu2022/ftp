package cn.keyrisk.ftp.v1;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class DimensionValue {

  @Id
  @GeneratedValue(generator = "curve_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "curve_id", sequenceName = "seq_curve_id", allocationSize = 1)
  private Long id;

  private String dimensionId;


  private String dimensionName;


  private String dimensionValueId;


  private String dimensionValueName;
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionValue that = (DimensionValue) o;
    return Objects.equals(id, that.id) && Objects
        .equals(dimensionId, that.dimensionId) && Objects
        .equals(dimensionName, that.dimensionName) && Objects
        .equals(dimensionValueId, that.dimensionValueId) && Objects
        .equals(dimensionValueName, that.dimensionValueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dimensionId, dimensionName, dimensionValueId, dimensionValueName);
  }



  public DimensionValue(Long id, String dimensionId, String dimensionName,
      String dimensionValueId,
      String dimensionValueName) {
    this.id = id;
    this.dimensionId = dimensionId;
    this.dimensionName = dimensionName;
    this.dimensionValueId = dimensionValueId;
    this.dimensionValueName = dimensionValueName;
  }

  public DimensionValue() {
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

  public String getDimensionName() {
    return dimensionName;
  }

  public void setDimensionName(String dimensionName) {
    this.dimensionName = dimensionName;
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

}
