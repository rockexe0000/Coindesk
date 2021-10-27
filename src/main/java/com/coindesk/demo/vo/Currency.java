package com.coindesk.demo.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Currency implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1541593018538061521L;
	private String code;
	private String description;
	private String rate;
	private BigDecimal rate_float;
	private String symbol;

	@Override
	public String toString() {
		return "Currency [code=" + code + ", description=" + description + ", rate=" + rate + ", rate_float="
				+ rate_float + ", symbol=" + symbol + "]";
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

	public BigDecimal getRate_float() {
		return rate_float;
	}

	public void setRate_float(BigDecimal rate_float) {
		this.rate_float = rate_float;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
