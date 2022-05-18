package cn.keyrisk.ftp.v1;

import java.util.Objects;

public class Currency {


  private Long id;
  /** 币种代码 */
  private String isoCurrencyCd;

  /** 币种名称 */
  private String currencyName;

  /** 报告币状态;是否报告币 */
  private String reportingFlg;

  /** 币种状态代码 */
  private Boolean status;

  public Currency() {
  }

  public Currency(Long id, String isoCurrencyCd, String currencyName, String reportingFlg,
      Boolean status) {
    this.id = id;
    this.isoCurrencyCd = isoCurrencyCd;
    this.currencyName = currencyName;
    this.reportingFlg = reportingFlg;
    this.status = status;
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

  public Boolean getStatus() {
    return status;
  }

  public void setCurrencyStatusCd(Boolean status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(id, currency.id) && Objects
        .equals(isoCurrencyCd, currency.isoCurrencyCd) && Objects
        .equals(currencyName, currency.currencyName) && Objects
        .equals(reportingFlg, currency.reportingFlg) && Objects
        .equals(status, currency.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isoCurrencyCd, currencyName, reportingFlg, status);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
