n = int(input())
if n <= 500 and n > 0:
  nums = list(map(int,input().split()))
  flag = 0
  for i in nums:
    if i//100 == 0 or i//1000 > 0:
      flag = 1
      break
  if flag == 0:

    bitlist = []

    for num in nums:
      temp = [int(i) for i in str(num)]
      mx = max(temp)
      mn = min(temp)
      temp2 = (mx*11 + mn*7)%100
      bitlist.append(temp2)

    #print(bitlist)

    bitlistodd = [bitlist[i] for i in range(0,n,2)]
    bitlisteven = [bitlist[i] for i in range(1,n,2)]

    #print(bitlistodd)
    #print(bitlisteven)

    hashodd = {}
    hasheven = {}

    for i in bitlistodd:
      if i//10 not in hashodd:
        hashodd[i//10] = 0
      hashodd[i//10] += 1

    for i in bitlisteven:
      if i//10 not in hasheven:
        hasheven[i//10] = 0
      hasheven[i//10] += 1

    count = 0

    for i in hashodd.values():
      if i == 2:
        count += 1
      elif i > 2:
        count += 2
    #print(hashodd)
    #print(hasheven)
    #print(count)
    for i in hasheven.values():
      if i == 2:
        count += 1
      elif i > 2:
        count += 2

    print(count)
  else:
    print("Invalid Input")
else:
  print("Invalid Input")