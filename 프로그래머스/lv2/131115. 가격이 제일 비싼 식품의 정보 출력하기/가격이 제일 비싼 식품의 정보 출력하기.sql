-- 코드를 입력하세요
SELECT * FROM FOOD_PRODUCT
WHERE PRICE IN (
SELECT MAX(PRICE) FROM FOOD_PRODUCT
)






# 이 코드 안 된다고 함. price가 그룹함수라서..?? => 질문하기 확인
# SELECT PRODUCT_ID, 
#        PRODUCT_NAME, 
#        PRODUCT_CD, 
#        CATEGORY, 
#        MAX(PRICE) AS PRICE 
#   FROM FOOD_PRODUCT