def count_evens(nums):
  return len([n for n in nums if n % 2 == 0])
  
  '''
  count = 0
  
  for n in nums:
    if n % 2 == 0:
      count += 1
      
  return count;
  '''


def big_diff(nums):
  return max(nums) - min(nums)
  
  '''
  small = nums[0]
  big = nums[0]
  
  for n in nums:
    if n < small:
      small = n
    elif n > big:
      big = n
      
  return big - small
  '''


def centered_average(nums):
  return (sum(nums) - max(nums) - min(nums)) / (len(nums) - 2)
  
  '''
  small = nums[0]
  big = nums[0]
  
  for n in nums:
    if n < small:
      small = n
    elif n > big:
      big = n
      
  return ( sum(nums) - big - small ) / (len(nums) - 2)
  '''


def sum13(nums):
  sum = 0
  i = 0
  
  while i < len(nums):
    if nums[i] != 13:
      sum += nums[i]
      i += 1
    else:
      i += 2
      
  return sum


def sum67(nums):
  total = 0
  count_it = True
  
  for n in nums:
    if n == 6:
      count_it = False
      
    if count_it:
      total += n
      
    if n == 7:
      count_it = True
      
  return total


def has22(nums):
  for i in range(len(nums) - 1):
    pair = nums[i: i + 2]
    
    if pair == [2, 2]:
      return True
      
  return False
