import sys
input = lambda: sys.stdin.readline().rstrip()

arr = []

for _ in range(9) :
    m = int(input())
    arr.append(m)


for i in range(9) :
    if arr[i] == max(arr) :
        print(max(arr))
        print(i + 1)