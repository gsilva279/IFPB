numero = int(input("INFORME UM NÚMERO PARA VERIFICAÇÃO: "))

if numero <= 0 or numero >= 18:
     print("Número aceito!")
else:
     print("Número não aceito")

#Outra alternativa
if numero > 0 and numero < 18:
    print("Número aceito!")
else:
    print("Número não aceito")