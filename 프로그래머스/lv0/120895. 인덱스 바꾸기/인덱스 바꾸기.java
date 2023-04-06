class Solution {
    public String solution(String my_string, int num1, int num2) {
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        char[] arr = my_string.toCharArray();
        arr[num1] = c2;
        arr[num2] = c1;
        return String.valueOf(arr);
    }
}