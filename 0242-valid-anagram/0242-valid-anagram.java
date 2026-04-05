class Solution {
    public boolean isAnagram(String s, String t) {
        int sum1=0;
        int sum2=0;
        int sqsum1=0;
        int sqsum2=0;
        int[] freq=new int[26];
        if(s.length()!=t.length())
        {
            return false;
            
            
      }
      for(int i=0;i<s.length();i++)
      {
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);

        sum1+=ch1;
        sum2+=ch2;
        sqsum1+=ch1*ch1;
        sqsum2+=ch2*ch2;
        freq[ch1-'a']++;
        freq[ch2-'a']--;
      }
      if(sum1-sum2!=0||sqsum1-sqsum2!=0)
      {
        return false;
      }
     
    for(int i=0;i<26;i++)
    {
        if(freq[i]!=0)
        {
            return false;
        }
    }
    return true;
      

        
    }
}