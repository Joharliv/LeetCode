# Write your MySQL query statement below
Select e1.name As Employee
from Employee e1
join Employee e2
on e1.managerId= e2.id
where e2.salary < e1.salary;
