def first_last6(nums):
  first = nums[0]
  last = nums[-1]
  
  return first == 6 or last == 6


def same_first_last(nums):
  if len(nums) < 1:
    return False

  return nums[0] == nums[-1]


def make_pi():
  return [3, 1, 4]


def common_end(a, b):
  same_first = a[0] == b[0]
  same_last = a[-1] == b[-1]
  
  return same_first or same_last


def sum3(nums):
  return sum(nums)
  
  '''
  return nums[0] + nums[1] + nums[2]
  '''


def rotate_left3(nums):
  return nums[1:] + nums[0: 1]


def reverse3(nums):
  return nums[:: -1]


def max_end3(nums):
  big_end = max(nums[0], nums[-1])
  
  return [big_end] * len(nums)


def sum2(nums):
  return sum(nums[:2])


def middle_way(a, b):
  mid_a = a[1]
  mid_b = b[1]
  
  return [mid_a, mid_b]


def make_ends(nums):
  first = nums[0]
  last = nums[-1]
  
  return [first, last]


def has23(nums):
  has2 = 2 in nums
  has3 = 3 in nums
  
  return has2 or has3
