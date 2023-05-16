public boolean scoresIncreasing(int[] scores) {
  for (int i = 0; i < scores.length - 1; i++)
  {
    if (scores[i + 1] < scores[i]) {
      return false;
    }
  }
  
  return true;
}
  

public boolean scores100(int[] scores) {
  for (int i = 0; i < scores.length - 1; i++)
  {
    if (scores[i] == 100 && scores[i + 1] == 100) {
      return true;
    }
  }
  
  return false;
}
  

public boolean scoresClump(int[] scores) {
  for (int i = 0; i < scores.length - 2; i++)
    if (scores[i + 2] - scores[i] <= 2) {
      return true;
    }
    
  return false;
}


public int scoresAverage(int[] scores) {
  int mid = scores.length / 2;
  
  int sum1 = 0;
  int sum2 = 0;
  
  for (int i = 0; i < scores.length / 2; i++)
  {
    sum1 += scores[i];
    sum2 += scores[i + mid];
  }
  
  return Math.max(sum1 / mid, sum2 / mid);
  
}


public int wordsCount(String[] words, int len) {
  int count = 0;
  
  for (String w: words) {
    if (w.length() == len) {
      count += 1; 
    }
  }
    
  return count;
}
  

public String[] wordsFront(String[] words, int n) {
  String[] someWords = new String[n];
  
  for (int i = 0; i < n; i++) {
    someWords[i] = words[i];
  }
    
  return someWords;
}


public List wordsWithoutList(String[] words, int len) {
  List someWords = new ArrayList<String>();
  
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() != len)
    {
      someWords.add(words[i]);
    }
  }
    
  return someWords;
}
  

public boolean hasOne(int n) {
  while (n > 0) {
    if (n % 10 == 1) {
      return true;
    }
    else {
      n /= 10;
    }
  }
   
  return false; 
}


public boolean dividesSelf(int n) {
  int copy = n;
  
  while (copy > 0)
  {
    int digit = copy % 10;
    
    if (digit == 0 || n % digit != 0) {
      return false;
    }
    
    copy /= 10;
  }
  
  return true;
}
  

public int[] copyEvens(int[] nums, int count) {
  int[] evens = new int[count];
  
  int i = 0;
  int j = 0;
  
  while (j < count)
  {
    if (nums[i] % 2 == 0)
    {
      evens[j] = nums[i];
      j++;
    }
    
    i++;
  }
  
  return evens;
}
  

// helper function for copyEndy
public boolean isEndy(int n)
{
  return (0 <= n && n <= 10) || (90 <= n && n <= 100);

}

public int[] copyEndy(int[] nums, int count) {

  int[] endyNums = new int[count];
  
  int i = 0;
  int j = 0;
  while (j < count)
  {
    if (isEndy(nums[i]))
    {
      endyNums[j] = nums[i];
      j++;
    }
    
    i++;
  }
  
  return endyNums;
}


public int matchUp(String[] a, String[] b) {
  int count = 0;
  
  for (int i = 0; i < a.length; i++) {
    boolean bothNonEmpty = a[i].length() > 0 && b[i].length() > 0;
  
    if (bothNonEmpty) {
      char c1 = a[i].charAt(0);
      char c2 = b[i].charAt(0);
      
      if (c1 == c2) {
        count++;
      }
    }
  }
  
  return count;
}
  

public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  
  for (int i=0; i<answers.length; i++) {
    if (answers[i].equals(key[i])) {
      score += 4;
    }
    else if (answers[i].equals("?")) {
      score += 0;
    }
    else {
      score -= 1;
    }
  }
    
  return score;
}
  

public String[] wordsWithout(String[] words, String target) {
  int resultLength = words.length;
  
  for (String w: words) {
    if (w.equals(target)) {
      resultLength--;
    }
  }
  
  String[] result = new String[resultLength];
  int i = 0;
  
  for (String w: words) {
    if (!w.equals(target)) {
      result[i] = w;
      i++;
    }
  }
  
  return result;
}
  

// helper function for scoresSpecial
public int largestSpecial(int[] nums) {
  int largest = 0;
  
  for (int n: nums) {
    if (n % 10 == 0) {
      largest = Math.max(largest, n);
    }
  }
  
  return largest;
}
  
public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a) + largestSpecial(b);
}
  

public int sumHeights(int[] heights, int start, int end) {
  int sum = 0;
  
  for (int i=start; i<end; i++) {
    int diff = heights[i] - heights[i+1];
    
    sum += Math.abs(diff);
  }
  
  return sum;
}
 

public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;
  
  for (int i=start; i<end; i++) {
    int diff = heights[i] - heights[i+1];
    
    if (diff < 0) {
      diff *= 2;
    }
    
    sum += Math.abs(diff);
  }
  
  return sum;
}
  

public int bigHeights(int[] heights, int start, int end) {
  int count = 0;
  
  for (int i = start; i < end; i++) {
    int diff = Math.abs(heights[i] - heights[i+1]);
    
    if (diff >= 5) {
      count++;
    }
  }
  
  return count;
}
  

public int userCompare(String aName, int aId, String bName, int bId) {
  int comp = 0;
  
  if (aName.equals(bName)) {
    comp = aId - bId;
  }
  else {
    comp = aName.compareTo(bName);
  }
    
  if (comp < 0) {
    comp = -1;
  }
  else if (comp > 0) {
    comp = 1;
  }
  
  return comp;
}
  

public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] result = new String[n];
  
  int aIndex = 0;
  int bIndex = 0;
  int rIndex = 0;
  
  while (rIndex < n) {
    String nextA = a[aIndex];
    String nextB = b[bIndex];
    
    int comp = nextA.compareTo(nextB);
    
    if (comp < 0) {
      result[rIndex] = nextA;
      aIndex++;
    }
    else if (comp > 0) {
      result[rIndex] = nextB;
      bIndex++;
    }
    else {
      result[rIndex] = nextB;
      aIndex++;
      bIndex++;
    }
    
    rIndex++;
  }
  
  return result;
}
  

public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int aIndex = 0;
  int bIndex = 0;
  
  while (aIndex < a.length && bIndex < b.length)  {
    while (aIndex < a.length - 1 && a[aIndex].equals(a[aIndex + 1])) {
      aIndex++;
    }
    
    while (bIndex < b.length - 1 && b[bIndex].equals(b[bIndex + 1])) {
      bIndex++;
    }
    
    int comp = a[aIndex].compareTo(b[bIndex]);
    
    if (comp < 0) {
      aIndex++;
    }
    else if (comp > 0) {
      bIndex++;
    }
    else {
      count++;
      aIndex++;
      bIndex++;
    }
  }
  
  return count;
}
  