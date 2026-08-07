class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            int size=(i+k)%n;
            sb.append(s.charAt(size));
        }
        return sb.toString();
        
    }
}