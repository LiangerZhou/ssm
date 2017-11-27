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

}
