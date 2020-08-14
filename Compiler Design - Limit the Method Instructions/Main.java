def checkProgram(str):
  c = 0
  s = []
  flag = True
  count = 0
  n = len(str)
  if(str[0] != '{' or str[1] == '{' or str[n-1] != '}'):
    flag = False
  else:
    for i in str:
      if i == '<':
        s.append(i)
        continue
      if i == '{':
        if s:
          s.append(i)
          continue
      if i == '(':
        if not s:
          s.append(i)
          continue
        else:
          flag = False
          break
      if s:
        if i == '}':
          if (s[-1] == '{'):
            s.pop()
            continue
          else:
            break
        if i == '>':
          count = count + 1
          if count > 1:
            flag = False
            break
          if s[-1] == '<':
            s.pop()
            continue
          else:
            break
        if i == ')':
          if s[-1] == '(':
            s.pop()
            continue
          else:
            break
        if i == 'P' and s[-1] == '(':
          c = c + 1
          continue


  if count == 0 or c > 100:
    flag = False
  if not s and flag:
    print("No Compilation Errors")
  else:
    print("Compilation Errors")

for _ in range(int(input())):
  str = input()
  checkProgram(str)