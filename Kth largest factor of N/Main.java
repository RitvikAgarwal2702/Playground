N,K = map(int,input().split())

c = 0
for i in range(N,0,-1):
  if N%i == 0:
    c += 1
  if c == K:
    print(i)
    break
    
if c != K:
  print(1)