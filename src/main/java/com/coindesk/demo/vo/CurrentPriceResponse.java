package com.coindesk.demo.vo;

import java.io.Serializable;

public class CurrentPriceResponse implements Serializable {

	private static final long serialVersionUID = 4667798315791322542L;

	private Bpi bpi;
	private Time time;
	private String chartName;
	private String disclaimer;

	@Override
	public String toString() {
		return "CurrentPriceResponse [bpi=" + bpi + ", time=" + time + ", chartName=" + chartName + ", disclaimer="
				+ disclaimer + "]";
	}

	public Bpi getBpi() {
		return bpi;
	}

	public void setBpi(Bpi bpi) {
		this.bpi = bpi;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
