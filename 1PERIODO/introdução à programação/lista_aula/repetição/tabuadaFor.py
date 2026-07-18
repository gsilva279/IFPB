print("#### TABUADA ####")

tabuada = int(input("Informe o número para ver sua tabuada: "))
limite_tabuada = int(input("Informe o limite para sua tabuada: ")) + 1

for i in range(1, limite_tabuada):
    resultado = tabuada * i
    print(f"{tabuada} * {i} = {resultado}")