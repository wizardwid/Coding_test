class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int i = 0;
        
        if(n / 10 >= 0){
            i = k - (n/10);
        }
        
        answer = (n*12000) + (i*2000);
        return answer;
    }
}