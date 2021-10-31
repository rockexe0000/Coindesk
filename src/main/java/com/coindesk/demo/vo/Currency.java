package com.coindesk.demo.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency implements Serializable {

  private static final long serialVersionUID = 1L;

  private String code;
  private String description;
  private String rate;
  @JsonProperty("rate_float")
  private BigDecimal rateFloat;
  private String symbol;

  @Override
  public String toString() {
    return "Currency [code=" + code + ", description=" + description + ", rate=" + rate
        + ", rate_float=" + rateFloat + ", symbol=" + symbol + "]";
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public BigDecimal getRateFloat() {
    return rateFloat;
  }

  public void setRateFloat(BigDecimal rateFloat) {
    this.rateFloat = rateFloat;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

}
