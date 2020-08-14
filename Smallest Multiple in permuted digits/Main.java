from itertools import permutations
S,k = map(int,input().split())
S = list(str(S))
S.sort()
perm = list(permutations(S))
ans = -1
for i in perm:
  num = int("".join(i))
  if num%k == 0:
    ans = num
    break
print(ans)