#crie uma lista e faça uma busca!
valores = []

#adicionando a lista
while True:
    valor = int(input("Adicione valores a lista (0 para sair): "))

    if valor == 0:
        break
    valores.append(valor)

print(valores)

#busca
busca = int(input("Informe um valor para busca: "))
for val in valores:
    if val == busca:
        print(f"número {busca} encontrado!")
        break
    else:
        print("Número não encontrado.")


