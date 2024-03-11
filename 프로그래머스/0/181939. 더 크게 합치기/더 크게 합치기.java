class Solution {
    public int solution(int a, int b) {
       
        int res1 = Integer.parseInt("" + a + b);
        int res2 = Integer.parseInt("" + b + a);
        
        if(res1 > res2 || res1 == res2){
            return res1;
        }
        else{
            return res2;      
        }
    }
}