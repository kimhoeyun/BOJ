import sys
input = lambda: sys.stdin.readline().rstrip()

N, M = map(int, input().split())

b = [0] * (N + 1)

for _ in range(M) :
    i, j, k = map(int, input().split())
    
    for x in range(i, j + 1) :
        b[x] = k

for y in range(1, N + 1) :
    print(b[y], end=" ")