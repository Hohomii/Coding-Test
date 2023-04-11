// 1번 수포자 : 1, 2, 3, 4, 5...
// 2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5...
// 3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5...
// answer   : 1, 2, 3, 4, 5,...
// answer와 같은 인덱스 값이 가장 많이 겹치는 사람..(여러 명 일 수 있음)
// 123 수포자의 배열을 어떻게 만들지? 
// 길이를 모르니 array보다는 list 쪽을 쓰는 게 좋겠다.라고 생각했는데 사람들이 배열에 넣었네..

// *** 슈도 코드 ***
// 1번 = {} , 2번, 3번 다 넣고.
// while문으로 answer의 길이까지, 같은 값 있으면 cnt1,2,3++; 
// cnt가 제일 크거나 같은 사람을 answer에 넣기.(길이를 모르니 arrayList가 낫지 않을까)
// 오름차순 정렬하기

import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> list = new ArrayList<>();
        
        int cntArr1 = 0;
        int cntArr2 = 0;
        int cntArr3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (arr1[i % arr1.length] == answers[i]) {
                cntArr1++;
            }
            if (arr2[i % arr2.length] == answers[i]) {
                cntArr2++;
            }
            if (arr3[i % arr3.length] == answers[i]) {
                cntArr3++;
            }
        }
        
        int max = Math.max(cntArr1, Math.max(cntArr2, cntArr3));
        if (max == cntArr1) {
            list.add(1);
        }
        if (max == cntArr2) {
            list.add(2);
        }
        if (max == cntArr3) {
            list.add(3);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}

//         int[] arr1 = new int[] {1, 2, 3, 4, 5};
//         int[] arr2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
//         int[] arr3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//         ArrayList <Integer> list = new ArrayList<>();
        
//         int idx = 0;
//         int cntArr1 = 0;
//         int cntArr2 = 0;
//         int cntArr3 = 0;
//         while (idx < answers.length) {
//             if (arr1[idx%arr1.length] == answers[idx]) {
//                 cntArr1++;
//             } else if (arr2[idx%arr2.length] == answers[idx]) {
//                 cntArr2++;
//             } else if (arr3[idx%arr3.length] == answers[idx]) {
//                 cntArr3++;
//             }
//             idx++;
//         }
        
//         if (cntArr1 == cntArr2 && cntArr1 > cntArr3) {
//             list.add(1);
//             list.add(2);
//         } else if (cntArr2 == cntArr3 && cntArr2 > cntArr1) {
//             list.add(2);
//             list.add(3);
//         } else if (cntArr3 == cntArr1 && cntArr3 > cntArr2) {
//             list.add(3);
//             list.add(1);
//         } else if (cntArr1 == cntArr2 && cntArr1 == cntArr3) {
//             list.add(1);
//             list.add(2);
//             list.add(3);
//         } else if (cntArr1 > cntArr2 && cntArr1 > cntArr3) {
//             list.add(1);
//         } else if (cntArr2 > cntArr1 && cntArr2 > cntArr3) {
//             list.add(2);
//         } else if (cntArr3 > cntArr1 && cntArr3 > cntArr2) {
//             list.add(3);
//         }
        
//         Collections.sort(list);
        
//         return list.stream().mapToInt(i -> i).toArray();
        
//     }
// }