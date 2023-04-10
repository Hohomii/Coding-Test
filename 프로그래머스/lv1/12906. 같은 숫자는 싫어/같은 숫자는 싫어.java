// 중복값 제거. 순서는 그대로 유지.

// 슈도코드 작성
// 어레이리스트 생성


// list의 크기만큼 새로운 배열 선언
// for(newArr.length만큼) {
//      newArr[i] = list.get[i];    // get을 통해 중복을 제외한 값을 새로운 배열에 넣음

//}
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int num = -1; // 원소가 0~9까지이므로 영향 받지 않는 아무 숫자
        for(int i=0; i < arr.length; i++) {
            if(arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}