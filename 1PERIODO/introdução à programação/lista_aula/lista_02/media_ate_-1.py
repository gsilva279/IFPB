cont = 1
soma_medias = 0
acima_70 = 0

while True:
    medias = int(input(f"Informe a média {cont}: "))

    if medias == -1:
        print("Finalizado!!!")
        break

    if medias > 70:
        acima_70 += 1

    soma_medias += medias
    cont += 1

print(f"Soma das médias: {soma_medias}")
print(f"Quantidade de médias maiores que 70: {acima_70}")