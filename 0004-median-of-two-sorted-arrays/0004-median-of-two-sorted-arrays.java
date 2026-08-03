class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                l.add(nums1[i]);
                i++;

            }
            else if(nums2[j]<nums1[i])
            {
                l.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length)
        {
            l.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            l.add(nums2[j]);
            j++;

        }
        int n=l.size();
        if(n%2==1)
        {
            return l.get(n/2);
        }
        int n1=l.get(n/2-1);
        int n2=l.get(n/2);
        return (n1+n2)/2.0;
        
    }
}