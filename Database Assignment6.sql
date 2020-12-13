create database assignments6;

use assignments6 ;
delimiter $$
create function Q1(x int) returns int
deterministic
begin
declare result int(10) default 1 ;
loop1 : loop 
if (x<=0)
then leave loop1;
end if;

set result= result*x;
set x=x-1;
iterate loop1;
end loop ;
return result;
end $$

select Q1(5);

drop function Q1;

-----------------------------------------------------------------------

delimiter $$
CREATE FUNCTION Q2(X INT) RETURNS VARCHAR(10)
BEGIN
DECLARE M ,I INT;
SET I=2;
SET M=X/2;
IF X=0 || X=1 THEN 
RETURN 'NOT PRIME';
ELSE
L1: LOOP
WHILE I<=M DO
IF X%2=0 THEN 
RETURN 'NOT PRIME';
LEAVE L1;
ELSE
SET I=I+1;
ITERATE L1;
END IF;
END WHILE;
RETURN 'PRIME';
END LOOP L1;
END IF;
END$$

select Q2(5);
----------------------------------------------
delimiter $$
create function Q3(var1 int(20)) returns varchar(20)
deterministic
begin
return concat(var1 ,'inches',round(var1/36),'yard',round(var1/12),'foot');
end $$
select Q3(122);

drop function Q3;
-----------------------------------------------
delimiter $$
create function Q4(dept int) returns varchar(30)
begin
update emp set sal=sal+(sal*0.10) where deptno=dept;
return 'updated';
end $$

select Q4(1);
-------------------------------------------
delimiter $$
 create function Q5(empn int ,comp int ) returns int
 begin
 declare val int;
 set val=(select sal from emp where empno=empn);
 return (val+comp)*12;
 end;$$
 
 
 select Q(1004,20) as 'updated salary';
 
 -------------------------------------------------------
 delimiter $$
CREATE PROCEDURE USER_QUERY_EMP  (IN P_ENO INT, OUT P_JOB VARCHAR(10), OUT P_SAL INT3 ) 
BEGIN
DECLARE NO INT;
SET NO = (SELECT COUNT(*) FROM EMP WHERE EMPNO=P_ENO);
IF NO=0 THEN 
SELECT 'employee not exists';
SET P_JOB='';
SET P_SAL=0;
ELSE 
SELECT SAL,JOB INTO P_SAL,P_JOB FROM EMP WHERE EMPNO=P_ENO;
END IF;
END$$

CALL USER_QUERY_EMP(1004,@JOB,@SAL);
SELECT @JOB,@SAL


----------------------------------------
delimiter $$
 create procedure Q7(inout str varchar(30))
 begin
 if(str = '' || isnull(str)) then
 set str='no string format';
 else 
 set str=(select reverse(str));
 end if;
 end $$
 set @str='the red';
 call Q7(@str);
 select @str;
 
 
 ----------------------------------------------
 delimiter $$
  create procedure Q8()
  begin 
show databases; 
  end $$
  
  call Q8();
  
 
 
 
 

