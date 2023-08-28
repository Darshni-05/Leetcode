# Write your MySQL query statement below

select s.name from SalesPerson s where s.name not in(
select s.name from SalesPerson s 
inner join Company c inner join Orders o on s.sales_id = o.sales_id and c.com_id = o.com_id where c.name = "RED");