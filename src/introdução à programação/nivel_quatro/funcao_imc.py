#18. Crie uma função calcular_imc(peso, altura) que retorne o IMC e a classificação.

def calculadora_imc (peso, altura):
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

calculadora_imc(peso=60, altura=1.72)