from collections import Counter
N = int(input())

l = list(map(int,input().split()))

C = Counter(l)
print(max(C.values()))