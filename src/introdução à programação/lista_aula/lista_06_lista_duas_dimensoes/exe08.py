matriz = [[1, 2], 
          [3, 4]]
invertida = matriz[::-1]
n = len(matriz)
g = [["" for j in range(n)] for i in range(n)]

for j in range(n):
    for i in range(n):
        g[j][i] = invertida[i][j]

print(g)

    