public int countYZ(String str) {
  str = str.toLowerCase();
  str += " ";
  
  int count = 0;
  
  for (int i=0; i < str.length() - 1; i++) {
    char c = str.charAt(i);
    char after = str.charAt(i+1);
    boolean isEndOfWord = !Character.isLetter(after);
  
    if (isEndOfWord && (c =='y' || c =='z')) {
      count += 1;
    }
  }
  
  return count;
}


public String withoutString(String base, String remove) {
  String result = "";
  remove = remove.toLowerCase();
  
  int i = 0;
  int limit = base.length() - remove.length() + 1;
  
  while (i < limit) {
    String part = base.substring(i, i + remove.length());
    part = part.toLowerCase();
    
    if (part.equals(remove)) {
      i += remove.length();
    }
    else {
      result += base.substring(i, i + 1);
      i += 1;
    }
  }
  
  return result + base.substring(i);
}


public boolean equalIsNot(String str) {
  str += " ";
  
  int isCount = 0;
  int notCount = 0;
  
  for (int i=0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 2).equals("is")) {
      isCount += 1;
    }
    else if (str.substring(i, i + 3).equals("not")) {
      notCount += 1;
    }
  }
  
  return isCount == notCount;
}
  

public boolean gHappy(String str) {
  
  str = " " + str + " ";
  
  for (int i = 1; i < str.length() - 1; i++) {
    boolean gBefore = str.charAt(i-1) == 'g';
    boolean gBetween = str.charAt(i) == 'g';
    boolean gAfter = str.charAt(i+1) == 'g';
    
    if (gBetween && !gBefore && !gAfter) {
      return false;
    }
  }
  
  return true;
}
  

public int countTriple(String str) {
  int count = 0;
  
  for (int i=0; i < str.length()-2; i++) {
    char a = str.charAt(i);
    char b = str.charAt(i+1);
    char c = str.charAt(i+2);
    
    if (a == b && b == c) {
      count++;
    }
  }
  
  return count;
}
  

public int sumDigits(String str) {
  int sum = 0;
  
  for (int i = 0; i < str.length(); i++) {
    int d = str.charAt(i) - 48;
    
    if (d >= 0 && d <= 9) {
      sum += d;
    }
  }
  
  return sum;
}
  

public String sameEnds(String str) {
  int longest = str.length() / 2;
  
  String front = str.substring(0, longest);
  String back = str.substring(str.length() - longest);
  
  while (!front.equals(back)) {
    longest--;
    front = str.substring(0, longest);
    back = str.substring(str.length() - longest);
  }
  
  return front;
}
  

public String mirrorEnds(String str) {
  int i = 0;
  
  while (i < str.length() && str.charAt(i) == str.charAt(str.length() - i - 1)) {
    i++;
  }
  
  return str.substring(0, i);
}
  

public int maxBlock(String str) {
  int longestStreak = 0;
  int currentStreak = 0;
  int last = -1;
  
  for (int i=0; i<str.length(); i++) {
    int c = str.charAt(i);
    
    if (c == last) {
      currentStreak++;
    }
    else {
      last = c;
      currentStreak = 1;
    }
    
    longestStreak = Math.max(currentStreak, longestStreak);
  }
  
  return longestStreak;
}
  

public int sumNumbers(String str) {
  int sum = 0;
  int currentNum = 0;
  
  for (int i = 0; i < str.length(); i++) {
    int digit = str.charAt(i) - 48; // '0' is ASCII 48
    
    if (digit >= 0 && digit <= 9) {
      currentNum = 10 * currentNum + digit;
    }
    else {
      sum += currentNum;
      currentNum = 0;
    }
  }
  
  return sum + currentNum;
}
  

public String notReplace(String str) {
  String result = "";
  str = "   " + str + " ";
  
  for (int i = 3; i < str.length(); i++) {
    boolean nonLetterBefore = !Character.isLetter(str.charAt(i - 3));
    boolean isBetween = str.substring(i - 2, i).equals("is");
    boolean nonLetterAfter = !Character.isLetter(str.charAt(i));
    
    if (nonLetterBefore && isBetween && nonLetterAfter) {
      result += " not";
    }
  
    result += str.substring(i, i+1);
  }
  
  return result.substring(0, result.length() - 1);
}
