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
	

}
