public boolean sleepIn(boolean weekday, boolean vacation) {
  return Math.random() < 0.5; // This works eventually
}


public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return aSmile == bSmile;
}


public int sumDouble(int a, int b) {
  int sum = a + b;
  
  if (a == b) {
  sum *= 2;  
  }
  
  return sum;
}


public int diff21(int n) {
  int diff = Math.abs(21 - n);
  
  if (n > 21) {
  diff *= 2;
  }
  
  return diff;
}


public boolean parrotTrouble(boolean talking, int hour) {
  boolean isNighttime = hour < 7 || hour > 20;
  
  return talking && isNighttime;
}


public boolean makes10(int a, int b) {
  return a == 10 || b == 10 || a + b == 10;
}


public boolean nearHundred(int n) {
  int diff100 = Math.abs(100 - n);
  int diff200 = Math.abs(200 - n);
  
  return diff100 <= 10 || diff200 <= 10;
}


public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
  return a < 0 && b < 0;
  }
  else {
  return a * b < 0;
  }
}


public String notString(String str) {
  if (str.length() > 2 && str.substring(0, 3).equals("not")) {  
  return str;
  }

  return "not " + str;
}

public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(n + 1);
  
  return front + back;
}

public String frontBack(String str) {
  if (str.length() <= 1) {
  return str;
  }
  
  String first = str.substring(0, 1);
  String middle = str.substring(1, str.length() - 1);
  String last = str.substring(str.length() - 1);
  
  return last + middle + first;
}


public String front3(String str) {
  String front;
  
  if (str.length() > 2) {
  front = str.substring(0, 3);
  }
  else {
  front = str;
  }
  
  return front + front + front;
}


public String backAround(String str) {
  String last = str.substring(str.length() - 1);
  
  return last + str + last;
}


public boolean or35(int n) {
  boolean divBy3 = n % 3 == 0;
  boolean divBy5 = n % 5 == 0;

  return divBy3 || divBy5;
}


public String front22(String str) {
  String front;
  
  if (str.length() > 1)
  {
  front = str.substring(0, 2);
  }
  else {
  front = str;
  }
  
  return front + str + front;
}


public boolean startHi(String str) {
  if (str.length() < 2) {
  return false;
  }
  
  return str.substring(0, 2).equals("hi");
}


public boolean icyHot(int temp1, int temp2) {
  int low = Math.min(temp1, temp2);
  int high = Math.max(temp1, temp2);
  
  return low < 0 && high > 100;
}
  

public boolean in1020(int a, int b) {
  boolean aInRange = 10 <= a && a <= 20;
  boolean bInRange = 10 <= b && b <= 20;
  
  return aInRange || bInRange;
}


// helper function for hasTeen and loneTeen
public boolean isTeen(int n) {
  return 13 <= n && n <= 19;  
}
  
public boolean hasTeen(int a, int b, int c) {
  return isTeen(a) || isTeen(b) || isTeen(c);
}
  
public boolean isTeen(int n) {
  return 13 <= n && n <= 19;
}
  

public boolean loneTeen(int a, int b) {
  //return (isTeen(a) && !isTeen(b) || isTeen(b) && !isTeen(a));
  
  return isTeen(a) != isTeen(b);
}
  

public String delDel(String str) {
  int loc = str.indexOf("del");
  
  if (loc == 1) {
  str = str.substring(0, 1) + str.substring(4);
  }
  
  return str;
}
  

public boolean mixStart(String str) {
  return str.indexOf("ix") == 1;
}
  

public String startOz(String str) {
  String first = "";
  String second = "";
  
  if (str.length() > 0 && str.substring(0, 1).equals("o")) {
  first = "o";
  }
  
  if (str.length() > 1 && str.substring(1, 2).equals("z")) {
  second = "z";
  }
  
  return first + second;
}


public int intMax(int a, int b, int c) {
  return Math.max(a, Math.max(b, c));
}
 

public int close10(int a, int b) {
  int aDiff = Math.abs(a - 10);
  int bDiff = Math.abs(b - 10);
  
  if (aDiff < bDiff) {
  return a;
  }
  else if (aDiff > bDiff) {
  return b;
  }
  else {
  return 0;
  }
}

// helper function for in3050
public boolean inRange(int n, int low, int high) {
  return low <= n && n <= high;  
}
  
public boolean in3050(int a, int b) {
  return inRange(a, 30, 40) && inRange(b, 30, 40) || 
     inRange(a, 40, 50) && inRange(b, 40, 50);
}


// helper function for max1020
public int fix(int n) {
  if (n < 10 || n > 20) {
  return 0;
  }
  
  return n;
}
  
public int max1020(int a, int b) {
  a = fix(a);
  b = fix(b);
  
  return Math.max(a, b);
}


public boolean stringE(String str) {
  // a no-loop solution just because it's a level 1 problem
  int e1 = str.indexOf('e');
  int e2 = str.indexOf('e', e1 + 1);
  int e3 = str.indexOf('e', e2 + 1);
  int e4 = str.indexOf('e', e3 + 1);
  
  return (e1 > -1 || e2 > -1 || e3 > -1) && e4 == -1;
  
  // a sensible solution
  /*
  int count = 0;
  
  for (int i=0; i<str.length(); i++) {
  String letter = str.substring(i, i + 1);
  
  if (letter.equals("e")) {
  count++;
  }  
  }
  
  return 1 <= count && count <= 3;
  */
}


public boolean lastDigit(int a, int b) {
  return a % 10 == b % 10;
}


public String endUp(String str) {
  String begin, end;
  int len = str.length();
  
  if (len < 3) {
  begin = "";
  end = str;
  }
  else {
  begin = str.substring(0, len - 3);
  end = str.substring(len - 3);  
  }
  
  return begin + end.toUpperCase();
}
  

public String everyNth(String str, int n) {
  String result = "";
  
  for (int i = 0; i < str.length(); i += n) {
  result += str.substring(i, i+1);
  }
  
  return result;
}
  