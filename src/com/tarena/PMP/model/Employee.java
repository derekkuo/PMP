package com.tarena.PMP.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{

	private Integer id;
	private String loginName;
	private String password;
	
	private String name;
	private Character gender; //性别，F女     M男 
	private Date birthday; //出生日期
	private String placeOfBirth; //出生地点
	private String nativeProvince; //籍贯
	private String ethnicGroup; //民族
	private String IDNumber; //身份证号码
	
	private String mobilePhone; //移动电话
	private String personalEmail; //私人邮箱
	private String qq;
	private String msn;
	
	private String graduatedUniversity; //毕业院校
	private String educationalBackground; //学历
	private Date graduationDate; //毕业时间 
	private String workingExperience; //工作经验
	
	private String employeeNo; //员工号
	private Integer hasLeft; //默认在职：0， 离职：1
	private Date employmentDate; //入职日期
	private String officePhone; //办公电话
	private String officeEmail; //办公邮箱

	private Title title; //职位类型
	//private Set<Integer> jobEvaluation; //工作评价，可多方位对员工进行评价并备案

	public Employee() {
	}
	
	public Employee(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}

	public Employee(String loginName, String password, Title title) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNativeProvince() {
		return nativeProvince;
	}

	public void setNativeProvince(String nativeProvince) {
		this.nativeProvince = nativeProvince;
	}

	public String getEthnicGroup() {
		return ethnicGroup;
	}

	public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getGraduatedUniversity() {
		return graduatedUniversity;
	}

	public void setGraduatedUniversity(String graduatedUniversity) {
		this.graduatedUniversity = graduatedUniversity;
	}

	public String getEducationalBackground() {
		return educationalBackground;
	}

	public void setEducationalBackground(String educationalBackground) {
		this.educationalBackground = educationalBackground;
	}

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(String workingExperience) {
		this.workingExperience = workingExperience;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Integer getHasLeft() {
		return hasLeft;
	}

	public void setHasLeft(Integer hasLeft) {
		this.hasLeft = hasLeft;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getOfficeEmail() {
		return officeEmail;
	}

	public void setOfficeEmail(String officeEmail) {
		this.officeEmail = officeEmail;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	
	
}