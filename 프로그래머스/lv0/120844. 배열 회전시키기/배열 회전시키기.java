// right면 인덱스가 0,1,2 -> 2,0,1 : 맨끝인덱스->맨앞으로. 나머지는 전부 인덱스-1
// left면 인덱스가 0,1,2 -> 1,2,,,0 : 맨첫인덱스->맨끝으로. 나머지는 전부 인덱스+1

// 슈도 코드 ***
// if right이면 맨끝인덱스를 변수에 넣어놓고
// i=2부터 배열길이-1만큼 반복문 돌려서 arr[i] = arr[i-1]
// if left이면 반대
// --- 위처럼 하니까 반복문 돌때 다음 인덱스의 숫자는 사라짐. 
// 해결하려면? 새로운 배열에 넣은 후 재배치할 것

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int num = 0;
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            num = numbers[numbers.length-1];
            for (int i=1; i < numbers.length; i++) {
                answer[i] = numbers[i-1];
            }
            answer[0] = num;
            return answer;
        } else {
            num = numbers[0];
            for (int i=0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[answer.length-1] = num;
            return answer;
        }
    }
}