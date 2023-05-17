public boolean firstLast6(int[] nums) {
  int first = nums[0];
  int last = nums[nums.length - 1];
  
  return first == 6 || last == 6;
}


public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  
  return len > 0 && nums[0] == nums[len - 1];
}

  
public int[] makePi() {
  return new int[] {3, 1, 4};  
}


public boolean commonEnd(int[] a, int[] b) {
  int aFirst = a[0];
  int aLast = a[a.length - 1];
  int bFirst = b[0];
  int bLast = b[b.length -1];
  
  return aFirst == bFirst || aLast == bLast;
}


public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}
  

public int[] rotateLeft3(int[] nums) {
  int temp = nums[0];
  
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = temp;
  
  return nums;
}


public int[] reverse3(int[] nums) {
  int temp = nums[0];
  
  nums[0] = nums[2];
  nums[2] = temp;
  
  return nums;
}
  


public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  
  int[] result = {max, max, max};
  
  return result;
}
  


public int sum2(int[] nums) {
  int sum = 0;
  
  if (nums.length > 0) {
    sum += nums[0];
  }
  
  if (nums.length > 1) {
    sum += nums[1];
  }
  
  return sum;
}


public int[] middleWay(int[] a, int[] b) {
  int middle1 = a[1];
  int middle2 = b[1];
  
  int[] result = {middle1, middle2};
  
  return result;
}


public int[] makeEnds(int[] nums) {
  int first = nums[0];
  int last = nums[nums.length - 1];
  
  int[] result = new int[2];
  result[0] = first;
  result[1] = last;
  
  return result;
}

  
public boolean has23(int[] nums) {
  return nums[0] == 2 || nums[0] == 3 || 
         nums[1] == 2 || nums[1] == 3;
}


public boolean no23(int[] nums) {
  boolean noTwos = nums[0] != 2 && nums[1] != 2;
  boolean noThrees = nums[0] != 3 && nums[1] != 3;
  
  return noTwos && noThrees;
}
  

public int[] makeLast(int[] nums) {
  int len = nums.length;
  
  int[] result = new int[2 * len];
  
  result[2 * len - 1] = nums[len-1];
  
  return result;
}
  

public boolean double23(int[] nums) {
  if (nums.length < 2) {
    return false;
  }
 
  boolean double2 = nums[0] == 2 && nums[1] == 2;
  boolean double3 = nums[0] == 3 && nums[1] == 3;

  return double2 || double3;
}
  

public int[] fix23(int[] nums) {
  
  if (nums[1] == 2 && nums[2] == 3) {
    nums[2] = 0; 
  }
  
  if (nums[0] == 2 && nums[1] == 3) {
    nums[1] = 0; 
  }
  
  return nums;
}
  

public int start1(int[] a, int[] b) {
  int count = 0;
  
  if (a.length > 0 && a[0] == 1) {
    count++;
  }
  
  if (b.length > 0 && b[0] == 1) {
    count++;
  }
  
  return count;
}
 

public int[] biggerTwo(int[] a, int[] b) {
  int sumA = a[0] + a[1];
  int sumB = b[0] + b[1];
  
  if (sumA >= sumB) {
    return a;
  }
  else {
    return b;
  }
}
  

public int[] makeMiddle(int[] nums) {
  int lowMid = nums[nums.length / 2 - 1];
  int highMid = nums[nums.length / 2];
  
  int[] result = {lowMid, highMid};
  
  return result;
}
  

public int[] plusTwo(int[] a, int[] b) {
  int[] result = {a[0], a[1], b[0], b[1]};
  
  return result;
}
  

public int[] swapEnds(int[] nums) {
  int temp = nums[0];
  int lastPos = nums.length - 1;
  
  nums[0] = nums[lastPos];
  nums[lastPos] = temp;
  
  return nums;
}
  

public int[] midThree(int[] nums) {
  int lowMid = nums[nums.length / 2 - 1];
  int mid = nums[nums.length / 2];
  int highMid = nums[nums.length / 2 + 1];
  
  int[] result = {lowMid, mid, highMid};
  
  return result;
}
  


public int maxTriple(int[] nums) {
  int first = nums[0];
  int mid = nums[nums.length / 2];
  int last = nums[nums.length - 1];
  
  return Math.max(first, Math.max(mid, last));
}
  

public int[] frontPiece(int[] nums) {
  int size = Math.min(nums.length, 2);
  
  int[] result = new int[size];
  
  if (size >= 1) {
    result[0] = nums[0];
  
    if (size == 2) {
    result[1] = nums[1];
    }
  }
  
  return result;
}
  

// helper function for unlucky1
public boolean isUnlucky(int[] nums, int loc) {
  return nums[loc] == 1 && 
       loc < nums.length - 1 && 
       nums[loc + 1] == 3;
}
  
public boolean unlucky1(int[] nums) {
  if (nums.length >= 2) {
    return isUnlucky(nums, 0) ||
       isUnlucky(nums, 1) ||
       isUnlucky(nums, nums.length - 1) ||
       isUnlucky(nums, nums.length - 2);
  }
  
  return false;
}
  

public int[] make2(int[] a, int[] b) {
  int[] result = new int[2];
  
  if (a.length >= 2) {
    result[0] = a[0];
    result[1] = a[1];
  }
  else if (a.length == 1) {
    result[0] = a[0];
    result[1] = b[0];
  }
  else {
    result[0] = b[0];
    result[1] = b[1];
  }
  
  return result;
}
  

public int[] front11(int[] a, int[] b) {
  int aLen = a.length;
  int bLen = b.length;
  
  if (aLen == 0 && bLen == 0) {
    return new int[] {};
  }
  else if (aLen == 0) {
    return new int[] {b[0]};
  }
  else if (bLen == 0) {
    return new int[] {a[0]};
  }
  else {
    return new int[] {a[0], b[0]};
  }
}
