#6. Verifique se um número digitado é par ou ímpar.
print("###### Par ou ímpar ##################")

numero = int(input("Informe um número para verificar se é par ou ímpar: "))

if numero % 2 == 0:
    resultado = "é par!"
else:
    resultado = "é ímpar!"


print(f"O número {numero} {resultado}")