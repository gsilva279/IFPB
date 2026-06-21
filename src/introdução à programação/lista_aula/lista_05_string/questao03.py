palavras = ["pé", "de", "péde", "bola", "futebol", "fute", "bol"]
resultado = []

for palavra in palavras:
    for i in range(1,len(palavra)):
        esquerda = palavra[0:i]
        direita = palavra[i:]

        if esquerda in palavras and direita in palavras:
            if palavra not in resultado:
                resultado.append(palavra)

print(resultado)