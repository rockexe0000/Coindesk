package com.coindesk.demo.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bpi implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5500845956265323787L;
	private Currency usd;
	private Currency gbp;
	private Currency eur;
	
	@Override
	public String toString() {
		return "Bpi [usd=" + usd + ", gbp=" + gbp + ", eur=" + eur + "]";
	}

	@JsonProperty("USD")
	public Currency getUsd() {
		return usd;
	}

	public void setUsd(Currency usd) {
		this.usd = usd;
	}

	@JsonProperty("GBP")
	public Currency getGbp() {
		return gbp;
	}

	public void setGbp(Currency gbp) {
		this.gbp = gbp;
	}

	@JsonProperty("EUR")
	public Currency getEur() {
		return eur;
	}

	public void setEur(Currency eur) {
		this.eur = eur;
	}
}
