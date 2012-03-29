--create tables
create table Z_PARENT(id number(10) not null, name varchar2(50), primary key(id));
create table Z_CHILD(id number(10) not null, name varchar2(50), parent_id number(10) not null, primary key(id));
alter table Z_CHILD add constraint z_child_fk1 foreign key(parent_id) references Z_PARENT(id) on delete cascade;	

--seed data
insert into z_parent(id, name) values(1, 'parent');
insert into z_child(id,name,parent_id) values(1, 'c1', 1);
insert into z_child(id,name,parent_id) values(2, 'c2', 1);

