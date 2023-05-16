public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> result = new HashMap<String, Integer>();
  
  for (String s: strings) {
    result.put(s, 0);  
  }
  
  return result;
}


public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> result = new HashMap<String, Integer>();
  
  for (String s: strings) {
    int len = s.length();
    result.put(s, len);  
  }
  
  return result;
}



public Map<String, String> pairs(String[] strings) {
  Map<String, String> result = new HashMap<String, String>();
  
  for (String s: strings) {
    String first = s.substring(0, 1);
    String last = s.substring(s.length() - 1);
    
    result.put(first, last);  
  }
  
  return result;  
}


public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> result = new HashMap<String, Integer>();
  
  for (String s: strings) {
    if (result.containsKey(s)) {
      int count = result.get(s) + 1;
      result.put(s, count);
    }
    else {
      result.put(s, 1);
    }
  }
  
  return result;
}


public Map<String, String> firstChar(String[] strings) {
  Map<String, String> result = new HashMap<String, String>();
  
  for (String s: strings) {
    String letter = s.substring(0, 1);
    String value = s;
    
    if (result.containsKey(letter)) {
      value = result.get(letter) + s;
    }

    result.put(letter, value);
  }
  
  return result;
}


public String wordAppend(String[] strings) {
  String result = "";
  Map<String, Integer> counts = new HashMap<String, Integer>();
  
  for (String s: strings) {
    if (counts.containsKey(s)) {
      int value = counts.get(s) + 1;
      counts.put(s, value);
      
      if (value % 2 == 0) {
        result += s;
      }
    }
    else {
      counts.put(s, 1);
    }
  }
  
  return result;
}
  

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> result = new HashMap<String, Boolean>();
  
  for (String s: strings) {
    boolean hasKey = result.containsKey(s);
    result.put(s, hasKey); 
  }
  
  return result;
}
 

// helper function for allSwap and firstSwap
public void swap(String[] arr, int i, int j) {
  String temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}
  
  
public String[] allSwap(String[] strings) {
  Map<String, Integer> unmatched = new HashMap<String, Integer>();
  
  for (int i=0; i<strings.length; i++) {
    String word = strings[i];
    String firstLetter = word.substring(0, 1);
    
    if (unmatched.containsKey(firstLetter)) {
      int loc = unmatched.get(firstLetter);
      
      if (loc != -1) {
        swap(strings, i, loc);
        unmatched.remove(firstLetter);
      }
    }
    else {
      unmatched.put(firstLetter, i);
    }
  }
  
  return strings;
}
  
  

public String[] firstSwap(String[] strings) {
  Map<String, Integer> unmatched = new HashMap<String, Integer>();
  
  for (int i=0; i<strings.length; i++) {
    String word = strings[i];
    String firstLetter = word.substring(0, 1);
    
    if (unmatched.containsKey(firstLetter)) {
      int loc = unmatched.get(firstLetter);
      
      if (loc != -1) {
        swap(strings, i, loc);
        unmatched.put(firstLetter, -1);
      }
    }
    else {
      unmatched.put(firstLetter, i);
    }
  }
  
  return strings;
}
  