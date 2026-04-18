#Faça um programa que some de forma acumulativa 
limite = int(input("Informe um limite para soma acumulativa: ")) + 1
soma = 0

for i in range(1, limite):
    soma += i

print(soma)


#Com While:
a = 1
b = 2

while b <= 5:
    r = a + b
    b += 1
    a = r
    print(r)

#Simplificada
r = 1
b = 2 

while b <= 5:
    r = r + b # r += b
    b += 1
    print(r)