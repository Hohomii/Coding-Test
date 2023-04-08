// participant에서 완주 못한 한 명 찾기 : 겹치지 않는 한 명
// 동명이인 주의
// String[] sort + 반복, 조건문
// p: a b c d
// c: a c d e  // b의 경우와 e의 경우가 가능
// 반복 돌려서 인덱스값과 맞지 않으면 리턴
// 모든 게 같으면 길이의 끝에 있는 걸 리턴
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i=0; i < participant.length; i++) {
            if (i == completion.length) {
                answer = participant[i];   
                break;
            }
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}