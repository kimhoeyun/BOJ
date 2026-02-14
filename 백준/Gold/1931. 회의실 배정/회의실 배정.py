import sys
input = sys.stdin.readline

n = int(input())
schedule = [tuple(map(int, input().split())) for _ in range(n)]

schedule.sort(key=lambda x: (x[1], x[0]))

cnt = 0
last_end = 0

for s, e in schedule:
    if s >= last_end:
        cnt += 1
        last_end = e

print(cnt)