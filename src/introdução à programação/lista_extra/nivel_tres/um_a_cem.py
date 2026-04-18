#11. Imprima os números de 1 a 100.

#Crescente
contador = 1

while contador <= 100:
    print(f"Contando: {contador}")
    contador += 1

#Decrescente
for cont in range(101, 0, -1):
    print(f"Contando: {cont}")