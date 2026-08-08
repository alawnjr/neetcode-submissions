class Solution {
    public int[] productExceptSelf(int[] nums) {

        int productAll = 1;
        int productNonZero = 1;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            productAll *= nums[i];

            if (nums[i] != 0) {
                productNonZero *= nums[i];
            } else zeroCount++;
        }

        if (zeroCount == nums.length) return new int [nums.length];

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0 && zeroCount == 1) {
                res[i] = productNonZero;
            } 
            else if (nums[i] == 0 && zeroCount > 1) {
                res[i] = productAll;
            }
            else {
                res[i] = productAll / nums[i];
            }
        }
        
        return res;
    }
}  
