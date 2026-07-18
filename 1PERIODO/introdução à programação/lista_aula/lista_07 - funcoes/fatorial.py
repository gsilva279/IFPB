def fatorial(n:int) -> int:
    if n ==0 or n== 1:
        return 1
    else:
        return n * fatorial(n -1)

numero = int(input("Número: "))
print(fatorial(numero))
