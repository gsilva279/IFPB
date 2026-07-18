def soma_lista(lista:list) -> int:
    if len(lista) == 0:
        return 0
    else:
        return lista[0] + soma_lista(lista[1:])


print(soma_lista([2,3,6, 4]))