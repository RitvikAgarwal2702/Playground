N = int(input())
fibo = [0 for i in range(N+1)]

fibo[0],fibo[1] = 1,1

for i in range(2,N+1):
  fibo[i] = fibo[i-1] + fibo[i-2]
  
print(fibo[N])