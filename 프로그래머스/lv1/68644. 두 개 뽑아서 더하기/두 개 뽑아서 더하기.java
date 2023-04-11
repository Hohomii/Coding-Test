// 문제 : 배열에서 만들 수 있는 모든 경우의 합을 담은 배열을 / 오름차순으로 / 리턴
// number[i] + number[i+1]
// number[i] + number[i+2] ... 이중 for문
// 주의! 중복값 빼야

// ** 슈도코드 **
// for ( i=0; i < n.length-1;) 
// for ( j=1; i < n.length )
// if 
// new arraylist = n[i] + n[j] // 길이가 정해져있지 않으므로 arraylist
// sort 오름차순
// arraylist to int[]
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i < numbers.length; i++) {
            for (int j=0; j < numbers.length; j++) {
                if (i != j) {
                list.add(numbers[i] + numbers[j]);
                }
            }
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i=0; i < list.size(); i++) {
            if (!resultList.contains(list.get(i))) {
                resultList.add(list.get(i));
            }
        }
        Collections.sort(resultList);
        int[] answer = resultList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}