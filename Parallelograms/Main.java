
def pairfound(angle,i,n):
    
    for j in range(i+1,n):
        if(angle[i]==angle[j]):
            return 1;
    return 0;
        
n=int(input());
count=0;
dub=[]
angle=[]
dub=input().split();
for i in range(0,n):
  ang=int(dub[i])
  if(ang>=-89 and ang<=90):
      angle.append(ang);
for i in range(0,n):
    if(pairfound(angle,i,n)==1):
        count+=1;
pllgm=(count-1)*count/2;
print(int(pllgm));