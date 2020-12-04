use assignment;
create table Member(
Member_id int(5),
Member_Name varchar(30),
Member_address varchar(50),
Acc_open_date date,
Membership_type varchar(20),
Penalty_Amount int(7)
);
insert into Member values(1,"Richa Sharma","pune","2010/12/05","lifetime", 45);
insert into Member values(2,"Garima sen ","pune",curdate(),"Annual", 80);
insert into Member values(3,"Sushant Gupta ","pune","2015/5/12","Annual", 40);
insert into Member values(4,"Yuvraj singh ","Mumbai",curdate(),"lifetime", 80);
insert into Member values(5,"Kavita rao ","Hyadrabad","2019/4/25","Annual", 80);
select *from Member;
alter table Member
drop column Penalty_Amount;
select *from Member;
