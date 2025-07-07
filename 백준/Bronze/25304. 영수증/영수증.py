X = int(input())
N = int(input())
sum = 0

for _ in range(N) :
    P, C = map(int, input().split())
    
    sum += P * C
    
if sum == X :
    print("Yes")
else :
    print("No")