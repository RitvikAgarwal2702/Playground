def toBase(n,b):
  store = []
  while n > 0:
    store.append(n % b)
    n = n // b
  res = 0
  for i in reversed(store):
    res = res*10 + i
  return res

def digitSum(n):
  return sum(int(i) for i in str(n))

def isNiven(n,b):
  numbase = toBase(n,b)
  digitsum = digitSum(numbase)
  return n%digitsum == 0

b, T = map(int,input().split())

count = 0
n = b
while 1:
  if isNiven(n,b):
    count += 1
  else:
    if count == T:
      break
    count = 0
  n += 1
print(toBase(n-T,b))