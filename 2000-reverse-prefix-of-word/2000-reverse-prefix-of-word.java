class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch)))
        {
            return word;
        }
        StringBuilder sb=new StringBuilder();
        int pos=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                pos=i;
                break;
            }
        }
        sb.append(word.substring(0,pos+1));
        sb.reverse();
        sb.append(word.substring(pos+1));
        return sb.toString();
    }
}