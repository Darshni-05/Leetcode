# Write your MySQL query statement belowse
SELECT p.product_name , e.year, e.price from 
Sales as e left join Product as p 
 on e.product_id = p.product_id;