package com.liang.entity;

public class ContractDetail {
	private int ctdId;
	private String high;
	private String middle;
	private String low;
	
	public int getCtdId() {
		return ctdId;
	}

	public void setCtdId(int ctdId) {
		this.ctdId = ctdId;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	@Override
	public String toString() {
		return "ContractDetail [ctdId=" + ctdId + ", high=" + high + ", middle=" + middle + ", low=" + low + "]";
	}
}
