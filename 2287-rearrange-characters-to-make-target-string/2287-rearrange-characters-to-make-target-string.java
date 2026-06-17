class Solution {
    public int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < target.length(); i++)
        {
            char ch = target.charAt(i);

            int c1 = 0;
            int c2 = 0;

            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(j) == ch)
                {
                    c1++;
                }
            }

            for(int j = 0; j < target.length(); j++)
            {
                if(target.charAt(j) == ch)
                {
                    c2++;
                }
            }

            ans = Math.min(ans, c1 / c2);
        }

        return ans;
    }
}