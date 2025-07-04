H, M = map(int, input().split())

if 45 <= M < 60 :
    print(H, M-45)
elif 0 <= M < 45 :
    if H == 0 :
        H = 24
    print(H - 1, M + 15)  