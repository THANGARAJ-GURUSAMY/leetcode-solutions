class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int key=nums[i];
            if(map.containsKey(key))
            {
                map.put(key,map.getOrDefault(key,0)+1);
                if(map.get(key)==n)
                {
                    return key;
                }
            }
            else
            {
            map.put(key,1);
            }
        }
        return -1;
    }
}