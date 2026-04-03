#7. Leia três notas e calcule a média. Exiba se o aluno foi aprovado (≥7), em recuperação (5–6.9) ou reprovado (<5).

contador = 0
soma = 0

while contador < 3:
    nota = int(input("Informe  a nota do aluno: "))
    soma += nota
    contador += 1

media = soma/3

if media >= 7:
    print(f"Aprovado")
elif media >= 5 and media <= 6.9:
    print(f"Recuperação")
elif media < 5:
    print(f"Reprovado")
else:
    print("Valor inválido, informe outro valor")
