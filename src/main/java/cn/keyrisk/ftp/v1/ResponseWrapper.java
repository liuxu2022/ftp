package cn.keyrisk.ftp.v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.springframework.data.domain.Page;

public class ResponseWrapper<T> {



  public static class Builder<T> {

    private int code = 0;
    private String message = "ok";
    private List<T> rows;
    private T single;
    private boolean multiple = true;
    private boolean page = false;
    private long total;

    public Builder<T> code(int code) {
      this.code = 0;
      return this;
    }

    public Builder<T> message(String message) {
      this.message = message;
      return this;
    }

    public Builder<T> data(List<T> data) {
      this.rows = data;
      return this;
    }

    public Builder<T> data(T data) {
      this.single = data;
      this.multiple = false;
      return this;
    }

    public ResponseWrapper<T> build() {
      if (multiple && page) {
        return new ResponseWrapper<>(code, message, rows, (int) total);
      } else if (multiple) {
        return new ResponseWrapper<>(code, message, rows);
      } else {
        return new ResponseWrapper<>(code, message, single);
      }
    }

    public ResponseWrapper<T> build(List<T> data) {
      data(data);
      return build();
    }

    public ResponseWrapper<T> build(Page<T> data) {
      this.data(data.getContent());
      this.page = true;
      this.total = data.getTotalElements();
      return build();
    }

    public ResponseWrapper<T> build(T data) {
      data(data);
      return build();
    }
  }

  public static <T> Builder<T> builder() {
    return new Builder<>();
  }

  public static <T> ResponseWrapper<T> notFound(String message) {
    return new ResponseWrapper<>(404, message);
  }

  public static <T> ResponseWrapper<T> empty() {
    return new ResponseWrapper<>(0, "OK", new ArrayList<>());
  }

  public static <T> ResponseWrapper<T> empty(int code, String message) {
    return new ResponseWrapper<>(code, message);
  }




  private final int code;
  private final String msg;
  private final T data;
  private final List<T> rows;
  private final Integer total;
  private final Integer size;

  public ResponseWrapper(int code, String msg, Collection<T> rows) {
    this(code, msg, rows == null ? Collections.emptyList() : new ArrayList<>(rows));
  }

  public ResponseWrapper(int code, String msg) {
    this(code, msg, null, null);
  }

  public ResponseWrapper(int code, String msg, T data) {
    this(code, msg, data, null, null, null);
  }

  public ResponseWrapper(Collection<T> rows) {
    this(0, "OK", rows);
  }

  public ResponseWrapper(T data) {
    this(0, "OK", data);
  }

  public ResponseWrapper(int code, String msg, List<T> rows) {
    this(code, msg, rows, rows == null ? 0 : rows.size());
  }

  public ResponseWrapper(int code, String msg, List<T> rows, Integer total) {
    this(code, msg, null, rows, rows == null ? null : rows.size(), total);
  }

  public ResponseWrapper(int code, String msg, T data, List<T> rows, Integer size, Integer total) {
    this.code = code;
    this.msg = msg;
    this.data = data;
    this.rows = rows;
    this.size = size;
    this.total = total;
  }

  public int getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public T getData() {
    return data;
  }

  public List<T> getRows() {
    return rows;
  }

  public Integer getTotal() {
    return total;
  }

  public Integer getSize() {
    return size;
  }
}