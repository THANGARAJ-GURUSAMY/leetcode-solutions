class Solution {
    public boolean areNumbersAscending(String s) {
        String[] a=s.split(" ");
        int p=-1;
        for(String m:a)
        {
            if(Character.isDigit(m.charAt(0)))
            {
               int num=Integer.parseInt(m);
               if(num<=p)
               {
                return false;
               }
               p=num;

            }
        }
        return true;
      
    }
}