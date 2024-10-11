public int countEvens(int[] nums) {
  int count = 0;
  
  for (int n: nums) {
    if (n % 2 == 0) {
      count += 1;
    }
  }
  
  return count;
}
  

public int bigDiff(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  
  for (int n : nums) {
    max = Math.max(n, max);
    min = Math.min(n, min);
  }
  
  return max - min;
}
  

public int centeredAverage(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  int sum = 0;
  
  for (int n : nums) {
    max = Math.max(n, max);
    min = Math.min(n, min);
    sum += n;
  }
  
  return (sum - max - min) / (nums.length - 2);
}
  

public int sum13(int[] nums) {
  int sum = 0;
  int i = 0;
  
  while (i < nums.length) {
    int value = nums[i];
    
    if (value == 13) {
      i += 2;    
    }  
    else {
      sum += nums[i];      
      i += 1;
    }
  }
  
  return sum;
}


public int sum67(int[] nums) {
  boolean countIt = true;
  int sum = 0;
  
  for (int n : nums)
  {
    if (n == 6) {
      countIt = false;
    }
  
    if (countIt) {
      sum += n;
    }
    
    if (n == 7) {
      countIt = true;
    }
  }
  
  return sum;
}


public boolean has22(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 2 && nums[i + 1] == 2) {
      return true;
    }
  }
  
  return false;
}


public boolean lucky13(int[] nums) {
  for (int n : nums) {
    if (n == 1 || n == 3) {
      return false;
    }
  }
  
  return true;
}
  

public boolean sum28(int[] nums) {
  int sum = 0;
  
  for (int n : nums) {
    if (n == 2) {
      sum += n;
    }
  }
  
  return sum == 8;
}
  

public boolean more14(int[] nums) {
  int ones = 0;
  int fours = 0;
  
  for (int n: nums) {
    if (n == 1) {
      ones++;
    }
    else if (n == 4) {
      fours++;
    }
  }
  
  return ones > fours;
}
  

public int[] fizzArray(int n) {
  int[] nums = new int[n];
  
  for (int i= 0; i < nums.length; i++) {
    nums[i] = i;
  }
    
  return nums;
}
  
  
public boolean only14(int[] nums) {
  for (int n: nums) {
    if (n != 1 && n != 4) {
      return false;
    }
  }
  
  return true;
}
  

public String[] fizzArray2(int n) {
  String[] result = new String[n];
  
  for (int i = 0; i < n; i++) {
    result[i] = Integer.toString(i);
  }
  
  return result;
}
  

public boolean no14(int[] nums) {
  boolean hasOnes = false;
  boolean hasFours = false;
  
  for (int n: nums) {
    hasOnes = hasOnes || n == 1;
    hasFours = hasFours || n == 4;
  }
  
  return !hasOnes || !hasFours;
}


public boolean isEverywhere(int[] nums, int val) {
  int limit = nums.length - 1;
  
  for (int i = 0; i < limit; i++) {
    int n1 = nums[i];
    int n2 = nums[i + 1];
    
    if (n1 != val && n2 != val) {
      return false;
    }
  }
  
  return true;
}
  
  
public boolean either24(int[] nums) {
  int limit = nums.length -1;
  boolean hasTwoPair = false;
  boolean hasFourPair = false;
  
  for (int i = 0; i < limit; i++) {
    int n1 = nums[i];
    int n2 = nums[i+1];
    
    if (n1 == 2 && n2 == 2) {
      hasTwoPair = true;
    }
  
    if (n1 == 4 && n2 == 4) {
      hasFourPair = true;
    }
  }
  
  return hasTwoPair != hasFourPair;
}
  

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  
  for (int i = 0; i < nums1.length; i++) {
    int diff = Math.abs(nums1[i] - nums2[i]);
    
    if (diff == 1 || diff == 2) {
      count++;
    }
  }
  
  return count;
}
  

public boolean has77(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 7) {
      if (nums[i + 1] == 7){
        return true;
      }
      else if (i < nums.length - 2 && nums[i + 2] == 7) {
        return true;
      }
    }
  }
  
  return false;
}
  

public boolean has12(int[] nums) {
  boolean hasOne = false;
  
  for (int n: nums) {
    if (n == 1) {
      hasOne = true;
    }
    else if (hasOne && n == 2) {
      return true;
    }
  }
  
  return false;
}
  

public boolean modThree(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++) {
    int r1 = nums[i] % 2;
    int r2 = nums[i + 1] % 2;
    int r3 = nums[i + 2] % 2;
  
    if (r1 == r2 && r2 == r3) {
      return true;
    }
  }
  
  return false;
}
  

