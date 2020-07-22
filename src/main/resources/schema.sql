DROP TABLE t_contact IF EXISTS;
create table t_contact
(
	id integer auto_increment,
	lastName VARCHAR(50),
	firstName VARCHAR(50),
	phoneNumber VARCHAR(50),
	adress VARCHAR(50),
	email VARCHAR(50),
	primary key(id)
);

DROP TABLE t_group IF EXISTS;
create table t_group
(
	id integer auto_increment,
	group_name VARCHAR(50),
	number_of_contacts integer,
	primary key(id)
);