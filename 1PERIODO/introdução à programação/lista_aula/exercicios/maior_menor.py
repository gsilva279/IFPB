#
for i in range(5):
    num = int(input("Informe um números: "))

    if i == 0:
        maior = num
        menor = num
    else:
        if num > maior:
            maior = num
        if num < menor:
            menor = num

print(f"O maior número é {maior} e o menor é {menor}")