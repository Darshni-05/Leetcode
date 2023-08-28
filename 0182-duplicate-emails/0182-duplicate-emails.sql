# Write your MySQL query statement below
select distinct(p.email) from Person p inner join Person e on p.email = e.email where p.id != e.id;