// 가장 작은 수를 빼고 리턴. 배열의 길이가 1이면 -1 리턴 
// int[] 그대로 써서 반복문 돌리거나(가장 작은 수를 찾아 변수에 넣고 그 인덱스만 뺌)
// 기능이 많은 arraylist 등 쓰거나.
// 원 순서의 배열을 리턴해야하므로 sort보다는 반복문을 사용하겠음
// int[] -> list 로 바꿔서 remove 사용

import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr) {
// 배열 길이가 1인 경우
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        //배열 길이가 1보다 클 때
        // 가장 작은 수를 뺀 길이로 초기화
        int[] answer = new int[arr.length-1];

        // 하나의 값을 기준으로 잡음.
        int min = arr[0];
        // 제일 작은 수를 구한다.
        for(int i=0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        // 반복문용 index
        int idx = 0;
        
        // 가장 작은 수를 제외한 배열 만들기
        for(int i=0; i < arr.length; i++) {
            // 배열의 값이 가장 작은 수라면
            if(arr[i] == min) {
                // continue를 이용해 배열에 넣지 않고 넘어간다.
                continue;
            }
            answer[idx++] = arr[i]; 
        }
        return answer;
    }
}


// import java.util.*;
// import java.util.stream.Collectors;
// class Solution {
//     public int[] solution(int[] arr) {
//         int[] answer = {};
//         int minNum = 0;
//         for (int i=0; i < arr.length; i++) {
//             for (int j=1; j < arr.length; j++) {
//                 if (arr.length == 1) {
//                     return new int[]{-1};
//                 } else if (arr[i] > arr[j]) {
//                     minNum = arr[j];
//                 } else if(arr[i] < arr[j]) {
//                     minNum = arr[i];
//                 }
//             }
//         }
//         List<Integer> intList = Arrays.stream(arr)
//                                 .boxed()
//                                 .collect(Collectors.toList());
//         intList.remove(minNum);
//         answer = intList.stream()
//                 .mapToInt(i -> i)
//                 .toArray();
//         return answer;
//     }
// }