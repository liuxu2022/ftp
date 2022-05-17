package cn.keyrisk.ftp.v1;

public class CurrencyBatchPartialUpdateRequest {
  private Long[] ids;

  private Currency data;


  public Long[] getIds() {
    return ids;
  }

  public void setIds(Long[] ids) {
    this.ids = ids;
  }

  public Currency getData() {
    return data;
  }

  public void setData(Currency data) {
    this.data = data;
  }
}
