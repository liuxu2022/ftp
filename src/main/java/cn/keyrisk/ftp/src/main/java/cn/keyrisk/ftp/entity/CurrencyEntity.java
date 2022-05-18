package cn.keyrisk.ftp.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
public class CurrencyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /** 币种代码 */
  @Column
  private String isoCurrencyCd;

  /** 币种名称 */
  @Column
  private String currencyName;

  /** 报告币状态;是否报告币 */
  @Column
  private String reportingFlg;

  /** 币种状态代码 */
  @Column
  private Boolean currencyStatusCd;

  public CurrencyEntity() {
  }

  public CurrencyEntity(String isoCurrencyCd, String currencyName, String reportingFlg,
      Boolean currencyStatusCd) {
    this.isoCurrencyCd = isoCurrencyCd;
    this.currencyName = currencyName;
    this.reportingFlg = reportingFlg;
    this.currencyStatusCd = currencyStatusCd;
  }

  public String getIsoCurrencyCd() {
    return isoCurrencyCd;
  }

  public void setIsoCurrencyCd(String isoCurrencyCd) {
    this.isoCurrencyCd = isoCurrencyCd;
  }

  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public String getReportingFlg() {
    return reportingFlg;
  }

  public void setReportingFlg(String reportingFlg) {
    this.reportingFlg = reportingFlg;
  }

  public Boolean getCurrencyStatusCd() {
    return currencyStatusCd;
  }

  public void setCurrencyStatusCd(Boolean currencyStatusCd) {
    this.currencyStatusCd = currencyStatusCd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyEntity currency = (CurrencyEntity) o;
    return Objects.equals(isoCurrencyCd, currency.isoCurrencyCd) && Objects
        .equals(currencyName, currency.currencyName) && Objects
        .equals(reportingFlg, currency.reportingFlg) && Objects
        .equals(currencyStatusCd, currency.currencyStatusCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCurrencyCd, currencyName, reportingFlg, currencyStatusCd);
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
