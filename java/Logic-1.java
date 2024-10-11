public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend) {
    return cigars >= 40;
  }
  else {
    return cigars >= 40 && cigars <= 60;
  }
}
  

public int dateFashion(int you, int date) {
  if (you <= 2 || date <= 2) {
    return 0;
  }
  else if (you >= 8 || date >= 8) {
    return 2;
  }
  else {
    return 1;
  }
}
  

public boolean squirrelPlay(int temp, boolean isSummer) {
  int lower = 60;
  int upper = 90;
  
  if (isSummer) {
    upper = 100;
  }
  
  return lower <= temp && temp <= upper;
}


public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday) {
    speed -= 5;
  }
  
  if (speed <= 60) {
    return 0;
  }
  else if (speed > 60 && speed <= 80) {
    return 1;
  }
  else {
    return 2;
  }
}
  

public int sortaSum(int a, int b) {
  int sum = a + b;
  
  if (10 <= sum && sum <= 20) {
    sum = 20;
  }
  
  return sum;
}
  
  
public String alarmClock(int day, boolean vacation) {
  String early = "7:00";
  String late = "10:00";
  
  if (vacation) {
    early = "10:00";
    late = "off";
  }
  
  if (day >= 1 && day <= 5) {
    return early;
  }
  else {
    return late;
  }
}
  

public boolean love6(int a, int b) {
  int sum = a + b;
  int diff = Math.abs(a - b);
  
  return a == 6 || b == 6 || sum == 6 || diff == 6;
}
  

public boolean in1To10(int n, boolean outsideMode) {
  
  if (outsideMode) {
    return n <= 1 || n >= 10;
  }
  else {
    return n >= 1 && n <= 10;
  }
}
  

public boolean specialEleven(int n) {
  return n % 11 <= 1;
}
  

public boolean more20(int n) {
  int diff = n % 20;
  
  return diff == 1 || diff == 2;
}
  

public boolean old35(int n) {
  boolean mult3 = n % 3 == 0;
  boolean mult5 = n % 5 == 0;

  return mult3 != mult5;
}


public boolean less20(int n) {
  int remainder = n % 20;
  
  return remainder == 18 || remainder == 19;
}
  

public boolean nearTen(int num) {
  int ones = num % 10;
  
  return ones <= 2 || ones >= 8;
}
  

public int teenSum(int a, int b) {
  boolean aTeen = a >= 13 && a <= 19;
  boolean bTeen = b >= 13 && b <= 19;
  
  if (aTeen || bTeen) {
    return 19;
  }
  else {
    return a + b;
  }
}


public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep) {
    return false;
  }
  
  return isMom || !isMorning;
}


public int teaParty(int tea, int candy) {
  boolean notEnoughOfSomething = tea < 5 || candy < 5;
  boolean twiceAsMuchTea = tea >= 2 * candy;
  boolean twiceAsMuchCandy = candy >= 2 * tea;
  
  if (notEnoughOfSomething) {
    return 0;
  }
  else if (twiceAsMuchTea || twiceAsMuchCandy) {
    return 2;
  }
  else {
    return 1;
  }
}


public String fizzString(String str) {
  boolean startsWithF = str.charAt(0) == 'f';
  boolean endsWithB = str.charAt(str.length() - 1) == 'b';
  
  if (startsWithF && endsWithB) {
    return "FizzBuzz";
  }
  else if (startsWithF) {
    return "Fizz";
  }
  else if (endsWithB) {
    return "Buzz";
  }
  else {
    return str;
  }
}


public String fizzString2(int n) {
  String result = "";
  
  if (n % 3 == 0) {
    result += "Fizz";
  }
  
  if (n % 5 == 0) {
    result += "Buzz";
  }
  
  if (result.length() == 0) {
    result = Integer.toString(n);
  }
  
  return result + "!";
}


public boolean twoAsOne(int a, int b, int c) {

  boolean abIsC = a + b == c;
  boolean acIsB = a + c == b;
  boolean bcIsA = b + c == a;
  
  return abIsC || acIsB || bcIsA;
}
  
  
public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (bOk) {
    return b < c;
  }

  return a < b && b < c;
}
  

public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  /*
  // a clear solution
  if (equalOk) {
    return a <= b && b <= c;
  }

  return a < b && b < c;
  */
  
  // a slightly too 'clever' solution
  if (equalOk) {
    b += 1; c += 2;
  }
  
  return a < b && b < c;
}
  

public boolean lastDigit(int a, int b, int c) {
  int aLast = a % 10;
  int bLast = b % 10;
  int cLast = c % 10;
  
  return aLast == bLast || bLast == cLast || aLast == cLast;
}
  

public boolean lessBy10(int a, int b, int c) {
  int abDiff = Math.abs(a - b);
  int acDiff = Math.abs(a - c);
  int bcDiff = Math.abs(b - c);
  
  return abDiff >= 10 || acDiff >= 10 || bcDiff >= 10;
}


public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if (noDoubles && die1 == die2) {
    die1 += 1;
    
    if (die1 > 6) {
      die1 = 1;
    }
  }
  
  return die1 + die2;
}
  
  
public int maxMod5(int a, int b) {
  if (a == b) {
    return 0;
  }
  
  int aRem = a % 5;
  int bRem = b % 5;
  
  if (aRem == bRem) {
    return Math.min(a, b);
  }
  else {
    return Math.max(a, b);
  }
}


public int redTicket(int a, int b, int c) {
  if (a == 2 && b == 2 && c == 2) {
    return 10;
  }
  else if (a == b && b == c) {
    return 5;
  }
  else if (a != b && a != c) {
    return 1;
  }
  else {
    return 0;
  }
}
  

public int greenTicket(int a, int b, int c) {
  if (a == b && b == c) {
    return 20;
  }
  else if (a == b || b == c || a == c) {
    return 10;
  }
  else {
    return 0;
  }
}
  

public int blueTicket(int a, int b, int c) {
  int ab = a + b;
  int bc = b + c;
  int ac = a + c;
  
  if (ab == 10 || bc == 10 || ac == 10) {
    return 10;
  }
  else if (ab == bc + 10 || ab == ac + 10) {
    return 5;
  }
  else {
    return 0;
  }
}


public boolean shareDigit(int a, int b) {
  int aOnes = a % 10;
  int aTens = a / 10;
  int bOnes = b % 10;
  int bTens = b / 10;
  
  return aOnes == bOnes || aOnes == bTens || 
         aTens == bOnes || aTens == bTens;
}
  
  
public int sumLimit(int a, int b) {
  int sum = a + b;
  
  int aDigits = (String.valueOf(a)).length();
  int sumDigits = String.valueOf(sum).length();
  
  if (sumDigits > aDigits) {
    return a;
  }
  else {
    return sum;
  }
}
  
