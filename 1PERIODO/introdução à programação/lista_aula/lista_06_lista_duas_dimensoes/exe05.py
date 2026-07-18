cinza = [[0, 4, -1], [8, 3, -2], [5, -7, 1]]
print(f"Original: {cinza}")

for i, linha in enumerate(cinza):
    for j, coluna in enumerate(linha):
        if coluna < 0:
            cinza [i][j] = 0

print(f"Sem negativo: {cinza}")