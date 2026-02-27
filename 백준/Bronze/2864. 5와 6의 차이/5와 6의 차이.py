a,b= input().split()

table = str.maketrans('6','5')
a= a.translate(table)
b= b.translate(table)
print(int(a)+int(b),end=' ')

table = str.maketrans('5','6')
a= a.translate(table)
b= b.translate(table)
print(int(a)+int(b))