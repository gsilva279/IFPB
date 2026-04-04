#15.Imprima a tabuada de um número escolhido pelo usuário.

numero = int(input("Informe um número e veja sua tabuada: "))

for i in range(1, 11):
    tabuada = numero * i
    print(f"-> {numero} X {i} = {tabuada}")