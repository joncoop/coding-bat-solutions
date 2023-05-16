public String stringTimes(String str, int n) {
  String result = "";
  
  for (int  i = 0; i < n; i++ ) {
    result += str;
  }
  
  return result;
}
  

public String frontTimes(String str, int n) {
  String front = str.substring(0, Math.min(str.length(), 3));
  
  String result = "";
  
  for (int  i = 0; i < n; i++ ) {
    result += front; 
  }
  
  return result;
}
  

public int countXX(String str) {
  int count = 0;
  int end = str.length() - 1;
  
  for (int  i = 0; i < end; i++ ) {
    if (str.substring(i, i + 2).equals("xx")) {
        count++;
    }
  }
  
  return count;
}
  

boolean doubleX(String str) {
  int x = str.indexOf("x");
  int xx = str.indexOf("xx");
  
  return x > -1 && x == xx; 
}
  

public String stringBits(String str) {
  String result = "";
  
  for (int  i = 0; i < str.length(); i += 2) {
    result += str.substring(i, i + 1);
  }
  
  return result;
}
 

public String stringSplosion(String str) {
  String result = "";
  
  for (int  i = 0; i < str.length(); i++ ) {
    result += str.substring(0, i + 1);
  }
  
  return result;
}
  

public int last2(String str) {
  int len = str.length();
  
  if (len < 2) {
    return 0;
  }
  
  int count = 0;  
  String lastTwo = str.substring(len - 2);
  
  for (int i= 0; i < len - 2; i++ ) {
    String theseTwo = str.substring(i, i  +  2);
    
    if (theseTwo.equals(lastTwo)) {
      count++;
    }
  }
  
  return count;
}


public int arrayCount9(int[] nums) {
  int count = 0;
  
  for (int n: nums) {
    if (n == 9) {
      count++;
    }
  }
  
  return count;
}
  

public boolean arrayFront9(int[] nums) {
  int limit = Math.min(nums.length, 4);
  
  for (int i = 0; i < limit; i++ ) {
    if (nums[i] == 9) {
      return true;
    }
  }
  
  return false;
}
  

public boolean array123(int[] nums) {
  int limit = nums.length - 2;
  
  for (int  i = 0; i < limit; i++ ) {
    if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
      return true;
    }
  }
  
  return false;
}
  
  
public int stringMatch(String a, String b) {
  int count = 0;
  int limit = Math.min(a.length(), b.length()) - 1;
  
  for (int i = 0; i < limit; i++ ) {
    String aPart = a.substring(i, i + 2);
    String bPart = b.substring(i, i + 2);
    
    if (aPart.equals(bPart)) {
      count++;
    }
  }
  
  return count;
}
  

public String stringX(String str) {
  String result = str;
  
  for (int i = str.length() - 2; i > 0; i--) {
    if (str.charAt(i) == 'x') {
      String before = result.substring(0, i);
      String after = result.substring(i  +  1);
    
      result = before  +  after;
    }
  }
  
  return result;
}
  

public String altPairs(String str) {
  String result = "";
  int len = str.length();
  
  for (int  i = 0; i < str.length(); i += 4) {
    if (i < len-1) { 
      result += str.substring(i, i + 2);
    }
    else {
      result += str.substring(i, i + 1);
    }
  }
  
  return result;
}
  

public String stringYak(String str) {
  String result = "";
  
  int i;
  
  for ( i = 0; i < str.length() - 2; i++ ) {
    String maybeYak = str.substring(i, i + 3);
    String first = maybeYak.substring(0, 1);
    String last = maybeYak.substring(2, 3);
    
    if (first.equals("y") && last.equals("k")) {
      i += 2;
    }
    else {
      result += first;
    }
  }
  
  return result  +  str.substring(i);
}
  

public int array667(int[] nums) {
  int count = 0;
  int limit = nums.length - 1;
  
  for (int  i = 0; i < limit; i++ ) {
    if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] ==7)) {
      count++;
    }
  }
  
  return count;
}
  

public boolean noTriples(int[] nums) {
  int limit = nums.length - 2;
  
  for (int  i = 0; i < limit; i++ ) {
    if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
      return false;
    }
  }
  
  return true;
}
  

public boolean has271(int[] nums) {
  int limit = nums.length - 2;
  
  for (int  i = 0; i < limit; i++ ) {
    int first = nums[i];
    int second = nums[i + 1];
    int third = nums[i + 2];
    
    boolean fiveMore = second == first  +  5;
    boolean oneIshLess = Math.abs(first - 1 - third) <= 2;
    
    if (fiveMore && oneIshLess) {
      return true;
    }
  }
  
  return false;
}
