class Solution {
    public int countTime(String time) {
        int hh = 1;

        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            hh = 24;
        } else if (time.charAt(0) == '?') {
            if (time.charAt(1) <= '3')
                hh = 3;
            else
                hh = 2;
        } else if (time.charAt(1) == '?') {
            if (time.charAt(0) == '2')
                hh = 4;
            else
                hh = 10;
        }

        int mm = 1;

        if (time.charAt(3) == '?' && time.charAt(4) == '?') {
            mm = 60;
        } else if (time.charAt(3) == '?') {
            mm = 6;
        } else if (time.charAt(4) == '?') {
            mm = 10;
        }

        return hh * mm;
    }
}