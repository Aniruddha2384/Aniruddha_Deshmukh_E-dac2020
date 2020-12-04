create database assignment;
use assignment;
create table book(
book_no int(6) primary key,
book_name varchar(30),
author_name varchar(30),
cost int(7),

category char(10)


);

insert into book values(101,"Let us C","Denis Ritchie", 450,"System");
insert into book values(102,"Oracle Complete Ref","Loni", 550,"Database");
insert into book values(103,"Mastering Sql","Loni", 250,"Database");
insert into book values(104,"Pl Sql-ref","soottuman", 750,"Database");

select * from book;
desc book;
update book
set 
cost=300
where
book_no=103;
