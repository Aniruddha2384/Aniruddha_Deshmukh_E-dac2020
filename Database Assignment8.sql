create database Assignments8;
use assignments8;
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

select emp_name from employee where emp_name regexp '^sc';
select emp_name from employee where emp_name regexp 'ng$';
select dept_name from department where dept_name regexp 'io|ea';
select emp_name from employee where emp_name regexp '[sd]';




create table tutorial(
id INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY, 
title VARCHAR(200), 
description TEXT, 
FULLTEXT(title,description)
) ;

INSERT INTO tutorial (title,description) VALUES
('SQL Joins','An SQL JOIN clause combines rows from two or more tables. It creates a set of rows in a temporary table.'),
('SQL Equi Join','SQL EQUI JOIN performs a JOIN against equality or matching column(s) values of the associated tables. An equal sign (=) is used as comparison operator in the where clause to refer equality.'),
('SQL Left Join','The SQL LEFT JOIN, joins two tables and fetches rows based on a condition, which is matching in both the tables and the unmatched rows will also be available from the table before the JOIN clause.'),
('SQL Cross Join','The SQL CROSS JOIN produces a result set which is the number of rows in the first table multiplied by the number of rows in the second table, if no WHERE clause is used along with CROSS JOIN.'),
('SQL Full Outer Join','In SQL the FULL OUTER JOIN combines the results of both left and right outer joins and returns all (matched or unmatched) rows from the tables on both sides of the join clause.'),
('SQL Self Join','A self join is a join in which a table is joined with itself (which is also called Unary relationships), especially when the table has a FOREIGN KEY which references its own PRIMARY KEY.');

select * from tutorial where match(title,description) against
('Left Right'in natural language mode);

select count(*) from tutorial where match(title,description) against
('Left Right'in natural language mode);
select * from tutorial where match(title,description)against
('+joins -right' in boolean mode ); 