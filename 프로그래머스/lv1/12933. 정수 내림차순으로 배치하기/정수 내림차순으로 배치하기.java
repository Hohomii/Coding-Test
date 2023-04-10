import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        char[] chars = num.toCharArray();
        Arrays.sort(chars);
        num = new StringBuilder(new String(chars)).reverse().toString();
        answer = Long.parseLong(num);
        return answer;
    }
}

// 이 방법도 good...
// import java.util.*;

// class Solution {
//   public long solution(long n) {
//         String[] list = String.valueOf(n).split("");
//         Arrays.sort(list);

//         StringBuilder sb = new StringBuilder();
//         for (String aList : list) sb.append(aList);

//         return Long.parseLong(sb.reverse().toString());
//   }
// }