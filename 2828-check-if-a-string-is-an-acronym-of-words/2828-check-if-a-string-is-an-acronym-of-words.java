class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String s1:words)
        {
            sb.append(s1.charAt(0));
        }
        return s.equals(sb.toString());
    }
}