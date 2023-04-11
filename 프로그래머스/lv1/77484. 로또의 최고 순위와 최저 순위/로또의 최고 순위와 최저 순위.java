// 문제 : 0을 제외한 나머지 숫자가 몇 개 같은지를 확인하고, 
// 0이 전부 맞을 때, 전부 아닐 때의 등수를 뽑으면 됨.
// 어레이리스트의  list1.retainAll(list2); 이용

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>(Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new)));
        int zeroCount = 0;
        int matchCount = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }
        int maxRank = Math.min(7 - matchCount - zeroCount, 6);
        int minRank = Math.min(7 - matchCount, 6);
        return new int[]{maxRank, minRank};
    }
}





// *** 슈도 코드 ***
// 두 개 다 어레이리스트로 바꿔서
// lottos에서 0을 제거 + 제거 후 남는 길이를 담음
// retainAll 메서드 사용해서 두 배열의 중복값만 lottos에 남김 => 길이 구하기
// int[] answer에 lottos길이+0, lottos길이+0의 길이
// import java.util.*;
// import java.util.stream.Collectors;
// class Solution {
//     public int[] solution(int[] lottos, int[] win_nums) {
//         int[] answer = {};
//         int lottosLength = 0;
//         int highest = 0;
//         List<Integer> list1 = Arrays.stream(lottos).boxed().collect(Collectors.toList());
//         List<Integer> list2 = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
//         list1.remove(0); // lottos에서 0을 제거
//         lottosLength = list1.size();    // 0을 제거한 lottos의 길이
//         list1.retainAll(list2);         // lottos와 win_num의 중복값을 list1에 넣음 
//         ArrayList<Integer> result = new ArrayList<>();
//         highest = list1.size() + (lottos.length - lottosLength); // 최고순위(중복값+0의 길이)
//         result.add(list1.size());
//         result.add(highest);
//         answer = result.stream()
//                 .mapToInt(i -> i)
//                 .toArray();
//         return answer;
//     }
// }