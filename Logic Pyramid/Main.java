n = int(input())
a = 3
b = 2
"""l = []
tot = n*(n+1)//2
for i in range(tot):
  l.append(a*b)
  a += 4
  b += 2
#print(l)
"""
c = 0
for i in range(1,n+1):
  print("     "*(n-i),end = "")
  for j in  range(i):
    temp = "00000" + str(a*b)
    temp = temp[-5:]
    a+=4
    b+=2
    print(temp,end = "     ")
  print()