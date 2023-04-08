//n을 쪼갠다 => n을 10으로 나눈 나머지들을 계속 만든다. 
//일반 for문 쓸 수 없음 => long index 불가

// 계속 long타입 때문에 고전했는데.. 
// string으로 바꿔서 하면 되는 거였다..
class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int idx = 0;
        while(n > 0) {
            answer[idx] = (int)(n % 10);    // 타입형변환 정리 필요. (int)n % 10 은 왜 안 되는지?
            n = n / 10;
            idx++;
        }
        return answer;
        
        
        
        
    }
}
        
        
        
        
        
        
        
        
        
        
//         int[] answer = new int[(int)(Math.log10(n)+1)]; //n의 길이의 배열 선언
//         int idx = 0;
//         while(n > 0) {
//             answer[idx] = (int)n % 10;
//             n = n / 10;
//             idx++;
//             if (idx == n)
//                 break;
//         }
//         return answer;
//     }
// }