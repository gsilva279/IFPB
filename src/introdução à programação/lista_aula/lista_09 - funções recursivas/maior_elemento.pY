def maior_elemento(lista:list) -> int:
    if len(lista) == 1:
        return lista[0]
    else:
        maior_resto = maior_elemento(lista[1:])
        if lista[0] > maior_resto:
            return lista[0]
        else:   
            return maior_resto
        
print(maior_elemento([3, 4, 7, 9]))