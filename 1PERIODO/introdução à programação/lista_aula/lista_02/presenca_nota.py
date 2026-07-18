presenca = int(input("Informe a percentagem de presença: "))
i = 0
soma = 0

if presenca < 75:
    status = "reprovado por falta"
else:
    while i < 3:
        notas = float(input(f"Informe a nota {i+1}: "))
        soma += notas
        i += 1

    media = soma / i

    if media >= 70 and presenca >= 75:
        status = "aprovado"
    elif media >= 40 and presenca >= 75:
        status = "vai para final"
    else:
        status = "reprovado por nota"

print(status)

