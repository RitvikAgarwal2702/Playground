S = input()
pos = 0
T = ""
for _ in range(int(input())):
  direction,k = input().split()
  k = int(k)
  
  if direction == "L":
    pos += k
  else:
    pos -= k
  T += S[pos]

flag = 0
l = len(T)
T = sorted(T)
for i in range(len(S) - l + 1):
  if sorted(S[i:i+l]) == T:
    flag = 1
    break
if flag:
  print("YES")
else:
  print("NO")