import sys, heapq
input = sys.stdin.readline

n = int(input())
lst = [-int(input()) for _ in range(n)]
if n == 1:
  print(0)
  exit(0)
dasom = -lst[0]
lst2 = lst[1:]
heapq.heapify(lst2)
cnt = 0
while 1:
  pn = -heapq.heappop(lst2)
  if dasom > pn:
    break
  pn -= 1
  dasom += 1
  cnt += 1
  heapq.heappush(lst2, -pn)
print(cnt)