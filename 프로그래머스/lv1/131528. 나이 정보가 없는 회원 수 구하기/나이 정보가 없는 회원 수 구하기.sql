# -- 코드를 입력하세요
# SELECT SUM(AGE IS NULL) AS USERS FROM USER_INFO

SELECT COUNT(USER_ID) AS USERS FROM USER_INFO
WHERE AGE IS NULL