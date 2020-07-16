DROP TABLE t_contacts IF EXISTS;
create table t_contacts
(
	id integer auto_increment,
	lastName varchar(50),
	firstName varchar(50),
	phoneNumber varchar(50),
	adress varchar(50),
	email varchar(50),
	primary key(id)
);