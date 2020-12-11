create database assignments5;
use assignments5;


delimiter $$
create procedure Q1(in var1 int, in var2 int)
begin
select var1+var2 "Sum";
select var1-var2 "Subtract";
select var1*var2  "Multiplay";
select var1/var2  "Divide";
end$$
call Q1(20,10);


delimiter $$
create procedure Q2(in str1 varchar(30))
begin
select reverse(str1);
end $$
call Q2('database');


Create table EMP ( EMPNO numeric(4) not null, 
ENAME varchar(30) not null, 
JOB varchar(10), 
MGR numeric(4), 
HIREDATE date, SAL numeric(7,2),
 DEPTNO numeric(2) ); 
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1006,  'Pooja',  'MANAGER'  ,     null    , '2000-02-18' ,6000, 10 );

Create table dept (dno numeric(4) not null, dname varchar(10) not null,area varchar(30));
Insert into dept(dno,dname,area) values(10,'Store','Mumbai');
Insert into dept(dno,dname,area) values(20,'Purchase','Mumbai');
Insert into dept(dno,dname,area) values(30,'Store', 'Delhi');
Insert into dept(dno,dname,area) values(40,'Marketing','Pune');
Insert into dept(dno,dname,area) values(50,'Finance','Delhi');
Insert into dept(dno,dname,area) values(60,'Accounts','Mumbai');

delimiter $$
create procedure Q3()
begin
select EMPNO, ENAME, sal from emp order by sal desc limit 5;
end $$
call Q3();

drop procedure Q3;

delimiter $$
create procedure Q4()
begin
create table if not exists emp_test(
e_id int,
e_name varchar(10),
e_joining_date date);

end $$
call Q4();
desc emp_test;
drop procedure Q4;

Delimiter $$
create procedure Q5(in dno int ,in dname varchar(10),in area varchar(10))
begin
insert into dept values (dno,dname,area);
end $$
call Q5(60,'Education','pune');
select * from dept;


Delimiter $$
create procedure Q6(in x int)
begin
declare square,cubes int;
set square = power(x,2);
set cubes=power(x,3);
select x,square,cubes;
end $$
call Q6(10);

delimiter $$
create procedure Q7(out x int)
begin
set x=8;
end $$
call Q7(@xx);
select @xx;

delimiter $$
create procedure Q8(inout x1 int, in x int)
begin
set x1=x1+x;
end $$   SET@Q8=15;
call Q8(@Q8,20);
select @Q8;

drop procedure Q8





