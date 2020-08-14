S,R = map(int,input().split())
sample = list(map(int,input().split()))
Range = []
for i in range(R):
  Range.append(list(map(int,input().split())))
count = [0 for i in range(R)]  
for s in sample:
  for i in range(len(Range)):
    if s >= Range[i][0] and s<= Range[i][1]:
      count[i] += 1
      
for i in count:
  print(i,end = " ")
  