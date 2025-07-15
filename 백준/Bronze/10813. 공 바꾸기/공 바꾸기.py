import sys
input = lambda: sys.stdin.readline().rstrip()

N, M = map(int, input().split())

b = [0] + [i for i in range(1, N + 1)]

for _ in range(M) :
    i, j = map(int, input().split())
    b[i], b[j] = b[j], b[i]
    
for x in range(1, N +1) :    
    print(b[x], end=" ")