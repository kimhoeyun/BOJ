n = int(input())
san = list(map(int, input().split()))

temp = 0
cnt = 0
ans = 0
for i in san:
    if i > temp:
        temp = i
        cnt = 0
    else:
        cnt += 1
    ans = max(ans, cnt)
    
print(ans)