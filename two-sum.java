public int[] twoSum(int[] nums, int target){
    var map = new HashMap<Integer>();
    for(int i = 0; i < nums.length; i++){
        int key = target - nums[i];
        if(map.containsKey(key)) return new int[] {i, key};
        map.put(nums[i], i);
    }
    return new int[]{};
}