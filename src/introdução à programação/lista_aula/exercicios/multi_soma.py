#Realizar a multiplicação de dois números informados pelo usuário através de somas sucessivas
num1 = int(input("Informe um número: "))
num2 = int(input("Informe outro número: "))
resultado = 0
c = num1

for i in range(num2 - 1):
    resultado = num1 + c
    num1 = resultado

print(resultado)