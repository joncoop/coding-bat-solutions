def cigar_party(cigars, is_weekend):
  if is_weekend:
    return cigars >= 40
  else:
    return 40 <= cigars <= 60


def date_fashion(you, date):
  if you <= 2 or date <= 2:
    return 0
  elif you >= 8 or date >= 8:
    return 2
  else:
    return 1


def squirrel_play(temp, is_summer):
  low = 60
  high = 90
  
  if is_summer:
    high = 100
  
  return low <= temp <= high


# dumb one-liner
def squirrel_play(temp, is_summer):
  return 60 <= temp <= 90 + 10 * is_summer


def caught_speeding(speed, is_birthday):
  if is_birthday:
    speed -= 5
    
  if speed <= 60:
    return 0
  elif speed <= 80:
    return 1
  else:
    return 2


def sorta_sum(a, b):
  sum = a + b
  
  if 10 <= sum <= 19:
    sum = 20
  
  return sum


def alarm_clock(day, vacation):
  early = "7:00"
  late = "10:00"

  if vacation:
    early = "10:00"
    late = "off"
    
  if 1 <= day <= 5:
    return early
  else:
    return late


def love6(a, b):
  s = a + b
  d = abs(a - b)
  
  return 6 in [a, b, s, d]


def in1to10(n, outside_mode):
  if outside_mode:
    return n <= 1 or n >= 10
  else:
    return 1 <= n <= 10


def near_ten(num):
  ones_digit = num % 10
  
  return ones_digit <= 2 or ones_digit >= 8
