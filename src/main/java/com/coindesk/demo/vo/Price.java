package com.coindesk.demo.vo;

import java.math.BigDecimal;

public class Price {
  // private Integer id;
  private String code;
  private String name;
  private BigDecimal price;

  @Override
  public String toString() {
    return "Prices [code=" + code + ", name=" + name + ", price=" + price + "]";
  }

  // public Integer getId() {
  // return id;
  // }

  // public void setId(Integer id) {
  // this.id = id;
  // }

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

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
