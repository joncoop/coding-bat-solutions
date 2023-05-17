public int maxSpan(int[] nums) {
  int max = 0;
  
  for (int i = 0; i < nums.length; i++) {
    for (int j = i; j < nums.length; j++) {
      if (nums[i] == nums[j]) {
        max = Math.max(max, j - i + 1);
      }
    }  
  }
  
  return max;
}


public int[] fix34(int[] nums) {
  int[] result = new int[nums.length];
  
  int i = 0;
  int nextNot34 = 0;
  
  while (i < nums.length) {
    if (nums[i] == 3) {
      result[i] = 3;
      result[i + 1] = 4;
      i += 2;
    }
    else {
      while (nums[nextNot34] == 3 || nums[nextNot34] == 4) {
        nextNot34++;
    }
  
    result[i] = nums[nextNot34];
      i += 1;
    }
  }
  
  return result;
}
  

public int[] fix45(int[] nums) {
  int[] result = new int[nums.length];
  
  int i = 0;
  int nextNot45 = 0;
  
  while (i < nums.length) {
    if (nums[i] == 4) {
      result[i] = 4;
      result[i + 1] = 5;
      i += 2;
    }
    else {
      while (nums[nextNot45] == 4 || nums[nextNot45] == 5) {
        nextNot45++;
    }
  
    result[i] = nums[nextNot45];
      i += 1;
    }
  }
  
  return result;
}


// maybe less clear, but more efficient
public boolean canBalance(int[] nums) {
  int fullSum = 0;
  
  for (int i = 0; i < nums.length; i++) {
    fullSum += nums[i];
  }  
  
  if (fullSum % 2 == 1) {
    return false;
  }
  
  int halfSum = fullSum / 2;
  int partSum = 0;
  
  for (int i = 0; i < nums.length; i++) {
    partSum += nums[i];
    
    if (partSum == halfSum) {
      return true;
    }
  }
  
  return false;
}


public boolean linearIn(int[] outer, int[] inner) {
  int outerIndex = 0;
  
  for (int i=0; i<inner.length; i++) {
    while (outerIndex < outer.length && inner[i] != outer[outerIndex]) {
      outerIndex++;
    }
    
    if (outerIndex == outer.length) {
      return false;
    }
  }
  
  return true;
}
  

public int[] squareUp(int n) {
  int[] result = new int[n * n];
  int value = 0;
  
  for (int i=result.length-1; i>=0; i--) {
    if (i / n >= value) {
      result[i] = value + 1;
    }
    
    value = (value + 1) % n;
  }
  
  return result;
}


public int[] seriesUp(int n) {
  int[] result = new int[n * (n + 1) / 2];
  int loc = 0;
  
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
      result[loc] = j;
      loc++;
    }
  }
  
  return result;
}

// helper function for maxMirror
public int[] getSlice(int[] nums, int start, int end) {
  int len = end - start;
  int[] result = new int[len];
  
  for (int i=0; i<len; i++) {
    result[i] = nums[start + i];
  }
  
  return result;
  }
  
  // another helper function for maxMirror
  public boolean areMirrors(int[] nums1, int[] nums2) {
   for (int i=0; i<nums1.length; i++) {
    int front1 = nums1[i];
    int back2 = nums2[nums2.length - i - 1];
    
    if (front1 != back2) {
      return false;
    }  
  }
  
  return true;
  }
  
  // god, this is hideous
  public int maxMirror(int[] nums) {
  int longest = nums.length;
  
  while (longest > 0) {
    int stop = nums.length - longest + 1;
    
    for (int i=0; i<stop; i++) {
      int [] slice1 = getSlice(nums, i, i + longest);
    
      for (int j=0; j<stop; j++) {
        int [] slice2 = getSlice(nums, j, j + longest);
      
        if (areMirrors(slice1, slice2)) {
          return longest;
        }
      }
    }
    
    longest--;
  }
  
  return 0;
}


public int countClumps(int[] nums) {
  int count = 0;
  int streak = 0;
  
  for (int i=0; i<nums.length-1; i++) {
    if (nums[i] == nums[i+1]) {
      streak += 1;
    
      if (streak == 1) {
        count++;
      }
    }
    else {
      streak = 0;
    }
  }
  
  return count;
}
  