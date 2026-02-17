T = int(input())
final = []

for i in range(T):
  result=[]
  C = int(input())
  quarter = (C//25)
  left_q = C%25
  result.append(int(quarter))
  
  dime = (left_q//10)
  left_d = left_q%10
  result.append(int(dime))
  
  nickel = (left_d//5)
  left_n = left_d%5
  result.append(int(nickel))
  
  penny =(left_n//1)
  left_p = left_n%1
  result.append(int(penny))
  
  final.append(result)

for i in final:
  print(*i)