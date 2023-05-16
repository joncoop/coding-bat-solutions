def hello_name(name):
  return "Hello " + name + "!"


def make_abba(a, b):
  return a + b + b + a


def make_tags(tag, word):
  begin = "<" + tag + ">"
  end = "</" + tag + ">"
  
  return begin + word + end


def make_out_word(out, word):
  return out[:2] + word + out[2:]


def extra_end(str):
  return 3 * str[-2:]


def first_two(str):
  return str[:2]


def first_half(str):
  mid = len(str) // 2
  
  return str[0: mid]


def without_end(str):
  return str[1: -1]


def combo_string(a, b):
  if len(a) > len(b):
    a, b = b, a
  
  return a + b + a


def non_start(a, b):
  return a[1:] + b[1:]


def left2(str):
  return str[2:] + str[:2]
