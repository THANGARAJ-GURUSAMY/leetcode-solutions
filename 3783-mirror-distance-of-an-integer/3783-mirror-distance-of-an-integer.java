class Solution {
   
    public int mirrorDistance(int n) {
        String res=String.valueOf(n);
        String s="";
        for(int i=res.length()-1;i>=0;i--)
        {
            s+=res.charAt(i);
        }
        int num=Integer.parseInt(s);
        int r=Math.abs(num-n);
        return r;
    }
}