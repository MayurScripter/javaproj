public class maxsubarrsum {
    public static int maxsubarraysum(int[]nums){
        int maxsum= Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum +=nums[i];

         if(cursum<0){
            cursum=0;
        }
    }
    return maxsum;
}
                        



    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubarraysum(nums));
    }
}


    


