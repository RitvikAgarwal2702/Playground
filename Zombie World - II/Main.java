B,N = map(int,input().split())
Z = list(map(int,input().split()))

Z.sort()

for i in range(N):
  B -= Z[i]%2 + Z[i]//2

    
if B>0:
  print("YES")
else:
  print("NO")
 