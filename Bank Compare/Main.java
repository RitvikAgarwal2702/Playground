def calculateEMI(P,I,Y):
  emi = (P*I)/(1 - (1/((1+I)**(Y*12))))
  total = emi * (Y*12)
  return total

P = int(input())
T = int(input())

N1 = int(input())

BAI = 0
for i in range(N1):
  Y,I = map(float,input().split())
  BAI += calculateEMI(P,I,Y)

N2 = int(input())

BBI = 0
for i in range(N2):
  Y,I = map(float,input().split())
  BBI += calculateEMI(P,I,Y)
  
#print(BAI,BBI)
#print(TA,TB)
if BAI < BBI:
  print("Bank A")
else:
  print("Bank B")