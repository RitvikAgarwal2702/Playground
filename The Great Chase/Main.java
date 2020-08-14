for _ in range(int(input())):
  I,D,Z = map(int,input().split())
  c = 0
  while 1:
    I = I+D
    for k in range(2,Z+1):
      if Z%k == 0 and I%k == 0:
        c += 1
    if c == 0:
      print(-1)
      break
    s = I%Z
    if s == 0:
      ans = I/Z
      print(int(ans))
      break