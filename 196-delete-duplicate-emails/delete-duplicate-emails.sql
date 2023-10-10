# Write your MySQL query statement below
delete a from Person a
inner join person b
on a.email = b.email
and a.id > b.id;