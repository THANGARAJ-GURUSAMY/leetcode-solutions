class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1="";
        for(char c:firstWord.toCharArray())
        {
            s1+=(c-'a');
        }
        String s2="";
        for(char c:secondWord.toCharArray())
        {
            s2+=(c-'a');
        }
        String s3="";
        for(char c:targetWord.toCharArray())
        {
            s3+=(c-'a');
        }
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        int num3=Integer.parseInt(s3);
        return num3==(num1+num2);
    }
}