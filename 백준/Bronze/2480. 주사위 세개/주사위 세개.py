A, B, C = map(int, input().split())

if A == B == C :
    print(10000 + 1000 * A)
elif A != B and B != C and A != C:
    L = max(A, B, C)
    print(100 * L)
elif A == B or A == C :
    print(1000 + 100 * A)
else :
    print(1000 + 100 * B)