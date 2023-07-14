//숫자에 대응되는 알파벳 출력
//age를 자른 다음 각 숫자에 대응되는 알파벳 넣기
class Solution {
    public String solution(int age) {
        String answer = "";
        String ageString = String.valueOf(age);
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        for (int i=0; i < ageString.length(); i++) {
            for (int j=0; j < arr.length; j++) {
                int num = ageString.charAt(i) - '0';
                if (num == j) {
                    answer += arr[j];
                }
            }
        }
        
        
        return answer;
    }
}