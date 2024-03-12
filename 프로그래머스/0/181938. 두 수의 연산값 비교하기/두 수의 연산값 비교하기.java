class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int res1 = Integer.parseInt("" + a + b);
        int res2 = 2 * a * b;
        if(res1 >= res2){
            answer = res1;
        }
        else{
            answer = res2;
        }
        return answer;
    }
}