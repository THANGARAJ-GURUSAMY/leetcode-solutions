class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String a:words)
        {
            int num=0;
            for(int i=0;i<a.length();i++)
            {
                int idx=a.charAt(i)-'a';
                num+=weights[idx];
            }
            int id=num%26;
            sb.append((char)('z'-id));
        }
        return sb.toString();
    }
}