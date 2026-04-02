#Verificar se o número informado é primo
num = int(input("Informe um número para verificar sua primalidade: "))
resultado = 0

for i in range(1, (num +1)):
    resultado = num % i

    if resultado == 0:
        print("Não é primo")