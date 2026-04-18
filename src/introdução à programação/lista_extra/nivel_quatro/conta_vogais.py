#20. Crie uma função conta_vogais(texto) que conte as vogais de uma string.

def conta_vogais(texto):
    qtd = len(texto)
    vogais = "aeiou"
    contador = 0

    for i in range(qtd):
        if texto[i] in vogais:
            contador += 1
    
    print(f"A quantidade de vogais é: {contador}")

texto = input("Informe uma palavra: ").lower()
conta_vogais(texto)