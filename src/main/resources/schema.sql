DROP TABLE t_contacts IF EXISTS;
create table t_contacts
(
	id integer auto_increment,
	lastname varchar(50),
	firstname varchar(50),
	phonenumber varchar(50),
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