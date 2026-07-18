#13.Calcule o fatorial de um número usando while.
fatorial = int(input("Informe um número para saber seu fatorial (n!): "))
cont = fatorial - 1 

while cont > 0:
        fatorial = fatorial * cont
        cont -= 1

print(f"O fatorial do número infromado é: {fatorial}")