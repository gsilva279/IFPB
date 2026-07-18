soma =0

for i in range(1, 5):
    notas = int(input(f"Informe a nota {i}°: "))
    soma += notas
    
media = soma / 4

if media >= 5:
    print(f"Aprovado com média: {media:.2f}")
else:
    print(f"Reprovado com média: {media:.2f}")
