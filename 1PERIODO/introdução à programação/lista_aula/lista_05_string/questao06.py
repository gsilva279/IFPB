frase1 = input("Frase 1: ").lower().split()
frase2 = input("Frase 2: ").lower().split()
contadas = []
comum = 0
percentagem = 0

if len(frase1) <  len(frase2):
    menor = frase1
else:
    menor = frase2

for i in frase1:
    for j in frase2:
        if i == j and i not in contadas:
            comum += 1
            contadas.append(i)

percentagem = (comum / len(menor)) * 100
print(f"Similaridade: {percentagem:.2f}%")