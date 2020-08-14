for _ in range(int(input())):
  n = int(input())
  c = 0
  while n > 0:
    n = int(n/2)
    c += 1
    
  print(c)