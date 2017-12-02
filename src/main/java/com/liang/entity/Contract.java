package com.liang.entity;

import java.io.Serializable;

public class Contract implements Serializable{
	private static final long serialVersionUID = 1L;

	private long ctid;
	private String contractName;//合同名称
	private String contractNum;//合同编号
	private String contractType;//合同类型
	private String contractSide;//合同方
	public long getCtid() {
		return ctid;
	}
	public void setCtid(long ctid) {
		this.ctid = ctid;
	}
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public String getContractNum() {
		return contractNum;
	}
	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getContractSide() {
		return contractSide;
	}
	public void setContractSide(String contractSide) {
		this.contractSide = contractSide;
	}
	@Override
	public String toString() {
		return "Contract [ctid=" + ctid + ", contractName=" + contractName + ", contractNum=" + contractNum
				+ ", contractType=" + contractType + ", contractSide=" + contractSide + "]";
	}
	
}
