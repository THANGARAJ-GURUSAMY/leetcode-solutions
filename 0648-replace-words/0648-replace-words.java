class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb=new StringBuilder();
        Collections.sort(dictionary, (x, y) -> x.length() - y.length());
        String[] a=sentence.split(" ");
        for(String s:a)
        {
           boolean f=false;
           for(String s1:dictionary)
           {
              if(s.startsWith(s1))
              {
                 sb.append(s1).append(" ");
                 f=true;
                 break;
              }
           }
           if(!f)
           {
            sb.append(s).append(" ");
           }
        }
        return sb.toString().trim();
    }
}