class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String m=String.valueOf(x);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(m))
            {
                l.add(i);
            }
        }
        return l;
    }
}