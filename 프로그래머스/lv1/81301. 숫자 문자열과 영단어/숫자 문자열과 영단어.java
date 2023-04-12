// s의 숫자는 숫자로 들어가게.
// 단어와 숫자를 if문 처리 : string.contains() 있으면 해당 숫자를 넣는다.
// 어레이리스트에 추가하는 식으로 한 담에 숫자로 바꿀까보다.
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("zero", "0");
        s = s.replaceAll("one", "1");
        s = s.replaceAll("two", "2");
        s = s.replaceAll("three", "3");
        s = s.replaceAll("four", "4");
        s = s.replaceAll("five", "5");
        s = s.replaceAll("six", "6");
        s = s.replaceAll("seven", "7");
        s = s.replaceAll("eight", "8");
        s = s.replaceAll("nine", "9");
        return Integer.parseInt(s);
    }
}