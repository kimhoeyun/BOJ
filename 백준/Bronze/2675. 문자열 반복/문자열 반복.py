a = int(input())
for _ in range(a):
    b, c = input().split()
    b = int(b)
    for ch in c:
        print(ch * b, end='')
    print()