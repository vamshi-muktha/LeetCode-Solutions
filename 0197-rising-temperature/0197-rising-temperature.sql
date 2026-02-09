select a.id from weather a join weather b on DATEDIFF(a.recordDate, b.recordDate) = 1
and b.temperature < a.temperature
