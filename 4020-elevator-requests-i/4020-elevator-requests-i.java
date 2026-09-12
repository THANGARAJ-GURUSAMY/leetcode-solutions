class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=requests[0];
        int num=requests[0];
        for(int i=1;i<requests.length;i++)
        {
            int d=Math.abs(num-requests[i]);
            sum+=d;
            num=requests[i];
        }
        return sum;
    }
}