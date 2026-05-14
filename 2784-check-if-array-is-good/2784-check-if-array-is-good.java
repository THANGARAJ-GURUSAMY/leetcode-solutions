class Solution {
    public boolean isGood(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        for(int i=1; i<n; i++){
            l.add(i);
        }
        l.add(n);
        l.add(n);
        if(l.size()!=nums.length){
            return false;
        }
        for(int i=0; i<n; i++){
            if(nums[i]!=l.get(i)){
                return false;
            }
        }
        return true;

    }
}