# Exercício: Escreva uma função que receba a base e a altura de um triângulo e retorne sua área (A= (base x altura) / 2).

def area_retangulo(base, altura):
    return (base*altura)/2

base = int(input("Base: "))
altura = int(input("Altura: "))
print(f"A área do retangulo é: {area_retangulo(base, altura)} m²")