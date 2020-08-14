from itertools import permutations 

value, compare =(input().split())

b = compare
a = ''.join(sorted(value))
value = int(value)
compare=int(compare)

if len(a)<len(b):
    print(-1)
else:    
    result = -1
    permList = permutations(a)
    for perm in list(permList):
        n = int(''.join(perm))
        if(n > compare):
            result = n
            break
    print(result)