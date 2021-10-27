package com.coindesk.demo.vo;

import java.io.Serializable;

public class Time implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5024968713478417220L;
	private String updated;
	private String updatedISO;
	private String updateduk;

	@Override
	public String toString() {
		return "Time [updated=" + updated + ", updatedISO=" + updatedISO + ", updateduk=" + updateduk + "]";
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getUpdatedISO() {
		return updatedISO;
	}

	public void setUpdatedISO(String updatedISO) {
		this.updatedISO = updatedISO;
	}

	public String getUpdateduk() {
		return updateduk;
	}

	public void setUpdateduk(String updateduk) {
		this.updateduk = updateduk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
