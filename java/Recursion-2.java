public boolean groupSum(int start, int[] nums, int target) {
  if (start >= nums.length) {
    return target == 0;
  }
  
  if (groupSum(start + 1, nums, target)) {
    return true;
  }
  
  if (groupSum(start + 1, nums, target - nums[start])) {
    return true;
  }

  return false;
}


public boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return target == 0;
    }
    
    if (nums[start] == 6) {
      target -= 6;
    }
    
    if (groupSum6(start + 1, nums, target)) {
      return true;
    }
    
    if (groupSum6(start + 1, nums, target - nums[start])) {
      return true;
    }
  
    return false;
}
  

public boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return target == 0;
    }
    
    if (groupNoAdj(start + 1, nums, target)) {
      return true;
    }
    
    if (groupNoAdj(start + 2, nums, target - nums[start])) {
      return true;
    }
  
    return false;
}
  

public boolean groupSum5(int start, int[] nums, int target) {

}


public boolean groupSumClump(int start, int[] nums, int target) {
  
}


public boolean splitArray(int[] nums) {
  
}


public boolean splitOdd10(int[] nums) {
  
}


public boolean split53(int[] nums) {
  
}
