a = int(input("Informe um número para ver seu fatorial: "))
b = a - 1

while b > 0:
    a = a * b
    b -= 1
    print (a)