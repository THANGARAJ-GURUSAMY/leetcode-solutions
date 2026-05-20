class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int i=0;
        int[] res=new int[A.length];
        int k=0;
        while(true)
        {
           if(i==A.length)
           {
            break;
           }
           List<Integer> l1=new ArrayList<>();
           List<Integer> l2=new ArrayList<>();
           for(int j=0;j<=i;j++)
           {
            l1.add(A[j]);
            l2.add(B[j]);
           }
           int c=0;
           for(int j=0;j<l1.size();j++)
           {
            if(l2.contains(l1.get(j)))
            {
                c++;
            }
           }
           res[k++]=c;
           i++;
           if(i==A.length)
           {
            break;
           }
        }
        return res;

    }
}