public boolean haveThree(int[] nums) {
  int count = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      count++;
    
      if (i < nums.length - 1 && nums[i + 1] == 3) {
        return false;
      }
    }
  }
  
  return count == 3;
}


public boolean twoTwo(int[] nums) {
  boolean twoBefore, twoAfter;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      twoBefore = i > 0 && nums[i - 1] == 2;
      twoAfter = i < nums.length - 1 && nums[i + 1] == 2;
    
      if (!twoBefore && !twoAfter) {
        return false;
      }
    }
  }
  
  return true;
}
  

public boolean sameEnds(int[] nums, int len) {
  for (int i = 0; i < len; i++) {
    int j = nums.length - len + i;
    
    if (nums[i] != nums[j]) {
      return false;
    }  
  }
  
  return true;
}
  


public boolean tripleUp(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++) {
    int a = nums[i];
    int b = nums[i + 1] - 1;
    int c = nums[i + 2] - 2;
    
    if (a == b && b == c) {
      return true;
    }
  }
  
  return false;
}
  

public int[] fizzArray3(int start, int end) {
  int[] result = new int[end - start];
  
  for (int i = 0; i < result.length; i++) {
    result[i] = start + i;
  }
  
  return result;
}
  

public int[] shiftLeft(int[] nums) {
  if (nums.length == 0) {
    return nums;
  }
  
  int temp = nums[0];
  
  for (int i = 1; i < nums.length; i++) {
    nums[i-1] = nums[i];
  }
  
  nums[nums.length - 1] = temp;
  
  return nums;
}
  

public int[] tenRun(int[] nums) {
  boolean streakActive = false;
  int currentMultiple = 0;
  
  for (int i=0; i<nums.length; i++) {
    if (nums[i] % 10 == 0) {
      streakActive = true;
      currentMultiple = nums[i];
    }
    else if (streakActive) {
      nums[i] = currentMultiple; 
    }
  }
  
  return nums;
}
  

public int[] pre4(int[] nums) {
  int count = 0;
  
  while (nums[count] != 4) {
    count++;
  }
  
  int[] result = new int[count];
  
  for (int i = 0; i < result.length; i++) {
    result[i] = nums[i];
  }
  
  return result;
}
  

public int[] post4(int[] nums) {
  int end = nums.length - 1;
  
  while (nums[end] != 4) {
    end--;
  }
  
  int[] result = new int[nums.length - end - 1];
  
  for (int i = 0; i < result.length; i++) {
    result[i] = nums[i + end + 1];
  }
  
  return result;
}


public int[] notAlone(int[] nums, int val) {
  for (int i = 1; i < nums.length - 1; i++) {
    int before = nums[i - 1];
    int current = nums[i];
    int after = nums[i + 1];
    
    if (current == val && current != before && current != after) {
      nums[i] = Math.max(before, after);
    }
  }
  
  return nums;
}
  

public int[] zeroFront(int[] nums) {
  int[] result = new int[nums.length];
  int loc = nums.length - 1;
  
  for (int n: nums) {
    if (n != 0) {
      result[loc] = n;
      loc--;
    }
  }
  
  return result;
}
  

public int[] withoutTen(int[] nums) {
  int[] result = new int[nums.length];
  
  int insert = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 10) {
      result[insert] = nums[i];
      insert++;
    }
  }
  
  return result;
}
  

public int[] zeroMax(int[] nums) 
{
  int maxOdd = 0;
  
  for (int i=nums.length-1; i>=0; i--)
  {
    if (nums[i] % 2 == 1 && nums[i] > maxOdd)
    {
      maxOdd = nums[i];
    }
  
    if (nums[i] == 0)
    {
      nums[i] = maxOdd;
    }
  }
  
  return nums;
}


public int[] evenOdd(int[] nums) {
  int[] result = new int[nums.length];
  int evenLoc = 0;
  int oddLoc = nums.length - 1;
  
  for (int n: nums) {
    if (n % 2 == 0) {
      result[evenLoc] = n;
      evenLoc++;
    }
    else {
      result[oddLoc] = n;
      oddLoc--;
    }
  }
  
  return result;
}


// helper function for fizzBuzz
public String getValue(int n) {
  String result = "";
  
  if (n % 3 == 0) {
    result += "Fizz";
  }
  
  if (n % 5 == 0) {
    result += "Buzz";
  }
  
  if (result.length() == 0) {
    result += String.valueOf(n);
  }
  
  return result;
}
  
public String[] fizzBuzz(int start, int end) {
  String[] result = new String[end - start];
  
  for (int i = 0; i < result.length; i++) {
    result[i] = getValue(i + start);
  }
  
  return result;
}
