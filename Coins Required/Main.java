n = int(input())
five = int((n-4)/5)
n-= five*5
if n%2 == 0:
  one = 2
else:
  one = 1
two = (n-one)//2
total = one + two + five
print(total,five,two,one,end = " ")