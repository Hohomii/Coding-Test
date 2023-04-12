// 답안 코드 봤슴!
// n번째 글자를 기준으로 string 정렬
// n번째 글자를 추출한 후 그 값을 char[]에 넣은 후 정렬
// 그 담에 char[i]가 strings배열의 문자열의 n번째와 같은 문자열 대로 세우기
// 새로운 string[]을 만들기
// +추가조건 걸기 : => 위의 것들을 어찌 해야 할지 막막해짐... 그래서 찾아봄..
// ***새로운 계획
// list로 만들어서 n번째 글자를 맨 앞에 붙여줌ㅋㅋㅋ그리고 전체 정렬.
// 마지막에 맨앞 글자 떼고 리턴 ㅋㅋㅋㅋ
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int i=0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        return answer;
    }
}