#Dado um número, diga se ele é positivo, negativo ou zero.
status = ""
numero = float(input("Informe um número para verificar se ele é negativo, positivo ou nulo: "))

if numero > 0:
    status = "positivo"
elif numero < 0:
    status = "negativo"
elif numero == 0:
    status = "nulo"
else:
    print("Valor inválido, informe outro valor")


print(f"O número {numero} é {status}")