import os

a = 0
b = 011111
c = 0
branco = 0
nulo = 0

def clean():
    os.system('cls' if os.name == 'nt' else 'clear')


while True:
    voto = int(input("1 - para o candidato A \n2 - para o candidato B \n3 - para o candidato C \n4 - para branco \n5 - para nulo \n0 - encerar votação \n-> "))
    if voto == 1:
        a += 1
    elif voto == 2:
        b += 1
    elif voto == 3:
        c += 1
    elif voto == 4:
        branco += 1
    elif voto == 5:
        nulo += 1
    elif voto == 0:
        print("Votação encerrada")
        break
    else:
        print("Valor inválido")

    clean()

if a > b and b > c:
    resultado = "A ELEITO"
elif b > a and b > c:
    resultado = "B ELEITO"
else:
    resultado = "C ELEITO"

eleitores_totais = a + b + c + nulo + branco
per_a = (a / eleitores_totais) * 100
per_b = (b / eleitores_totais) * 100
per_c = (c / eleitores_totais) * 100
per_brancos = (branco / eleitores_totais) * 100
per_nulo = (nulo/ eleitores_totais) * 100

print(f"Total de eleitores: {eleitores_totais}")
print(f"A: {a} {per_a:.2f}% \nB: {b} {per_b:.2f}% \nC: {c} {per_c:.2f}% \nBrancos: {branco} {per_brancos:.2f}% \nNulos: {nulo} {per_nulo:.2f}% \n\n  {resultado}!!!")