#9.Leia a idade de uma pessoa e classifique: criança, adolescente, adulto ou idoso.

idade = int(input("Informe sua idade: "))
status = ""

if idade > 0 and idade < 16:
    status = "criança"
elif idade > 15 and idade <= 17:
    status = "adolescente"
elif idade > 17 and idade <= 59:
    status = "adulto"
elif idade >= 60:
    status = "idoso"
else:
     print("Valor inválido, informe outro valor")


print(f"Você tem {idade} anos, você é {status}")