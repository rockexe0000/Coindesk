package com.coindesk.demo.vo;

import java.math.BigDecimal;

public class Price {
  private String code;
  private String name;
  private BigDecimal rate;

  @Override
  public String toString() {
    return "Prices [code=" + code + ", name=" + name + ", rate=" + rate + "]";
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }
}
