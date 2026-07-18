#1. Faça um programa que gere uma lista contendo somente “Aprovados” ou “reprovados”, de acordo com as médias da lista notas = [4, 7, 9, 5, 8], sabendo que médias acima de 6,9 são aprovados, senão reprovados.

notas = [4, 7, 9, 5, 8]
resultado = []

for i in notas:
    if i > 6.9:
        resultado.append("Aprovado")
    else:
        resultado.append("Reprovado")
        
print(resultado)