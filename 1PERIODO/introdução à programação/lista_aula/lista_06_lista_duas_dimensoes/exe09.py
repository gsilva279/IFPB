a = [[3, 4], [5, 3]]
b = [[1, 2], [7, 9]]

n_linhas = len(a)
n_colunas = len(b[0])
n_comum = len(b)

c = [[0 for j in range(n_colunas)] for i in range(n_linhas)]

for i in range(n_linhas):
    for j in range(n_colunas):
        for k in range(n_comum):
            c[i][j] += a[i][k] * b[k][j]

print(c)
# [[31, 42], [26, 37]]