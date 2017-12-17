# 197. Rising Temperature
# https://leetcode.com/problems/rising-temperature/

select a.Id
from Weather a join Weather b
where datediff(a.Date, b.Date) = 1 and a.Temperature > b.Temperature