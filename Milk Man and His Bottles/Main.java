import sys
def min_bottles(bottles,V):
  dp = [sys.maxsize]*(V+1)
  dp[0] = 0

  for i in range(1,V+1):
      for c in bottles:
          if c <= i:
              sub = dp[i-c]
              if sub != sys.maxsize and sub + 1 < dp[i]:
                  dp[i] = sub + 1
  return dp[V]
for _ in range(int(input())):
  N = int(input())
  print(min_bottles([1,5,7,10],N))