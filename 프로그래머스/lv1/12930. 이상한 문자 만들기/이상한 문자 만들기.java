// 단어를 공백 기준 자른 후 하나하나를  [try, hello, world]
// 홀수번째 인덱스만 대문자로 치환
// 인덱스를 생성해서 활용한다는 생각을 못했다!

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }
}