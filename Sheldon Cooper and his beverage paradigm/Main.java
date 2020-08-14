def solve(n,A,X):
  A.sort()
  for i in range(n):
    j = i+1
    k = n-1
    while j < k:
      temp = A[i] + A[j] + A[k]
      if temp == X:
        return True
      elif temp < X:
        j += 1
      else:
        k -= 1
  return False
  
  
n = int(input())
A = []
for i in range(n):
  A.append(int(input()))
X = int(input())

if solve(n,A,X):
  print("TRUE")
else:
  print("FALSE")