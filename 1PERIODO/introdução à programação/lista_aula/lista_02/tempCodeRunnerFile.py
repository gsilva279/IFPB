soma = 0
numero = int(input("Informe um número: "))

for i in range(1, numero):
    if numero % i == 0:
        soma += i
    
if soma == numero:
    print(f"{numero} é um núnmero perfeito")
else:
    print(f"{numero} é imperfeito")
    