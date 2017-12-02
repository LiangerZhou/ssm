package com.liang.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 外援信息实体类
 * 注解方式配置对应数据表
 * @author Zhou Liang
 * @Date 2017年7月14日 上午11:25:12
 */
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;

	private long eid; //id
	private String ename; //姓名
	private String sex; //性别
	private Date joinDate; //入职日期
	private Date leftDate; //离职日期
	private String elevel; //外援等级   对应公司和钱款
	private String duty; //在职状态
	private String idCard; //身份证号
	private String telephone;//联系方式
	private String workplace; //工作地点
	private String netAccount; //网络账号
	private String netRole; //网络角色,开发、测试之类
	private int Price;//单价
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getLeftDate() {
		return leftDate;
	}
	public void setLeftDate(Date leftDate) {
		this.leftDate = leftDate;
	}
	public String getElevel() {
		return elevel;
	}
	public void setElevel(String elevel) {
		this.elevel = elevel;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public String getNetAccount() {
		return netAccount;
	}
	public void setNetAccount(String netAccount) {
		this.netAccount = netAccount;
	}
	public String getNetRole() {
		return netRole;
	}
	public void setNetRole(String netRole) {
		this.netRole = netRole;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", joinDate=" + joinDate + ", leftDate="
				+ leftDate + ", elevel=" + elevel + ", duty=" + duty + ", idCard=" + idCard + ", telephone=" + telephone
				+ ", workplace=" + workplace + ", netAccount=" + netAccount + ", netRole=" + netRole + ", Price="
				+ Price + "]";
	}

}
