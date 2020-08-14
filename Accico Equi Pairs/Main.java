N = int(input())
arr = list(map(int,input().split()))
"""
sumarr = [0] + [i for i in arr]
for i in range(1,N+1):
  sumarr[i] = sumarr[i] + sumarr[i-1]
print(sumarr)
""" 
def slice(a,b):
  return sum([arr[i] for i in range(a,b+1)])
flag = 0
a = 0
while a+2 < N:
  b = a+2
  while b < N:
    temp = slice(a+1,b-1)
    if slice(0,a-1) == temp and slice(b+1,N-1) == temp:
      flag = 1
      break
    b += 1
  if flag:
    break
  a = a+1
if flag:
  print("Indices which form equi pair {%d,%d}"%(a,b))
  print("Slices are {%d,%d},{%d,%d},{%d,%d}"%(0,a-1,a+1,b-1,b+1,N-1))
else:
  print("Array does not contain any equi pair")


