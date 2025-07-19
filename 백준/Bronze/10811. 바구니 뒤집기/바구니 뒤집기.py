import sys
input = lambda: sys.stdin.readline().rstrip()

N, M = map(int, input().split())

basket = list()

for i in range(1, N + 1) :
    basket.append(i)

for i in range(M) :
    i, j = map(int, input().split())

    basket[i-1:j] = basket[i-1:j][::-1]

print(*basket)