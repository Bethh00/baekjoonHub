class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 1, min = section[0];
        for(int i = 1; i < section.length; i++){
            if(section[i] - min >= m){
                count++;
                min = section[i];
            } 
        }
        return count;
    }
}