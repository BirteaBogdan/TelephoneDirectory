DROP TABLE t_contact IF EXISTS;

DROP TABLE t_group IF EXISTS;

create table t_group
(
	id integer auto_increment,
	groupname VARCHAR(50),
	primary key(id)
	
);

create table t_contact
(
	id integer auto_increment,
	lastName VARCHAR(50),
	firstName VARCHAR(50),
	phoneNumber VARCHAR(50),
	adress VARCHAR(50),
	email VARCHAR(50),
	idgroup integer,
	primary key(id),
	foreign key(idgroup) references t_group(id)
);