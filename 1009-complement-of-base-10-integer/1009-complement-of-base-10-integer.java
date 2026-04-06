import java.util.*;
class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String res="";
        for(char c:s.toCharArray())
        {
            if(c=='0')
            {
                res+='1';
            }
            else
            {
                res+='0';
            }
        }
        int n1=Integer.parseInt(res,2);
        return n1;
    }
}