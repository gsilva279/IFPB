#Exercício: Escreva uma função que receba o lado de um quadrado e retorne sua área (A = lado2)

def area(lado):
    return lado**2

lado = int(input("Informe a aresta do quadrado: "))
print(f"A área do quadrado é: {area(lado)} m²")