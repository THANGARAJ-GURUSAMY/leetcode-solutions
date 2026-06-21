class Solution {
    public String convertDateToBinary(String date) {
        String[] a=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(String m:a)
        {
            int n=Integer.parseInt(m);
            String bin=Integer.toBinaryString(n);
            sb.append(bin);
            sb.append("-");
        }
        String s=sb.toString();
        return s.substring(0,s.length()-1);
    }
}