'''
CodingBat: Python

Just seeing how many I could solve with lambda functions.
'''

# Warmup-1

sleep_in = lambda weekday, vacation : not weekday or vacation
monkey_trouble = lambda a_smile, b_smile : a_smile == b_smile
sum_double = lambda a, b : 2 * (a + b) if a == b else a + b
diff21 = lambda n : abs(n - 21) if n <= 21 else 2 * abs(n - 21)
parrot_trouble = lambda talking, hour : (hour < 7 or hour > 20) and talking
makes10 = lambda a, b : 10 in [a, b, a + b]
near_hundred = lambda n : abs(n - 100) <= 10 or abs(n - 200) <= 10
pos_neg = lambda a, b, negative : a < 0 and b < 0 if negative else a * b < 0
not_string = lambda str : str if str[:3] == 'not' else 'not ' + str
missing_char = lambda str, n : str[:n] + str[n + 1:]
front_back = lambda str : str[-1] + str[1: -1] + str[0] if len(str) > 1 else str
front3 = lambda str : 3 * str[:3] if len(str) >= 3 else 3 * str


# Warmup-2

string_times = lambda str, n: n * str
front_times = lambda str, n: n * str[:3]
string_bits = lambda str: str[0::2]
array_count9 = lambda nums: nums.count(9)
array_front9 = lambda nums: 9 in nums[:4]


# String-1

hello_name = lambda name: 'Hello ' + name + '!'
make_abba = lambda a, b: a + b + b + a
make_tags = lambda tag, word: '<' + tag + '>' + word + '</' + tag + '>'
make_out_word = lambda out, word : out[:2] + word + out[2:]
extra_end = lambda str: 3 * str[-2:]
first_two = lambda str: str[:2]
first_half = lambda str: str[: len(str) // 2]
without_end = lambda str: str[1: -1]
combo_string = lambda a, b: a + b + a if len(a) < len(b) else b + a + b
non_start = lambda a, b: a[1:] + b[1:]
left2 = lambda str: str[2: ] + str[: 2]


# String-2

double_char = lambda str: ''.join([2 * c for c in str])
count_hi = lambda str: str.count('hi')
cat_dog = lambda str: str.count('cat') == str.count('dog')


# List-1

first_last6 = lambda nums: nums[0] == 6 or nums[-1] == 6
same_first_last = lambda nums: len(nums) > 0 and nums[0] == nums[-1]
make_pi = lambda :[3, 1, 4]
common_end = lambda a, b: a[0] == b[0] or a[-1] == b[-1]
sum3 = lambda nums: sum(nums)  
rotate_left3 = lambda nums: [nums[1], nums[2], nums[0]]
reverse3 = lambda nums: [nums[2], nums[1], nums[0]]
max_end3 = lambda nums: 3 * [nums[0]] if nums[0] > nums[-1] else 3 * [nums[-1]]
sum2 = lambda nums: sum(nums[:2])
middle_way = lambda a, b: [a[1], b[1]]
make_ends = lambda nums: [nums[0], nums[-1]]
has23 = lambda nums: 2 in nums or 3 in nums


# List-2

count_evens = lambda nums: [n % 2 for n in nums].count(0)
big_diff = lambda nums: max(nums) - min(nums)
centered_average = lambda nums: (sum(nums) - max(nums) - min(nums)) / (len(nums) - 2)


# Logic-1

cigar_party = lambda cigars, is_weekend: cigars >= 40 if is_weekend else 40 <= cigars <= 60
date_fashion = lambda you, date: 0 if you <= 2 or date <= 2 else 2 if you >= 8 or date >= 8 else 1
squirrel_play = lambda temp, is_summer: 60 <= temp <= 100 if is_summer else 60 <= temp <= 90
caught_speeding = lambda speed, is_birthday: (speed - 5 * is_birthday) // 61 + (speed - 5 * is_birthday) // 81
sorta_sum = lambda a, b: 20 if 10 <= a + b <= 19 else a + b
alarm_clock = lambda day, vacation: 'off' if vacation and day in [0, 6] else '10:00' if vacation or day in [0, 6] else '7:00'
love6 = lambda a, b: a == 6 or b == 6 or a + b == 6 or abs(a - b) == 6
in1to10 = lambda n, outside_mode: n <= 1 or n >= 10 if outside_mode else 1 <= n <= 10
near_ten = lambda num: num % 10 in [8, 9, 0, 1, 2]


# Logic-2

make_bricks = lambda small, big, goal: small + 5 * big >= goal and small >= goal % 5
lone_sum = lambda a, b, c: sum([n for n in [a, b, c] if [a, b, c].count(n) == 1])
lucky_sum = lambda a, b, c: 0 if a == 13 else a if b == 13 else a + b if c == 13 else a + b + c
no_teen_sum = lambda a, b, c: sum([n if n not in (13, 14, 17, 18, 19) else 0 for n in (a, b, c)])
round_sum = lambda a, b, c: sum([(n + 5) // 10 * 10 for n in (a, b, c)])
close_far = lambda a, b, c: (abs(a - b) <= 1) + (abs(a - c) <= 1) + (abs(b - c) <= 1) == 1
make_chocolate = lambda small, big, goal: [goal % 5, goal - big * 5, -1][max(big * 5 < goal, 2 * (big * 5 + small < goal or small < goal % 5))]

