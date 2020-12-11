create database assignments4;
use assignments4;
create table Employee
(
empid int (5) not null primary key,
emp_name varchar(30),
dept_id int(5),
salary int(5),
manager int(5),

constraint fk_dept foreign key (dept_id) references department(dept_id));

create table department(
dept_id int (5) primary key,
dept_name varchar(30)
);
desc employee;

desc department;
insert into employee values (1 ,'Arun',1,8000,4);
insert into employee values (2 ,'Kiran',1,7000,1);
insert into employee values (3 ,'Scott',1,3000,1);
insert into employee values (4 ,'Max',2,9000,null);
insert into employee values (5 ,'Jack',2,8000,4);
insert into employee values (6 ,'King',null,6000,1);
insert into department values(1	,	'Finance');
insert into department values(2	,	'Training');
insert into department values(3	,	'Marketing');
alter table employee add constraint fkk_emp foreign key (manager) references employee (empid);
select * from  employee;
desc employee;

select dept_name ,emp_name from department join employee on department.dept_id=employee.dept_id;
select * from employee join department on employee.dept_id= department.dept_id;
select * from employee  left join department on  employee.dept_id= department.dept_id;
select * from employee  right join department on  employee.dept_id= department.dept_id;
select emp_name , manager from employee ;
select emp_name ,dept_name from employee join department; 


create table emp1
(emp_no int(5),
    emp_name char);
    insert into emp1 values (1 ,'A');
      insert into emp1 values (2 ,'B');
        insert into emp1 values (3 ,'C');
        
        create table emp2
(emp_no int(5),
    emp_name char);
    
insert into emp2 values (1 ,'A');
insert into emp2 values (2 ,'B');
insert into emp2 values (4,'D');
insert into emp2 values(5,'E');
select * from emp1 union select * from emp2;

select * from employee where salary=(select salary from employee where emp_name='arun');
select * from employee where dept_id=(select dept_id from employee where emp_name= 'jack');
select emp_name from employee where salary in (select min(salary)from employee);
update employee 
set salary=15000  where emp_name ='max';



