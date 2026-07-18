idade = int(input("Informe sua idade: "))

if idade < 0 or idade == 0:
    print("ERRO: não existe idade negativa ou nula!")
else:
    if idade <= 12:
        res = "criança"
    elif idade >= 60:
        res = "idoso"
    else:
        res = "adulto"

    print(f"Você é {res}")