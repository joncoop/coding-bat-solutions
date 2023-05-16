def sleep_in(weekday, vacation):
  return not weekday or vacation


def monkey_trouble(a_smile, b_smile):
  return a_smile == b_smile


def sum_double(a, b):
  s = a + b
  
  if a == b:
    s *= 2
    
  return s


def diff21(n):
  d = abs(n - 21)
  
  if n > 21:
    d *= 2

  return d


def parrot_trouble(talking, hour):
  return talking and (hour < 7 or hour > 20)


def makes10(a, b):
  return a == 10 or b == 10 or a + b == 10


def near_hundred(n):
  diff100 = abs(n - 100)
  diff200 = abs(n - 200)
  
  return diff100 <= 10 or diff200 <= 10


def pos_neg(a, b, negative):
  
  if negative:
    return a < 0 and b < 0
  else:
    return a * b < 0


def not_string(str):
  
  if len(str) >= 3 and str[:3] == "not":
    return str
  else:
    return "not " + str


def missing_char(str, n):
  return str[:n] + str[n + 1:]


def front_back(str):
  if len(str) > 1:
    return str[-1] + str[1: -1] + str[0]
  else:
    return str


def front3(str):
  return 3 * str[:3]
