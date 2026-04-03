#13.Calcule o fatorial de um número usando while.
# 4! = 4*3*2*1 = 120

numero = int(input("Informe um número para calcular o fatorial: "))
contador = numero - 1 #3
fatorial = 0

while contador > 0:
    fatorial = numero * contador
    contador -= 1
    numero = fatorial

print(f"O fatorial do número {numero} é {fatorial}")