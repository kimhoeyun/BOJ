N = int(input())
arr = list(map(int, input().split()))
v = int(input())
sum = 0

for i in range(N) :
    if v == arr[i] :
        sum = sum + 1
    
print(sum)