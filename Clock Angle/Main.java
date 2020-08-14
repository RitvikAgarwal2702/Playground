period = int(input())
longitude = float(input())

time_diff = (period*longitude*60)//360

hours = time_diff//60
minutes = time_diff%60
hours %= 12
minute_hand = minutes*6
hour_hand = hours*30 + (minutes/2)

ans = minute_hand - hour_hand

if ans < 0:
  ans = ans + 360
print("{:.2f}".format(ans))