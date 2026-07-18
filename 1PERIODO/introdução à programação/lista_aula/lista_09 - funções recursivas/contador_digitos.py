def conta_digitos(n:int) -> int:
    if n//10 == 0:
        return 1
    else:
        return 1 + conta_digitos(n // 10 )

n = int(input("Número: "))
print(conta_digitos(n))