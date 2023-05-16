# I had some fun trying to one-liner some these.
# The commented out code is generally the sensible solution.

def make_bricks(small, big, goal):
  '''
  can_get_there = small + 5 * big >= goal
  can_be_exact = small >= goal % 5
  
  return can_get_there and can_be_exact
  '''
  
  return small + 5 * big >= goal and goal % 5 <= small


def lone_sum(a, b, c):
  '''
  sum = 0
  
  if a != b and a != c:
    sum += a
  if b != c and b != a:
    sum += b
  if c != b and c != a:
    sum += c
    
  return sum
  '''

  return sum([n for n in [a, b, c] if [a, b, c].count(n) == 1])


def lucky_sum(a, b, c):
  '''
  sum = 0
  
  if c != 13 and b != 13 and a != 13:
    sum += c
  if b != 13 and a!= 13:
    sum += b
  if a != 13:
    sum += a
    
  return sum
  '''
  
  '''
  nums = [a, b, c]
  thirteen = nums.index(13) if 13 in nums else len(nums)
  return sum(nums[:thirteen])
  '''
  
  return sum([a, b, c][:[a, b, c].index(13) if 13 in [a, b, c] else len([a, b, c])])


'''
def fix_teen(n):
  if 13 <= n <= 14 or 17 <= n <= 19:
    return 0
    
  return n

def no_teen_sum(a, b, c):
  return fix_teen(a) + fix_teen(b) + fix_teen(c)
'''

def no_teen_sum(a, b, c):
  return sum([n if n not in (13, 14, 17, 18, 19) else 0 for n in (a, b, c)])


'''
def round_10(num):
  # Python has a built-in round function, but I think that violates the 'spirit of the problem'
  return (num + 5) // 10 * 10

def round_sum(a, b, c):
  return round_10(a) + round_10(b) + round_10(c)
'''

def round_sum(a, b, c):
  return sum([(n + 5) // 10 * 10 for n in (a, b, c)])


def close_far(a, b, c):
  '''
  ab_close = abs(a - b) <= 1
  ac_close = abs(a - c) <= 1
  bc_close = abs(b - c) <= 1
  
  return ab_close + ac_close + bc_close == 1
  '''

  return (abs(a - b) <= 1) + (abs(a - c) <= 1) + (abs(b - c) <= 1) == 1


def make_chocolate(small, big, goal):
  '''
  if 5 * big + small < goal or small < goal % 5:
    return -1
  
  if 5 * big > goal:
    return goal % 5
  
  return goal - big * 5
  '''
  
  # The above solution is fine, but let's code golf this thing.
  
  '''
  if big * 5 + small < goal or small < goal % 5:
    return -1
  
  amounts = [goal % 5, goal - big * 5]
  loc = big * 5 < goal
  return amounts[loc]
  '''
 
  ''' 
  amounts = [goal % 5, goal - big * 5, -1]
  loc = max(big * 5 < goal, 2 * (big * 5 + small < goal or small < goal % 5))
  return amounts[loc]
  '''
  
  return [goal % 5, goal - big * 5, -1][max(big * 5 < goal, 2 * (big * 5 + small < goal or small < goal % 5))]
