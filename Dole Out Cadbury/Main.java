def func(a,b):
  count = 0
  while a and b:
    count += 1
    if a > b:
      a = a-b
    else:
      b = b-a
  return count
P = int(input())
Q = int(input())
R = int(input())
S = int(input())

total = 0

for i in range(P,Q+1):
  for j in range(R,S+1):
    total += func(i,j)
print(total)