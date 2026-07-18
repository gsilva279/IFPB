def media_lista(L):
    soma = 0
    total = len(L)
    for i in L:
        soma += i
        
    return soma / total

L = []
while True:
    numero = int(input("Informe um número para lita ou 0 para sair: "))
    if numero == 0:
        break
    L.append(numero)

print(f"A média da lista {L} é {media_lista(L)}")