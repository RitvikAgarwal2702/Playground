for _ in range(int(input())):
  N = int(input())
  monkey = list(map(int,input().split()))
  alpha = [i for i in range(N)]
  a1 = [i for i in range(N)]
  count = 0
  while 1:
    count += 1
    a2 = [-1 for i in range(N)]
    for i in range(N):
      a2[monkey[i] - 1] = a1[i]
    if a2 == alpha:
      break
    a1 = a2
    
  print(count)
   
    