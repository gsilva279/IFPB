resultado = 0
print("Informe dois números para multiplicar: ")

n1 = int(input())
n2 = int(input())

for i in range(1, n2):
    print(n2, end="+")

    if i == n1 - 1:
        print(n2, end="=")

for a in range(n1):
    resultado = resultado + n2


print(resultado)