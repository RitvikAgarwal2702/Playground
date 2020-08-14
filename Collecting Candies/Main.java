emptybox = []
candybox = []
a = []
b = []
time = 0;
T=int(input())
N=int(input())
if( (T <= 10 and T >= 1) and (N <= 10000 and N >= 1)):
  b.append(list(map(int,input().split())))
  for i in range(0,N):
    a.append(b[0][i])
    i+=1;
  for i in range (0,N):
    candybox.append(a[i]);
    emptybox.append(0);
  emptybox.append(0);
  for i in range (1,N):
    candybox[i] = candybox[i-1] + candybox[i];
    emptybox[i-1] = candybox[i];
  for i in range (0,N):
    emptybox[i+1] = emptybox[i] + emptybox[i+1];
    time = emptybox[i+1];
  print(time)