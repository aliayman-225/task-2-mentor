class Solution {
    public static int firstMissingPositive(int[] nums) {
        int max=Integer.MIN_VALUE;
        int firstMissingPositive =0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max= nums[i];
            }
        }
        boolean missingNumbers[]=new boolean[max+1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
                missingNumbers[nums[i]]=true;
        }
        for(int i=1;i<missingNumbers.length;i++)
        {
            if(missingNumbers[i]==false)
            {
                firstMissingPositive=i;
                break;
            }
        }
        if(firstMissingPositive==0)
            return max+1;
        else return firstMissingPositive;
    }

    public  static void main(String[] args)
    {
        int[]nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
}