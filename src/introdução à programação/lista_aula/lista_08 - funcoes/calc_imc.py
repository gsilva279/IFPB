def calc_imc(peso, altura):
    imc = peso / altura ** 2

    if imc < 18.5:
        return f" IMC:{imc:.2f} -> Abaixo do peso"
    elif imc <= 24.9:
        return f" IMC:{imc:.2f} -> Peso normal"
    elif imc <= 29.9:
        return f" IMC:{imc:.2f} -> Sobre peso"
    elif imc <= 34.9:
        return f" IMC:{imc:.2f} -> Obesidade grau I"
    elif imc <= 39.9:
        return f" IMC:{imc:.2f} -> Obesidade grau II"
    else:
        return f" IMC:{imc:.2f} -> Obesidade grau III"

peso = float(input("Informe seu peso (Kg): "))
altura = float(input("Informe sua altura (m): "))
print(calc_imc(peso, altura))