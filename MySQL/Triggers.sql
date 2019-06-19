use db;
create table depsample (dep integer);
create table empsample (empid integer, dep integer);
create trigger befins before insert on empsample for each row 
insert into depsample values(new.dep);
insert into empsample values(3,3);
select* from depsample;

create trigger aftins after insert on empsample for each row 
insert into depsample values(new.dep);
insert into empsample values(2,2);
insert into empsample values(4,4);
insert into empsample values(5,5);
select* from depsample;

create trigger befdel before delete on empsample for each row 
delete from depsample where dep=old.dep;
delete from empsample where empid=3;
select* from depsample;
select * from empsample;

create trigger aftdel after delete on empsample for each row 
delete from depsample where dep=old.dep;
delete from empsample where empid=4;
select* from depsample;

create trigger befupd before update on empsample for each row 
update depsample set dep=new.dep where dep=old.dep;
update empsample set dep=3 where empid=5;
select* from depsample;

create trigger aftupd after update on empsample for each row 
update depsample set dep=new.dep where dep=old.dep;
update empsample set dep=5 where empid=3;
select* from depsample;