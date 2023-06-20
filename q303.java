class NumArray {
    List<Integer> numsList = new ArrayList<Integer>();

    public NumArray(int[] nums) {       
        numsList.add(0);
        
        for (int i = 0; i < nums.length; i++) {
            this.numsList.add(nums[i] + numsList.get(i));
        }
    }
    
    public int sumRange(int left, int right) {
        return this.numsList.get(right + 1) - this.numsList.get(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

