class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        String ans="";
        for(int i=0;i<dictionary.size();i++)
        {
            String word=dictionary.get(i);
            int j=0;
            int k=0;
            while(j<s.length()&&k<word.length())
            {
                if(s.charAt(j)==word.charAt(k))
                {
                    k++;
                }
                j++;
            }
            if(k==word.length())
            {
                if(word.length()>ans.length())
                {
                    ans=word;
                }
            }
        }
        return ans;
    }
}