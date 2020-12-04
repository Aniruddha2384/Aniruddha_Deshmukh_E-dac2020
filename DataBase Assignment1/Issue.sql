use assignment;
create table Issue(
Lib_Issue_Id int(10),
Book_No int(6),
Member_id int(5),
Issue_date date,
return_date date);
insert into Issue values(7001,101,1,"2010/12/06","2010/12/25");
insert into Issue values(7002,102,2,"2011/06/12","2011/12/25");
insert into Issue values(7003,104,1,"2011/01/06","2011/12/25");
insert into Issue values(7004,101,1,"2011/09/06","2011/12/25");
insert into Issue values(7005,104,2,"2011/11/06","2011/12/25");
insert into Issue values(7006,101,3,"2011/02/06","2011/12/25");
select *from Issue;
drop tables Issue;
create table Issue(
Lib_Issue_Id int(10),
Book_No int(6),
Member_id int(5),
Issue_date date,
return_date date);
insert into Issue(Lib_Issue_Id ,Book_No ,Member_id ,Issue_date ) values(7001,101,1,"2010/12/06");
insert into Issue(Lib_Issue_Id ,Book_No ,Member_id ,Issue_date ) values(7002,102,2,"2011/06/12");
insert into Issue(Lib_Issue_Id ,Book_No ,Member_id ,Issue_date ) values(7003,104,1,"2011/01/06");
insert into Issue(Lib_Issue_Id ,Book_No ,Member_id ,Issue_date ) values(7004,101,1,"2011/09/06");
insert into Issue(Lib_Issue_Id ,Book_No ,Member_id ,Issue_date ) values(7005,104,2,"2011/11/06");
insert into Issue(Lib_Issue_Id ,Book_No ,Member_id ,Issue_date ) values(7006,101,3,"2011/02/06");
select * from Issue;