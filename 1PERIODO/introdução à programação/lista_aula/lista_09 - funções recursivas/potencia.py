def potencia(base:int, expoente:int) -> int:
    if expoente == 0:
        return 1
    else:
        return base * potencia(base, expoente - 1)

base = int(input("Base: "))
expoente = int(input("Expoente: "))
print(potencia(base, expoente))