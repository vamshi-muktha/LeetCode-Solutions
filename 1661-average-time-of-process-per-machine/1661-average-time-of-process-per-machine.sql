# Write your MySQL query statement below
-- select machine_id, avg(time) from 


select a.machine_id, round(avg(b.timestamp - a.timestamp), 3) as processing_time from (select machine_id, process_id, timestamp from activity where activity_type = "start") a join (select machine_id, process_id, timestamp from activity where activity_type = "end") b on a.process_id = b.process_id and a.machine_id = b.machine_id group by machine_id;