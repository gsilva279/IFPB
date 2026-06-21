# Exercício: Escreva uma função que retorne o maior de dois números.
def maximo(num1, num2):
    if num1 > num2:
        return num1
    elif num2 > num1:
        return num2
    elif num1 == num2:
        return "São iguais"
    else:
        return "ERRO, valor inválido"

num1 = int(input("Informe um número: "))
num2 = int(input("Informe  outro número: "))
print(f"O maior entre os números é: {maximo(num1, num2)}")