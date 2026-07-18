#Matriz com input:
linha = []
coluna = []

for i in range (3):
    i = int(input("Linha: "))
    j = int(input("Coluna: "))
    linha.append(i)
    coluna.append(j)

mat = [
    linha,
    coluna
]

for i in mat:
    for elemento in i:
        print(elemento, end=" ")
    print()


#-Matriz:
L = [2,2,2]
M = [3,3,3]

for x in L:
    for elemento in M:
        print(elemento, end=" ")
    print()
    

#Matriz dinamica:
linhas = 2
colunas = 3

matriz = [[0 for _ in range(colunas)] for _ in range(linhas)]

for linha in matriz:
    for elemento in linha:
        print(elemento, end=" ")
    print()