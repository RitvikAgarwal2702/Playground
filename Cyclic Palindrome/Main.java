def number_of_shift(s):
    if s == s[::-1]:
        return "0"
    seen1, seen2 = set(), set()
    number_of_shifts1, number_of_shifts2 = 0, 0
    s1 = s2 = s
    while True:

        first_ele, last_ele = s2[0], s1[-1]
        new_str1 = last_ele + s1[0:-1]
        new_str2 = s2[1:] + first_ele
        number_of_shifts1 += 1
        number_of_shifts2 += 1
        if new_str1 == new_str1[::-1]:
          	return number_of_shifts1
        if new_str2 == new_str2[::-1]: 
          	return number_of_shifts2
        
        if new_str1 in seen1 or new_str2 in seen2:
        	return "-1"
        else:
            seen1.add(new_str1)
            seen2.add(new_str2)
            # print(seen)
        s1 = new_str1
        s2 = new_str2
t = int(input())
for _ in range(t):
    s = input()
    res = number_of_shift(s)
    print(res)
