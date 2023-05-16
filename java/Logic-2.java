public boolean makeBricks(int small, int big, int goal) {
  boolean canReachGoal = 5 * big + small >= goal;
  boolean canMakeExact = small >= goal % 5;
  
  return canReachGoal && canMakeExact;
}


public int loneSum(int a, int b, int c) {
  int sum = a + b + c;
  
  if (a == b || a == c) { sum -= a; }
  if (b == a || b == c) { sum -= b; }
  if (c == a || c == b) { sum -= c; }
  
  return sum;
}


public int luckySum(int a, int b, int c) {
  int sum;
  
  if (a == 13) {
    sum = 0;
  }
  else if (b == 13) {
    sum = a;
  }
  else if (c == 13) {
    sum = a + b;
  }
  else {
    sum = a + b + c;
  }
  
  return sum;
}
  

// helper function for noTeenSum
public int fixTeen(int n) {
  if (n > 12 && n < 15 || n > 16 && n < 20) {
    n = 0;
  }
  
  return n;
}
  
public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b)+ fixTeen(c);
}
  

// helper function for roundSum
public int round10(int num) {
  return (num + 5) / 10 * 10;
}
  
public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}


// helper function for closeFar
public boolean isClose(int x, int y) {
  return Math.abs(x - y) < 2;
}
  
public boolean closeFar(int a, int b, int c) {
  boolean bClose = isClose(b, a) || isClose(b, c);
  boolean cClose = isClose(c, a) || isClose(c, b);
  
  return bClose != cClose;
}
  

public int blackjack(int a, int b) {
  if (a > 21) {
    a = 0;
  }

  if (b > 21) {
    b = 0;
  }
  
  return Math.max(a, b);
}

  
public boolean evenlySpaced(int a, int b, int c) {
  int d1 = Math.abs(a - b);
  int d2 = Math.abs(b - c);
  int d3 = Math.abs(a - c);
  
  int gap = Math.min(d1, Math.min(d2, d3));
  int spread = Math.max(d1, Math.max(d2, d3));
  
  return 2 * gap == spread;
}


public int makeChocolate(int small, int big, int goal) {
  if (5 * big + small < goal || small < goal % 5) {
    return -1;
  }
  
  if (5 * big < goal) {
    return goal - big * 5;
  }
  else {
    return goal % 5;
  }
}
  