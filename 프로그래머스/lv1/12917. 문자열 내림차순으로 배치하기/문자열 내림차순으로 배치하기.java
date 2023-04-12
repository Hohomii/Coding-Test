// 반복문+아스키코드 조건으로 대문자 다 뺀 다음에 리스트 넣기
// 둘 다 내림차순
// 합치기
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int tmp = 0; // 대문자인지 확인할 (int)char값을 넣음
        // s를 하나씩 자른 list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(""))); 
        ArrayList<String> upperCase = new ArrayList<>(); //대문자만 넣을 리스트
        for(int i=0; i < list.size(); i++) {  // 대문자를 걸러낼 반복문
            tmp = list.get(i).charAt(0); // 리스트의 i번째를 char로 바꿈
            if(tmp >= 65 && tmp <= 90) { // 그게 대문자이면
                upperCase.add(list.get(i)); // 대문자 리스트에 넣고
                list.remove(list.get(i));  // s리스트에선 뺌
                i--;
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        Collections.sort(upperCase, Collections.reverseOrder());
        list.addAll(upperCase); // 두 리스트 합치기
        StringBuilder sb = new StringBuilder(); // 리스트를 문자열로 붙이는 작업
        for (String str : list) {
            sb.append(str);
        }
        answer = sb.toString();
        return answer;
    }
}