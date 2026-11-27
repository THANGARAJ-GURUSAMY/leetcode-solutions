
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = "";
        String b = "";

        int i=0;
        int j=0;

        while(i<s.length()) {
            if(s.charAt(i)=='#') {
                if(a.length()>0) {
                    a = a.substring(0,a.length()-1);
                }
            }
            else {
                a += s.charAt(i);
            }
            i++;
        }

        while(j<t.length()) {
            if(t.charAt(j)=='#') {
                if(b.length()>0) {
                    b = b.substring(0,b.length()-1);
                }
            }
            else {
                b += t.charAt(j);
            }
            j++;
        }

        return a.equals(b);
    }
}
