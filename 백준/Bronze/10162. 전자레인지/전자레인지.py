changes = [300, 60, 10]
T = int(input())
res = []

for i in changes :
    res.append(T // i)
    T = T % i
    
if(T != 0):
    print(-1)
else:
    print(*res)