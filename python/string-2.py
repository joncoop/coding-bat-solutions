def double_char(str):
  '''
  result = ""
  
  for letter in str:
    result += 2 * letter
    
  return result
  '''
  
  return ''.join([2 * letter for letter in str])


def count_hi(str):
  return str.count('hi')
  
  '''
  count = 0
  
  for i in range(len(str) - 1):
    if str[i: i + 2] == "hi":
      count += 1
      
  return count
  '''


def cat_dog(str):
  return str.count('cat') == str.count('dog')
  
  '''
  cats = 0
  dogs = 0
  
  for i in range(len(str) - 2):
    if str[i: i + 3] == "cat":
      cats += 1
    elif str[i: i + 3] == "dog":
      dogs += 1
      
  return cats == dogs
  '''


def count_code(str):
  count = 0
  
  for i in range(len(str) - 3):
    one_two = str[i: i + 2]
    four = str[i + 3]
    
    if one_two == "co" and four == "e":
      count += 1
      
  return count


def end_other(a, b):
  a = a.lower()
  b = b.lower()
  
  return a.endswith(b) or b.endswith(a)


def xyz_there(str):
  return str.count('.xyz') < str.count('xyz')
  
  '''
  str = " " + str
  
  for i in range(1, len(str) - 2):
    before = str[i - 1]
    part = str[i: i + 3]
    
    if part == "xyz" and before != ".":
        return True
      
  return False
  '''
  
  # Note: The second solution is probably more efficient, especially for long strings
  #       as it will return True immediatly when a valid xyz is found. The shorter
  #       implementation necessarily searches the entire string for xyx and .xyz even
  #       after it could be determined that True should be returned.
