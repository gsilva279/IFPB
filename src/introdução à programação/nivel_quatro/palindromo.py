#19. Crie uma função eh_palindromo(palavra) que retorne True ou False.

def eh_palindromo (palavra):
    tamanhoPalavra = len(palavra)
    invertida = palavra[::-1] #Slicing
    resultado = True

    for i in range(tamanhoPalavra):
        if palavra[i] != invertida[i]:
            resultado = False
            break
    
    print(f"{palavra}: {resultado}")

nome = input("informe um nome: ")
eh_palindromo(nome)
