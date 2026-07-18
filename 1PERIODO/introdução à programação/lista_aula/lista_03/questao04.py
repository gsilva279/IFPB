#4. Imagine que você está monitorando a temperatura de sensores. Precisamos  armazenar as leituras para gerar um relatório de picos. Considere as leituras de  temperatura coletadas a cada hora: leituras_temp = [22.5, 23.0, 25.8, 24.2, 28.5,  21.9]. Gere um programa que mostre a maior, a menor e a média de  temperaturas.

leituras_temp = [22.5, 23.0, 25.8, 24.2, 28.5,  21.9]
maior = leituras_temp[0]
menor = leituras_temp[0]

for temp in leituras_temp:
    if temp > maior:
        maior = temp
    if temp < menor:
        menor = temp

soma = sum(leituras_temp)
total = len(leituras_temp)
media = soma/total

print(f"""
            Maior: {maior}
            Menor: {menor}
            Média: {media:.2f}
    """)