import sys
input = lambda: sys.stdin.readline().rstrip()

num = list()

for i in range(10) :
    a = int(input())
    num.append(a)

num2 = set()

for i in range(10) :
    num2.add(num[i] % 42)

print(len(num2))