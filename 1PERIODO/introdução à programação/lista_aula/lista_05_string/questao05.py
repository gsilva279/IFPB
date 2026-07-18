palavras =  input("Informe uma frase: ").lower().split()
vistas = []
repetidas = []

for elemento in palavras:
    if elemento in vistas:
        if elemento not in repetidas:
            repetidas.append(elemento)
    else:
        vistas.append(elemento)

print(repetidas)