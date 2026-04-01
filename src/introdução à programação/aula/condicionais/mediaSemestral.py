nota1 = float(input("Informe a nota 1: "))
nota2 = float(input("Informe a nota 2: "))
nota3 = float(input("Informe a nota 3: "))

media_semestre = (nota1 + nota2 + nota3)/3

#[69...41]
if media_semestre < 70 and media_semestre > 40:
    nota_final = (500 - media_semestre * 6)/4
    print(f"Você está na final com média {media_semestre:.2f} parabéns, precisa de {nota_final} para ser aprovado!")
elif media_semestre < 40:
    print(f"Reprovado com média {media_semestre:.2f}")
else:
    print(f"Aprovado com média {media_semestre:.2f}")