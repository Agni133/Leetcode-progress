# Write your MySQL query statement below
-- MySQL or PostgreSQL
SELECT tweet_id
From Tweets
WHERE CHAR_LENGTH(content) > 15;

