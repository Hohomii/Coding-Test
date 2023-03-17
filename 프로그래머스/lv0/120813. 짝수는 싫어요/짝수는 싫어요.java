import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> numList = new ArrayList<Integer>();

            for (int i=1; i <= n; i++) {
                if (i%2 != 0) {
                    numList.add(i);
                }
            }
            return numList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}