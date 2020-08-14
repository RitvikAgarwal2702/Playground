for _ in range(int(input())):
  P = list(input())
  cnt = [0 for i in range(26)]
  S = input().strip()

  for ch in S:
    cnt[P.index(ch)] += 1

  T = ""  
  for i in range(26):
    if cnt[i] > 0:
      T += P[i]*cnt[i]
  print(T)