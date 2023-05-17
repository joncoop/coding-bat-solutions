public int factorial(int n) {
  if (n <= 1) {
    return 1;
  }
  else {
    return n * factorial(n - 1);
  }
}
  

public int bunnyEars(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  else {
    return 2 + bunnyEars(bunnies - 1);
  }
}
  

public int fibonacci(int n) {
  if (n <= 1) {
    return n;
  }
  
  return fibonacci(n - 1) + fibonacci(n - 2);
}
  

public int bunnyEars2(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  
  int thisBunny = 2 + (bunnies + 1) % 2;
  
  return thisBunny + bunnyEars2(bunnies - 1);
}
  

public int triangle(int rows) {
  if (rows == 0) {
    return 0;
  }
  
  return rows + triangle(rows - 1);
}
  

public int sumDigits(int n) {
  if (n == 0) {
    return 0;
  }
  
  return n % 10 + sumDigits(n / 10);
}
  

public int count7(int n) {
  if (n == 0) {
    return 0;
  }
  
  int seven = 0;
  
  if (n % 10 == 7) {
    seven = 1;
  }
  
  return seven + count7(n / 10);
}
  

public int count8(int n) {
  if (n == 0) {
    return 0;
  }
  
  int count = 0;
  
  if (n % 100 == 88) {
    count = 2;
  }
  else if (n % 10 == 8) {
    count = 1;
  }
  
  return count + count8(n / 10);
}
  

public int powerN(int base, int n) {
  if (n == 0) {
    return 1;
  }
  
  return base * powerN(base, n - 1);
}
  

public int countX(String str) {
  if (str.length() == 0) {
    return 0;
  }
  
  int n = 0;
  
  if (str.charAt(0) == 'x') {
    n = 1;
  }
  
  return n + countX(str.substring(1));
}
  

public int countHi(String str) {
  if (str.length() < 2) {
    return 0;
  }
  
  String part = str.substring(0, 2);
  String rest = str.substring(1);
  
  return 1 + part.indexOf("hi") + countHi(rest);
}


public String changeXY(String str) {
  
  if (str.length() > 0) {
    String first = str.substring(0, 1);
    String rest = str.substring(1);
    
    if (first.equals("x")) {
      return "y" + changeXY(rest);
    }
    else {
      return first + changeXY(rest);
    }
  }
  else {
    return "";
  }
}
  

public String changePi(String str) {
  if (str.length() < 2) {
    return str;
  }
  
  String first = str.substring(0, 2);
  
  if (first.equals("pi")) {
    return "3.14" + changePi(str.substring(2));
  }
  else {
    return str.substring(0, 1) + changePi(str.substring(1));
  }
}
  

public String noX(String str) {
  int xLoc = str.indexOf("x");
  
  if (xLoc == -1) {
    return str;
  }
  else if (xLoc == 0) {
    return noX(str.substring(1));
  }
  else {
    return str.substring(0, 1) + noX(str.substring(1));
  }
}
  

public boolean array6(int[] nums, int index) {
  if (index >= nums.length) {
    return false;
  }
  else if (nums[index] == 6) {
    return true;
  }
  else {
    return array6(nums, index + 1);
  }
}  


public int array11(int[] nums, int index) {
  if (index >= nums.length) {
    return 0;
  }
  
  int count = 0;
  
  if (nums[index] == 11) {
    count = 1;
  }
  
  return count + array11(nums, index + 1);
}
  
 
public boolean array220(int[] nums, int index) {
  if (index >= nums.length - 1) {
    return false;
  }
  else if (nums[index] * 10 == nums[index + 1]) {
    return true;
  }
  else {
    return array220(nums, index + 1);
  }
}
  

public String allStar(String str) {
  if (str.length() < 2) {
    return str;
  }
  
  String first = str.substring(0, 1);
  String rest = str.substring(1);
  
  return first + "*" + allStar(rest);
}
  

public String pairStar(String str) {
  if (str.length() < 2) {
    return str;
  }
  
  String one = str.substring(0, 1);
  String two = str.substring(1, 2);
  String rest = str.substring(1);
  String insert = "";
  
  if (one.equals(two)) {
    insert = "*";
  }
  
  return one + insert + pairStar(rest);
}
  

