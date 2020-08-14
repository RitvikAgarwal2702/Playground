N = int(input())
T = int(input())
racer = []
for _ in range(N):
  steps = list(map(int,input().split()))
  stepdis = steps[-1]
  steps = steps[:-1]
  for i in range(1,len(steps)):
    steps[i] += steps[i-1]
  for i in range(len(steps)):
    steps[i] *= stepdis
  #print(steps)
  racer.append(steps)

winner = [0 for i in range(N)]
for i in range(1,T,2):
  temp = []
  for j in range(N):
    temp.append(racer[j][i])
  mx = max(temp)
  for k in range(N):
    if temp[k] == mx:
      winner[k] += 1
#print(winner)
print(winner.index(max(winner)) + 1)
    