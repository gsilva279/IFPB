a = int(input("Informe um número: "))
b = int(input("Informe um número: "))
c = int(input("Informe um número: "))

# a maior que b, b maior que c  então c menor que, logo c = último
if a > b and b > c:
    maior = a 
    meio = b
    menor = c
elif b > a and a > c: 
    maior = b
    meio = a
    menor = c
elif c > a and a > b:
    maior = c
    meio = a
    menor = b
elif a > c and c > b:
    maior= a
    meio = c
    menor = b
elif b > c and c >a:
    maior = b
    meio = c
    menor = a
elif c > b and b > a:
    maior = c
    menor = b
    menor = a
else:
    print("Valor digitado inválido")
    
print (menor, meio, maior )
