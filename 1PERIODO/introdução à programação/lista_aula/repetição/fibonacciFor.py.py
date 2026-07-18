fibonacci = int(input("Informe qual a quantidade de número para Fibonacci: ")) +1
a = 1
b = 0

for i in range(1, fibonacci):
    a = a + b
    b = a - b
    print(a)  