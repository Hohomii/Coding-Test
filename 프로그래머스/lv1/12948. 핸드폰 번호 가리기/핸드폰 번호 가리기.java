class Solution {
    public String solution(String phone_number) {
        String star = phone_number.substring(0,phone_number.length()-4);
        char[] starArr = star.toCharArray();
        for (int i=0; i < starArr.length; i++) {
            starArr[i] = '*';
        }
        star = new String(starArr);
        return star + phone_number.substring(phone_number.length()-4,phone_number.length());
    }
}