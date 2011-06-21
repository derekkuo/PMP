drop database if exists tarena;
create database tarena charset utf8;
use tarena;

DROP TABLE IF EXISTS t_dept;
CREATE TABLE t_dept (
	id int(12) NOT NULL auto_increment,
	code varchar(50) NOT NULL,
	name varchar(50) NOT NULL,
	PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user (
	id int(12) NOT NULL auto_increment,
	name varchar(50) NOT NULL,
	password varchar(50) NOT NULL,
	age int(3) NOT NULL,
	birthday date NOT NULL,
	dept_id int(12) NOT NULL,
	has_deleted int(1) NOT NULL default '0',
	PRIMARY KEY  (id),
	CONSTRAINT FK_DEPT_ID FOREIGN KEY(dept_id) REFERENCES t_dept(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into t_dept VALUES(1, "dept01", "zixun");
insert into t_dept VALUES(2, "dept02", "xiangmu");
insert into t_user VALUES(1, "zhangsan", "zhangsan", 20, "1991-1-1", 1, 0);
insert into t_user VALUES(2, "lisi", "lisi", 21, "1990-1-1", 1, 0);
