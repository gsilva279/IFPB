#Verificar se o número informado é primo
num = int(input("Informe um número para verificar sua primalidade: "))
resultado = True

for i in range(2, num):
    if num % i == 0:
        resultado = False
        break

if resultado:
    print("É primo")
else:
    print("Não é primo")