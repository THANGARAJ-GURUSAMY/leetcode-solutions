class Solution {
    public int minTimeToType(String word) {
        char cur='a';
        int time=0;
        for(char c:word.toCharArray())
        {
            int d=Math.abs(c-cur);
            time+=Math.min(d,26-d);
            time+=1;
            cur=c;
        }
        return time;
    }
}