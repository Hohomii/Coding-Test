-- 코드를 입력하세요

 SELECT 
    HISTORY_ID, 
    CAR_ID, 
    DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE, 
    DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,
    IF(DATEDIFF(END_DATE, START_DATE) >= 29, '장기 대여', '단기 대여') AS RENT_TYPE 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE 
        DATE_FORMAT(START_DATE, '%Y-%m') = '2022-09'
        ORDER BY HISTORY_ID DESC
        
#datediff(끝 점, 시작 점) => 끝에서 시작을 뺀다?
#START_DATE 를 LIKE 로 2022년 9월에 속하는 대여 기록만 뺀다
#CASE OR IF 사용해서 장기대여, 단기대여 표시
#DATE_FORMAT으로 시간 빼라