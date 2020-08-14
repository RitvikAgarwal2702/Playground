def generateMatrix(n):
        a = [[0 for i in range(n)] for i in range(n)]
        m = len(a)
        n = len(a[0])
        l = 0
        k = 0
        c = 1
        pp = 1
        pointlist = [(0,0)]
        while k < m and l < n:
            for i in range(k,n):
                a[k][i] = c
                if c % 11 == 0:
                  pp += 1
                  pointlist.append((k,i))
                c += 1
            k += 1
            
            for i in range(k,m):
                a[i][n-1] = c
                if c % 11 == 0:
                  pp += 1
                  pointlist.append((i,n-1))
                c += 1
            n -= 1
            
            for i in range(n-1,l-1,-1):
                a[m-1][i] = c
                if c % 11 == 0:
                  pp += 1
                  pointlist.append((m-1,i))
                c += 1
            m -= 1
            
            for i in range(m-1,k-1,-1):
                a[i][l] = c
                if c % 11 == 0:
                  pp += 1
                  pointlist.append((i,l))
                c += 1
            l += 1
        return a,pp,pointlist
N = int(input())
matrix,point,pointlist = generateMatrix(N)

for i in range(N):
  for j in range(N):
    print(matrix[i][j],end = "\t")
  print("")

print("Total Power points :",point)

for i in pointlist:
  print(i)