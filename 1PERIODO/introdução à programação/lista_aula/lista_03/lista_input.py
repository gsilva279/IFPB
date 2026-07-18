a = [2, 4, 5, 7]
#lista todas os métodos:
print(dir(a))

#explica o método informado
print (help(a.pop))


#Nomes:
nomes = []
for i in range(3):
    nome = input(f"Informe o {i + 1}° nome: ")
    nomes.append(nome)
print(nomes)


#Numeros:
num = []
for i in range(3):
    numero = int(input("Número: "))
    num.append(numero)
print(num)

