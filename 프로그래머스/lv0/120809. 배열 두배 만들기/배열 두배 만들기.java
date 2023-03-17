import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
    List<Integer> doubleNum = new ArrayList<Integer>();

    for (int i : numbers) {
    doubleNum.add(i * 2);
    }

    return doubleNum.stream().mapToInt(i -> i).toArray();
    }
}