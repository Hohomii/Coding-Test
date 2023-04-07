// 1.배열의 특정 인덱스("Kim") 찾기 
// 2.인덱스를 포함한 문자열 리턴

// string[] 에서 특정값 찾는 메서드 찾기
// for문에 넣어서 if문으로 찾아서 인덱스 받기
class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for (int i=0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
            }
        }
        return "김서방은 " + x + "에 있다";
    }
}