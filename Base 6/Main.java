n = int(input())
mseq = list(map(int,input().split()))

rseq = []

for num in mseq:
  temp = 0
  while num:
    temp += num%6
    num = num//6
  rseq.append(temp)
  
count = 0
for i in range(n):
  for j in range(i+1,n):
    if rseq[i] > rseq[j]:
      count += 1
      
print(count)