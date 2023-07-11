inp = 1634
num = inp
dup = inp
sum = 0
no_of_digits = 0

while dup > 0:
  dup = int(dup / 10)
  no_of_digits = no_of_digits + 1

while num > 0:
  part = num % 10
  print(part)
  val = (part**no_of_digits)
  sum = sum + val
  print('SUM = {} and VAL = {}\n'.format(sum,val))
  num = int(num / 10)

if sum == inp:
  print("Armstrong Number:",sum)
else:
  print("Not Armstrong Number:",sum)