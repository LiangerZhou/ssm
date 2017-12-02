package com.liang.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目任务实体类，即工作内容摘要
 * 注解方式配置对应数据表
 * @author Zhou Liang
 * @Date 2017年7月14日 上午11:25:12
 */
public class Task implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long taskId;//任务ID
	private String taskName;//任务名称
	private Date creTime;//任务开始时间
	private Date endTime;//计划完成时间
	private Date realEtime;//实际完成时间
	private int workDays;//工作量
	private int workRatio;//工作量占比
	private int workEffect;//工作效率，总分30分
	private int workQua;//工作质量，总分40分
	private int workNorm;//流程规范执行情况，总分30分
	private int workScore;//工作任务考核得分
	private int convertScore;//工作任务考核得分折算	
	private String budgetName;//归属预算名称,项目名
	private String department;//归属科室/业务线
	private String chargeMan;//服务质量评审人
	private String workType;//工作类型
	private String remark;//备注
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getCreTime() {
		return creTime;
	}
	public void setCreTime(Date creTime) {
		this.creTime = creTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getRealEtime() {
		return realEtime;
	}
	public void setRealEtime(Date realEtime) {
		this.realEtime = realEtime;
	}
	public int getWorkDays() {
		return workDays;
	}
	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	public int getWorkRatio() {
		return workRatio;
	}
	public void setWorkRatio(int workRatio) {
		this.workRatio = workRatio;
	}
	public int getWorkEffect() {
		return workEffect;
	}
	public void setWorkEffect(int workEffect) {
		this.workEffect = workEffect;
	}
	public int getWorkQua() {
		return workQua;
	}
	public void setWorkQua(int workQua) {
		this.workQua = workQua;
	}
	public int getWorkNorm() {
		return workNorm;
	}
	public void setWorkNorm(int workNorm) {
		this.workNorm = workNorm;
	}
	public int getWorkScore() {
		return workScore;
	}
	public void setWorkScore(int workScore) {
		this.workScore = workScore;
	}
	public int getConvertScore() {
		return convertScore;
	}
	public void setConvertScore(int convertScore) {
		this.convertScore = convertScore;
	}
	public String getBudgetName() {
		return budgetName;
	}
	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getChargeMan() {
		return chargeMan;
	}
	public void setChargeMan(String chargeMan) {
		this.chargeMan = chargeMan;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", creTime=" + creTime + ", endTime=" + endTime
				+ ", realEtime=" + realEtime + ", workDays=" + workDays + ", workRatio=" + workRatio + ", workEffect="
				+ workEffect + ", workQua=" + workQua + ", workNorm=" + workNorm + ", workScore=" + workScore
				+ ", convertScore=" + convertScore + ", budgetName=" + budgetName + ", department=" + department
				+ ", chargeMan=" + chargeMan + ", workType=" + workType + ", remark=" + remark + "]";
	}
	

}
