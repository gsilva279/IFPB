#calculo do IMC

altura = float(input("Informe sua altura (m): "))
peso = float(input("Informe seu peso (Kg): "))

imc = peso / (altura**2)

if imc < 18.5:
    print(f"Seu IMC é {imc:.2f}Kg/m^2 - Abaixo do peso")
elif imc < 24.9:
    print(f"Seu IMC é {imc:.2f}Kg/m^2 - Peso normal")
elif imc < 29.9:
    print(f"Seu IMC é {imc:.2f}Kg/m^2 - Sobrepeso")
elif imc < 34.9:
    print(f"Seu IMC é {imc:.2f}Kg/m^2 - Obesidade Grau I")
elif imc < 39.9:
    print(f"Seu IMC é {imc:.2f}Kg/m^2 - Obesidade Grau II")
else:
    print(f"Seu IMC é {imc:.2f}Kg/m^2 - Obesidade Grau III (Mórbida)")

