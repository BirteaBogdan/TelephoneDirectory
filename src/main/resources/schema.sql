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

DROP TABLE t_groups IF EXISTS;
create table t_groups
(
	id integer auto_increment,
	group_name varchar(50),
	number_of_contacts integer,
	primary key(id)
);