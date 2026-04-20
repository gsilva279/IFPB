soma = 0
numero = int(input("Informe um número: "))

if numero == 0:
    print("ERRO: 0 é nulo!")
else:
    for i in range(1, numero):
        if numero % i == 0:
            soma += i
        
    if soma == numero:
        print(f"{numero} é um número perfeito")
    else:
        print(f"{numero} é imperfeito")
    