public String endX(String str) {
  int xLoc = str.indexOf("x");
  
  if (xLoc == -1) {
    return str;
  }
  
  String before = str.substring(0, xLoc);
  String after = str.substring(xLoc + 1);
  
  return before + endX(after) + "x";
}


public int countPairs(String str) {
  if (str.length() < 3) {
    return 0;
  }
  
  String front = str.substring(0, 3);
  String rest = str.substring(1);
  int amount = 0;
  
  if (front.charAt(0) == front.charAt(2)) {
    amount = 1;
  }
  
  return amount + countPairs(rest);
}
  

public int countAbc(String str) {
  if (str.length() < 3) {
    return 0;
  }
  
  String front = str.substring(0, 3);
  String rest = str.substring(1);
  int count = 0;
  
  if (front.equals("abc") || front.equals("aba")) {
    count = 1;
  }
  
  return count + countAbc(rest);
}


public int count11(String str) {
  if (str.length() < 2) {
    return 0;
  }
  
  String two = str.substring(0, 2);
  
  int n = 0;
  if (two.equals("11")) {
    n = 1;
  }
  
  return n + count11(str.substring(1 + n));
}
  

public String stringClean(String str) {
  if (str.length() < 2) {
    return str;
  }
  
  String one = str.substring(0, 1);
  String two = str.substring(1, 2);
  String afterOne = str.substring(1);
  
  if (one.equals(two)) {
    return stringClean(afterOne);
  }
  else {
    return one + stringClean(afterOne);
  }
}
  

public int countHi2(String str) {
  if (str.indexOf("hi") == -1) {
    return 0;
  }
  
  str = " " + str;
  int highLoc = str.indexOf("hi");
  char before = str.charAt(highLoc - 1);
  
  int n = 0;
  if (before != 'x') {
    n = 1;
  }
  
  return n + countHi2(str.substring(highLoc + 2));
}
  

public String parenBit(String str) {
  int first = 0;
  int last = str.length() - 1;
  
  if (str.charAt(first) == '(' && str.charAt(last) == ')') {
    return str;
  }
  
  if (str.charAt(first) != '(') {
    first++;
  }
  
  if (str.charAt(last) != ')') {
    last--;
  }
  
  return parenBit(str.substring(first, last + 1));
}
  

public boolean nestParen(String str) {
  int len = str.length();
  
  if (len == 1) {
    return false;
  }
  else if (len == 0) {
    return true;
  }
  
  String first = str.substring(0, 1);
  String last = str.substring(len - 1);
  String inner = str.substring(1, len - 1);
  
  if (first.equals("(") && last.equals(")")) {
    return nestParen(inner);
  }
  
  return false;
}
  

public int strCount(String str, String sub) {
  int strLen = str.length();
  int subLen = sub.length();
  
  if (strLen < subLen) {
    return 0;
  }
  
  String chunk = str.substring(0, subLen);
  String after = str.substring(subLen);
  
  if (chunk.equals(sub)) {
    return 1 + strCount(after, sub);
  }
  else {
    return strCount(str.substring(1), sub);
  }
}
  

public boolean strCopies(String str, String sub, int n) {
  int loc = str.indexOf(sub);
  String part = str.substring(loc + 1);
  
  if (n == 0) {
    return true;
  }
  else if (loc == -1) {
    return false;
  }
  else {
    return strCopies(part, sub, n - 1);
  }
}
  

public int strDist(String str, String sub) {
  int strLen = str.length();
  int subLen = sub.length();
  
  if (strLen < subLen) {
    return 0;
  }
  
  int first = 0;
  int last = strLen - subLen;
  
  String frontChunk = str.substring(first, subLen);
  String backChunk = str.substring(last);
  
  if (!frontChunk.equals(sub)) {
    first++;
  }
  
  if (!backChunk.equals(sub)) {
    last--;
  }
  
  if (frontChunk.equals(sub) && backChunk.equals(sub)) {
    return first + last + subLen;
  }
  else if (last < first) {
    return 0;
  }
  
  return strDist(str.substring(first, last + subLen), sub);
}
  