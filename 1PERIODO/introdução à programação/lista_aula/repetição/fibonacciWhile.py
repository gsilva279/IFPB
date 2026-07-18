i = 8
a = 1
b = 0

while i > 0:
    fib = a + b
    a = fib
    b = a - b
    print(fib)
    i -= 1


#refatorando:
i = int(input("Informe qual a quantidade de número para Fibonacci: "))
a = 1
b = 0

while i > 0:
    a = a + b
    b = a - b
    print(a)
    i -= 1
    