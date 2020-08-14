f = [1 for i in range(100005)]
for i in range(1, 100005):
    f[i] = (f[i-1]*i)%1000000007
n = int(input())
a = list(map(int,input().split()))
for _ in range(int(input())):
    l, r = map(int, input().split())
    if l == r:
    	print(1)
    else:
        mul = 1
        for i in range(l, r+1):
            mul = (mul * f[a[i-1]]) % 1000000007;
        ans = 1;
        for i in range(0,r-l):
            ans = (ans * mul) % 1000000007;
        print(ans%1000000007)