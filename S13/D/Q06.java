package S13Pair.S13.D;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long var = 0;
        for (int i =0;i<n;i++){
            var += x;
            answer[i]=var;
        }
        return answer;
    }
}