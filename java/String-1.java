public String helloName(String name) {
  return "Hello " + name + "!";
}
 

public String makeAbba(String a, String b) {
  return a + b + b + a;
}
 

public String makeTags(String tag, String word) {
  String open = "<" + tag + ">";
  String close = "</" + tag + ">";
  
  return open + word + close;
}
  

public String makeOutWord(String out, String word) {
  String begin = out.substring(0, 2);
  String end = out.substring(2);
  
  return begin + word + end;
}
  

public String extraEnd(String str) {
  int loc = str.length() - 2;
  
  String lastTwo = str.substring(loc);
  
  return lastTwo + lastTwo + lastTwo;
}


public String firstTwo(String str) {
  int last = Math.min(str.length(), 2);
  
  return str.substring(0, last);
}
  

public String firstHalf(String str) {
  int mid = str.length() / 2;
  
  return str.substring(0, mid);
}
  

public String withoutEnd(String str) {
  int begin = 1;
  int end = str.length() - 1;
  
  return str.substring(begin, end);
}
  

public String comboString(String a, String b) {
  String result;
  
  if (a.length() < b.length()) {
    result =  a + b + a;
  }
  else {
    result = b + a + b;
  }
  
  return result;
}
  

public String nonStart(String a, String b) {
  String aEnd = a.substring(1);
  String bEnd = b.substring(1);
  
  return aEnd + bEnd;
}
  

public String left2(String str) {
  String front = str.substring(0, 2);
  String back = str.substring(2);
  
  return back + front;
}
  

public String right2(String str) {
  int loc = str.length() - 2;
  
  String begin = str.substring(0, loc);
  String end = str.substring(loc);
  
  return end + begin;
}
  

public String theEnd(String str, boolean front) {
  if (front) {
    return str.substring(0, 1);
  }
  else {
    return str.substring(str.length() - 1);
  }
}
  

public String withouEnd2(String str) {
  int len = str.length();
  
  if (len < 2) {
    return "";
  }
  else {
    return str.substring(1, len - 1);
  }
}
  

public String middleTwo(String str) {
  int mid = str.length() / 2;
  
  return str.substring(mid - 1, mid + 1);
}
 

public boolean endsLy(String str) {
  int len = str.length();
  
  if (len < 2) {
    return false;
  }
  
  return str.substring(len - 2).equals("ly");
}
  

public String nTwice(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(str.length() - n);
  
  return front + back;
}
  

public String twoChar(String str, int index) {
  int start = index;
  int end = index + 2;
  
  if (index < 0 || str.length() - index < 2) {
    start = 0;
    end = 2;
  }
  
  return str.substring(start, end);
}
  

public String middleThree(String str) {
  int mid = str.length() / 2;
  
  return str.substring(mid - 1, mid + 2);
}
  

public boolean hasBad(String str) {
  int loc = str.indexOf("bad");
  
  return loc == 0 || loc == 1;
}
  

public String atFirst(String str) {
  int len = str.length();
  
  if (len == 0) {
    str = str + "@@";
  }
  else if (len == 1) {
    str = str + "@";
  }
  
  return str.substring(0, 2);
}
  

public String lastChars(String a, String b) {
  if (a.length() == 0) {
    a = "@";
  };
  
  if (b.length() == 0) {
    b = "@";
  };
  
  String firstA = a.substring(0, 1);
  String lastB = b.substring(b.length() - 1);
  
  return firstA + lastB;
}
  

public String conCat(String a, String b) {
  if (a.length() > 0 && b.length() > 0) {
    String lastA = a.substring(a.length() - 1);
    String firstB = b.substring(0, 1);
    
    if (lastA.equals(firstB)) {
      b = b.substring(1);
    }
  }
  
  return a + b;
}


public String lastTwo(String str) {
  int len = str.length();
  
  if (len >= 2) {
    String front = str.substring(0, len - 2);
    String almostLast = str.substring(len - 2, len - 1);
    String last = str.substring(len - 1);
    
    str = front + last + almostLast;
  }
   
  return str;
}
  

public String seeColor(String str) {
  str += "  "; // four spaces
  
  if (str.substring(0, 3).equals("red")) {
    return "red";
  }
  else if (str.substring(0, 4).equals("blue")) {
    return "blue";
  }
  
  return "";
}
  

public boolean frontAgain(String str) {
  int len = str.length();
  
  if (len >= 2) {
    String firstTwo = str.substring(0, 2);
    String lastTwo = str.substring(len - 2);
    
    return firstTwo.equals(lastTwo);
  }
  
  return false;
}
  

public String minCat(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen > bLen) {
    a = a.substring(aLen - bLen);
  }
  else if (bLen > aLen) {
    b = b.substring(bLen - aLen);
  }
  
  return a + b;
}
  

public String extraFront(String str) {
  int end = Math.min(str.length(), 2);
  
  String front = str.substring(0, end);
  
  return front + front + front;
}
  

public String without2(String str) {
  int len = str.length();
  
  if (len >= 2) {
    String firstTwo = str.substring(0, 2);
    String lastTwo = str.substring(len - 2);
    String rest = str.substring(2);
    
    if (firstTwo.equals(lastTwo)) {
      str = rest; 
    }
  }
  
  return str;
}
  

public String deFront(String str) {  
  
  String first = str.substring(0, 1);
  String second = str.substring(1, 2);
  String rest = str.substring(2);
  
  if (second.equals("b")) {
    rest = second + rest;
  }
  
  if (first.equals("a")) {
    rest = first + rest;
  }
    
  return rest;
}


public String startWord(String str, String word) {
  int sLen = str.length();
  int wLen = word.length();
  
  if (sLen >= wLen) {
    String start = str.substring(1, wLen);
    String wordEnd = word.substring(1);
  
    if (start.equals(wordEnd)) {
    return str.substring(0, wLen);
    }
  }
  
  return "";
}

  
public String withoutX(String str) {
  int len = str.length();
  
  if (len > 0 && str.substring(0, 1).equals("x")) {
    str = str.substring(1);
  }
  
  len = str.length();
  
  if (len > 0 && str.substring(len - 1).equals("x")) {
    str = str.substring(0, len - 1);
  }
  
  return str;
}
  

public String withoutX2(String str) {
  String result = "";
  String part;
  
  if (str.length() > 0) {
    part = str.substring(0, 1);
    
    if (!part.equals("x")) {
     result += part;
    } 
  }
    
  if (str.length() > 1) {
    part = str.substring(1, 2);
    
    if (!part.equals("x")) {
     result += part;
    } 
  }
    
  if (str.length() > 2) {
    part = str.substring(2);
    result += part;
  }
    
  return result;
}
