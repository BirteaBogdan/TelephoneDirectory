insert into t_group (groupname) values ('Family');
insert into t_group (groupname) values ('Friends');
insert into t_group (groupname) values ('Work');

insert into t_contact (id, lastName, firstName, phoneNumber, adress, email, idgroup) values (1,'Popescu', 'Andrei', '0711111111', 'Str.Cocorului, Nr.23','popescu.andrei@yahoo.com',1);
insert into t_contact (id, lastName, firstName, phoneNumber, adress, email, idgroup) values (2,'Georgescu', 'Andreea', '0755555555', 'Str.Dorului, Nr.33','georgescu.andreea@yahoo.com',2);
insert into t_contact (id, lastName, firstName, phoneNumber, adress, email, idgroup) values (3,'Ionescu', 'Ion', '0722222222', 'Str.Norului, Nr.12', 'ionescu.ion@yahoo.com',1);
insert into t_contact (id, lastName, firstName, phoneNumber, adress, email, idgroup) values (4,'Ionescu', 'Cristian', '0733333333', 'Str.Lunga, Nr.6', 'ionescu.cristian@yahoo.com',3);