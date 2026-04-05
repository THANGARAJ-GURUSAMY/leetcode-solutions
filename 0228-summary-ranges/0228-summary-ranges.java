class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            String s=String.valueOf(nums[i]);
            int t=nums[i];
            int num=nums[i];
            int pos=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(num+1!=nums[j])
                {
                    break;
                }
                else
                {
                    num=nums[j];
                    pos++;
                }
                
            }
            if(t!=num)
            {
                s+="->";
                s+=String.valueOf(num);
               
            }
            list.add(s);
            i+=pos+1;;
           
            
        }
        return list;
    }
}