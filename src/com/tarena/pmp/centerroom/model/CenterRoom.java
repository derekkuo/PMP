package com.tarena.pmp.centerroom.model;

import java.util.HashSet;
import java.util.Set;

/*
 * 模型 分中心
 */
public class CenterRoom {
	
	private Integer id;
	private String name;

	private Integer zoneId; //教学区
	private Integer cityId; //所属城市

	private String siteAddress; //网站地址
	private String officePhone1; //办公电话1
	private String officePhone2; //办公电话2
	
	private String address; //通讯地址
	private String zipCode; //邮政编码
	private double longitude; //教学中心的经度
	private double latitude; //教学中心的纬度

}