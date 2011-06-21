-- drop database if exists tarena;
-- create database tarena charset utf8;
use tarena;

DROP TABLE IF EXISTS title;
CREATE TABLE title (
	id int(20) NOT NULL auto_increment,

	code varchar(50) NOT NULL, -- 职位编码
	name varchar(50) NOT NULL, -- 职位名称
	description varchar(50), -- 职位描述
	
	PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	id int(20) NOT NULL auto_increment,
	login_name varchar(50) NOT NULL,
	password varchar(50) NOT NULL,
	
	name varchar(50),
	gender varchar(1), -- 性别，F女     M男 
	birthday date, -- 出生日期
	place_of_birth varchar(50), -- 出生地点
	native_province varchar(50), -- 籍贯
	ethnic_group varchar(50), -- 民族
	id_number varchar(50), -- 身份证号码
	
	mobile_phone varchar(50), -- 移动电话
	personal_email varchar(50), -- 私人邮箱
	qq varchar(50),
	msn varchar(50),
	
	graduated_university varchar(50), -- 毕业院校
	educational_background varchar(50), -- 学历
	graduation_date date, -- 毕业时间 
	working_experience varchar(50), -- 工作经验
	
	employee_no varchar(50), -- 员工号
	has_left int(1), -- 默认在职：0， 离职：1
	employment_date date, -- 入职日期
	office_phone varchar(50), -- 办公电话
	office_email varchar(50), -- 办公邮箱
	
	title_id int(20), -- 职位类型
	
	PRIMARY KEY  (id),
	CONSTRAINT FK_TITLE_ID FOREIGN KEY(title_id) REFERENCES title(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `title` VALUES ('1', 'zj', '品质保障部总监', '负责管理全国项目经理');
INSERT INTO `title` VALUES ('2', 'fzr', '项目部负责人', '');
INSERT INTO `title` VALUES ('3', 'zz', '项目部组长', null);
INSERT INTO `title` VALUES ('4', 'xmjl', '项目经理', null);

INSERT INTO `employee` VALUES ('1', 'jiangzerui', 'jiangzerui', '蒋泽瑞', 'M', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `employee` VALUES ('2', 'guodaxi', 'guodaxi', '郭大喜', 'M', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2');