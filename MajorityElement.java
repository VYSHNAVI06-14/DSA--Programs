class MajorityElement {
    public static int major(int[] nums) {
      int candidate=0,count=0;
      for(int n:nums)
      {
        if(count==0)
         candidate=n;
        if(n==candidate)
          count++;
        else
          count--;
      }  
      if(count!=0)
         return candidate;
      else 
         return -1;
    }
    public static void main(String []args)
    {
        int []nums={2,2,3,3,2,2};
        int k=major(nums);
        System.out.print(k);
    }
}