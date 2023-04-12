class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += " ";
            } else {
                int ascii = (int) c;
                int shiftedAscii = ascii + n;
                if (Character.isLowerCase(c)) {
                    if (shiftedAscii > 'z') {
                        shiftedAscii -= 26;
                    }
                } else {
                    if (shiftedAscii > 'Z') {
                        shiftedAscii -= 26;
                    }
                }
                answer += (char) shiftedAscii;
            }
        }
        return answer;
    }
}


// class Solution {
//     public String solution(String s, int n) {
//         String answer = "";
//         for (int i=0; i < s.length(); i++) {
//             char c = s.charAt[i];
//             if (c == ' ') {
//                 answer += ' ';
//             } else {
//                 int ascii = (int) c;
//                 int shiftedAscii = ascii + n;
//                 if (Character.isLowerCase(c)) {
//                     if (shiftedAscii > 'z') {
//                         shiftedAscii -= 26;
//                      } 
//                 } else {
//                     if (shiftedAscii > 'Z') {
//                         shiftedAscii -= 26;
//                     }
//                 }
//                 answer += (char) shiftedAscii;
//             }
//         }
//         return answer;
//     }
// }

// 문자열을 다 쪼개서, +n만큼의 알파벳으로 치환..?
// 아스키코드와 치환의 조합으로 풀 수 있을 거 같다..
// (int)s.charAt(i) 으로 반복문 돌려서 +n 하고, 그걸 다시 문자로 바꾼다. 
// 공백처리 따로 해줘야 하는지 고민
// z,Z 이면 a+n-1, A+n-1로 바꾸기
// -----몇 개는 패스했는데, 정확도 테스트에서 틀렸다!-----
// 이유 : n의 숫자가 일정 이상일 경우 알파벳의 아스키에 더해졌을 때 알파벳 범위를 넘어감.
// 그러므로 이렇게 아스키를 이용해 풀 때에는 숫자가 알파벳 범위 이상으로 넘어가지 않게 해주는 게 중요. 
// class Solution {
//     public String solution(String s, int n) {
//         String answer = "";
//         char[] gap = s.toCharArray();
//         char[] chars = new char[s.length()];
//         for (int i=0; i < s.length(); i++) {
//             if (gap[i] == ' ') {
//                 chars[i] = ' ';
//             } else if (gap[i] == 'z') {
//                 chars[i] = (char)((int)'a' + n - 1);
//             } else if (gap[i] == 'Z') {
//                 chars[i] = (char)((int)'A' + n - 1);
//             } else {
//                 chars[i] = (char)((int)s.charAt(i) + n); //s의 char에 4를 더한 문자를 chars[i]에 넣는다.
//             }
//         }
//         return String.valueOf(chars);
//     }
// }