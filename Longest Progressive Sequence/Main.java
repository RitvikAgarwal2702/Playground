n = int(input())
A = list(map(int,input().split()))
A.append(-1)

i = 0
j = 1
mxlen = 1
mxi = i
mxj = j

while j < len(A):
  if A[j-1] <= A[j]:
    j += 1
  else:
    if j - i > mxlen:
      mxlen = j - i
      mxi = i
      mxj = j
    i = j
    j += 1

res = A[mxi:mxj]
for i in res:
  print(i,end = " ")
