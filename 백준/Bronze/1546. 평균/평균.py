import sys
input = lambda: sys.stdin.readline().rstrip()

n = int(input())
num = list(map(int, input().split()))
average = []

for i in range(n):
    m = max(num)
    average.append((num[i] / m) * 100) 
    
total = sum(average)

print(total / n)