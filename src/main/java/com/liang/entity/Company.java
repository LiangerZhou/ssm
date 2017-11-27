package com.liang.entity;

import java.io.Serializable;

/**
 * 公司信息实体类
 * 注解方式配置对应数据表
 * @author Zhou Liang
 * @Date 2017年7月14日 上午11:25:12
 */
public class Company implements Serializable{
	private static final long serialVersionUID = 1L;

	private long cid; //id
	private String cname; //公司简称
	private String fullName; //公司全称

}
