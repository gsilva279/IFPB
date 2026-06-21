def paraidade(numero):
    par = numero % 2 == 0
    return par

numero = int(input("Informe um número para verificar sua paridade: "))
print(paraidade(numero))