frase = input("Informe uma frase: ").split()
frases  = {}

for palavra in frase:
    contagem = frase.count(palavra)
    frases.update({palavra : contagem})

print(frases)
 
