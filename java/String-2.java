public String doubleChar(String str) {
  String result = "";
  
  for (int i = 0; i < str.length(); i++) {
    String c = str.substring(i, i + 1);
    result += c + c;
  }
  
  return result;
}
  

public int countHi(String str) {
  int count = 0;
  
  for (int i = 0; i < str.length() - 1; i++) {
    String part = str.substring(i, i + 2);
    
    if (part.equals("hi")) {
      count++;
    }
  }
  
  return count;
}
  

public boolean catDog(String str) {
  int cats = 0;
  int dogs = 0;
  
  for (int i = 0; i < str.length() - 2; i++) {
    String part = str.substring(i, i + 3);
    
    if (part.equals("cat")) {
      cats++;
    }
    else if (part.equals("dog")) {
      dogs++;
    }
  }
  
  return dogs == cats;
}


// hint: rephrase the question. 
// how many characters are preceded by co and followed by e?
public int countCode(String str) {
  int count = 0;
  
  for (int i = 2; i < str.length() - 1; i++) {
    String before = str.substring(i - 2, i);
    String after = str.substring(i + 1, i + 2);
    
    if (before.equals("co") && after.equals("e")) {
      count++;
    }
  }
  
  return count;
}
  

public boolean endOther(String a, String b) {
  String small = a.toLowerCase();
  String big = b.toLowerCase();
  
  if (a.length() > b.length()) {
    String temp = a;
    small = b;
    big = temp;
  }
  
  String endBig = big.substring(big.length() - small.length());
  
  return endBig.equals(small);
  
  // or just do this
  /*
  return small.endsWith(big) || big.endsWith(small);
  */
}
  

public boolean xyzThere(String str) {
  str = " " + str;
  
  for (int i = 1; i < str.length() - 2; i++) { 
    String part = str.substring(i, i + 3);
    String before = str.substring(i - 1, i);
    
    if (part.equals("xyz") && !before.equals(".")) {
      return true;
    }
  }
  
  return false;
}
  

public boolean bobThere(String str) {
  for (int i = 0; i < str.length() - 2; i++) {
    char first = str.charAt(i);
    char third = str.charAt(i + 2);
    
    if (first == 'b' && third == 'b') {
      return true;
    }
  }
  
  return false;
}
  

public boolean xyBalance(String str) {
  for (int i = str.length() - 1; i >= 0; i--) {
    char c = str.charAt(i);
    
    if (c == 'x') {
      return false;
    }
    else if (c == 'y') {
      return true;
    }
  }
  
  return true;
  
  // or just do this
  /*
  return str.lastIndexOf("x") <= str.lastIndexOf("y");
  */
}
  

public String mixString(String a, String b) {
  String result = "";
  int i = 0;
  
  while (i < a.length() && i < b.length()) {
    result += a.charAt(i);
    result += b.charAt(i);
    i++;
  }
  
  return result + a.substring(i) + b.substring(i);
}
  

public String repeatEnd(String str, int n) {
  String result = "";
  String lastNChars = str.substring(str.length() - n);
  
  for (int i = 0; i < n; i++) {
    result += lastNChars;
  }
  
  return result;
}

  
public String repeatFront(String str, int n) {
  String result = "";
  String firstNChars = str.substring(0, n);
  
  for (int i = 0; i < n; i++) {
    result += firstNChars.substring(0, n - i);
  }
  
  return result;
}
  

public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  
  for (int i = 0; i < count; i++) {
    result += word;
    
    if (i < count - 1) {
      result += sep; 
    }
  }

  return result;
}
  

public boolean prefixAgain(String str, int n) {
  String prefix = str.substring(0, n);
  String rest = str.substring(n);
  
  return rest.contains(prefix);
}
  

public boolean xyzMiddle(String str) {
  if (str.length() < 3) {
    return false;
  }
  
  int start = str.length() / 2 - 1;
  int end = str.length() / 2 + 1;
  
  // even length strings have 4 characters in the middle
  if (str.length() % 2 == 0) {
    start -= 1;
  }
  
  String midPart = str.substring(start, end + 1);
  
  return midPart.contains("xyz");
}
  

public String getSandwich(String str) {
  int firstBread = str.indexOf("bread");
  int lastBread = str.lastIndexOf("bread");
  
  if (firstBread == lastBread) {
    return "";
  }
  
  return str.substring(firstBread + 5, lastBread);
}
  

public boolean sameStarChar(String str) {
  for (int i = 1; i < str.length() - 1; i++) {
    char before = str.charAt(i - 1);
    char current = str.charAt(i);
    char after = str.charAt(i + 1);
    
    if (current == '*' && before != after) {
      return false;
    }
  }
  
  return true;
}
 

public String oneTwo(String str) {
  String result = "";
  
  for (int i = 0; i < str.length() - 2; i += 3) {
    String one = str.substring(i, i + 1);
    String twoThree = str.substring(i + 1, i + 3);
    
    result += twoThree + one;
  }
  
  return result;
}
  

// Make a new string consisting of all chars in str that do not
// have a z immediately before it and a p immediately after it.
public String zipZap(String str) {
  String result = "";
  str = " " + str + " ";
  
  for (int i = 1; i < str.length() - 1; i++) {
    boolean noZ = str.charAt(i - 1) != 'z';
    boolean noP = str.charAt(i + 1) != 'p';
  
    if (noZ || noP) {
      result += str.charAt(i);
    }
  }
  
  return result;
}
  

public String starOut(String str) {
  String result = "";
  str = " " + str + " ";
  
  for (int i = 1; i < str.length() - 1; i++) {
    String chunk = str.substring(i - 1, i + 2);
    
    if (chunk.indexOf("*") == -1) {
      result += str.substring(i, i + 1);
    }
  }
  
  return result;
}
  

public String plusOut(String str, String word) {
  String result = "";
  
  while (result.length() < str.length()) {
    String restOfStr = str.substring(result.length());
    
    if (restOfStr.indexOf(word) == 0) {
      result += word;
    }
    else {
      result += "+";
    }
  }
  
  return result;
}


public String wordEnds(String str, String word) {
  String result = "";
  
  int wordLoc = str.indexOf(word);
  
  while (wordLoc > -1) {
    if (wordLoc > 0) {
      result += str.charAt(wordLoc - 1);
    }
    
    if (wordLoc < str.length() - word.length()) {
      result += str.charAt(wordLoc + word.length());
    }
    
    wordLoc = str.indexOf(word, wordLoc + word.length());
  }
  
  return result;
}
