-- 코드를 입력하세요
select ai.name, ai.datetime from animal_ins ai
left join animal_outs ao on ai.animal_id = ao.animal_id
where ao.animal_id is null
order by ai.datetime
limit 3


# animal_ins 테이블 = 입양소에 있는 동물들
# animal_outs 테이블 = 입양 간 친구들
# 문제에서 찾는 것 = 아직 입양을 못 간 동물 친구들
# 그럼, 무슨 join 방식을 사용해서 연결? -> left
# 키값 = animal_id = 두 테이블에 동일하게 들어가는 값
# 입양을 못 간 친구들을 where절을 사용해서 구분
# order by로 정렬
# limit으로 값 개수를 설정