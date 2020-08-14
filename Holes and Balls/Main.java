N = int(input())
Diam = list(map(int,input().split()))
Hieght = [i+1 for i in range(N)]
b = int(input())
Balls = list(map(int,input().split()))
out = [0 for i in range(b)]

for i in range(b):
  B = Balls[i]
  for j in range(N-1,-1,-1):
    if Hieght[j] == 0:
      continue
    if B <= Diam[j]:
      Hieght[j] -= 1
      out[i] = j+1
      break
print(" ".join([str(i) for i in out]))
