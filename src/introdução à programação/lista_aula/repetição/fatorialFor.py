a = int(input("Informe um número para ver seu fatorial: "))

for i in range((a - 1), 1, -1):
	a = a * i
	print(a)

