def string_times(string, n):
  return string * n


def front_times(string, n):
  front = string[:3]
  
  return front * n


def string_bits(string):
  
  return string[::2]


def string_splosion(string):
  result = ''
  
  for i in range(len(string)):
    result += str[0: i + 1]
    
  return result


def last2(str):
  count = 0
  end = str[-2:]
  
  for i in range(len(str) - 2):
    chunk = str[i: i + 2]
    
    if chunk == end:
      count += 1
  
  return count


def array_count9(nums):
  count = 0
  
  for n in nums:
    if n == 9:
      count += 1
  
  return count


def array_front9(nums):
  return 9 in nums[:4]
  
  '''
  end = min(len(nums), 4)
  
  for i in range(end):
    if nums[i] == 9:
      return True
      
  return False
  '''


def array123(nums):
  if len(nums) < 3:
    return False
    
  for i in range(len(nums) - 2):
    slice = nums[i: i + 3]
   
    if slice == [1, 2, 3]:
      return True
  
  return False


def string_match(a, b):
  count = 0
  
  end = min(len(a), len(b))
  
  for i in range(end - 1):
    a_slice = a[i: i + 2]
    b_slice = b[i: i + 2]
    
    if a_slice == b_slice:
      count += 1
    
  return count
