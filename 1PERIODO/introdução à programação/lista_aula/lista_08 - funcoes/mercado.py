mercadorias = []

def cadastrar_produto(id:int, nome:str, preco:float) -> list:
    if nome and preco:
        mercadorias.append({"id":id, "nome":nome, "preco": preco})
        print("Cadastrando mercadoria")
    else:
        print("Algum campo está vazio!")

def aumento_percentual(id_produto:int, aumento:int) -> float:
    for elemento in mercadorias:
        if elemento["id"] == id_produto:
            elemento["preco"] = elemento["preco"] + (elemento["preco"] * aumento/100)
    print("Aumento realizado com sucesso")

def listar_produto(mercadorias:list) -> list:
    if len(mercadorias) != 0:
        for elemento in mercadorias:
            print(elemento)
    else:
        print("A lista está vazia!")

while True:
    opcao = input("""
            Escolha uma das opções:
            1 - cadastrar mercadorias
            2 - listar mercadorias
            3 - aumentar mercadoria
            0 - sair
            """)

    match opcao:
        case "1":
            id = len(mercadorias) + 1 #gera um id unico baseado no tamanho da lista
            nome = input("Nome: ")
            preco = float(input("Preço(R$): "))
            cadastrar_produto(id, nome, preco)
        case "2":
            print("listando mercadorias")
            listar_produto(mercadorias)
        case "3":
            id_produto = int(input("ID do produto: "))
            aumento = int(input("Valor do aumento(%): "))
            aumento_percentual(id_produto, aumento)
        case "0":
            print("Saindo...")
            break
        case _:
            print("Erro, valor informado inválido")
        