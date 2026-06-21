frase = input("Informe uma frase: ").lower()

def contador_letras(frase:str) -> dict:
    letras = {}

    for i in frase.replace(" ", ""):
        if i not in letras:
            letras[i] = 1
        else:
            letras[i] += 1
    return(letras)

resultado = contador_letras(frase)
print(resultado)


            
        