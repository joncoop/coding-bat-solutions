public Map<String, String> mapBully(Map<String, String> map) {
  if (map.containsKey("a")) {
    String aVal = map.get("a");
    
    map.put("b", aVal);
    map.put("a", "");
  }
  
  return map;
}
  

public Map<String, String> mapShare(Map<String, String> map) {
  if (map.containsKey("a")) {
    String aVal = map.get("a");
    map.put("b", aVal);
  }
  
  map.remove("c");
  
  return map;
}
  

public Map<String, String> mapAB(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    String aVal = map.get("a");
    String bVal = map.get("b");
    String combined = aVal + bVal;
    
    map.put("ab", combined);
  }
  
  return map;
}
  

public Map<String, String> topping1(Map<String, String> map) {
  if (map.containsKey("ice cream")) {
    String iceCream = map.get("ice cream");
    map.put("ice cream", "cherry");
  }
  
  map.put("bread", "butter");
  
  return map;
}
  

public Map<String, String> topping2(Map<String, String> map) {
  if (map.containsKey("ice cream")) {
    String iceCream = map.get("ice cream");
    map.put("yogurt", iceCream);
  }
  
  if (map.containsKey("spinach")) {
    String spinach = map.get("spinach");
    map.put("spinach", "nuts");
  }

  return map;
}
  

public Map<String, String> topping3(Map<String, String> map) {
  if (map.containsKey("potato")) {
    String potato = map.get("potato");
    map.put("fries", potato);
  }
  
  if (map.containsKey("salad")) {
    String salad = map.get("salad");
    map.put("spinach", salad);
  }
  
  return map;
}

public Map<String, String> mapAB2(Map<String, String> map) {
  boolean hasA = map.containsKey("a");
  boolean hasB = map.containsKey("b");

  if (hasA && hasB) {
    String aVal = map.get("a");
    String bVal = map.get("b");

    if (aVal.equals(bVal)) {
      map.remove("a");
      map.remove("b");
    }
  }

  return map;
}
  

public Map<String, String> mapAB3(Map<String, String> map) {
  boolean hasA = map.containsKey("a");
  boolean hasB = map.containsKey("b");
  
  if (hasA && !hasB) {
    String aVal = map.get("a");
    map.put("b", aVal);
  }
  else if (!hasA && hasB) {
    String bVal = map.get("b");
    map.put("a", bVal);
  }
  
  return map;
}
  

public Map<String, String> mapAB4(Map<String, String> map) {
  boolean hasA = map.containsKey("a");
  boolean hasB = map.containsKey("b");
  
  if (hasA && hasB) {
    String aVal = map.get("a");
    String bVal = map.get("b");
    String empty = "";
    
    if (aVal.length() > bVal.length()) {
      map.put("c", aVal);
    }
    else if (aVal.length() < bVal.length()) {
      map.put("c", bVal);
    }
    else {
      map.put("a", empty);
      map.put("b", empty);
    }
  }
  
  return map;
}
  