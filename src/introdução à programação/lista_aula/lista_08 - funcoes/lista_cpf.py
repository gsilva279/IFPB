cadastro = []

def adicionar(nome:str, idade:int, cpf:str) -> dict:
        cpf2 = cpf.replace("-", "").replace(".", "")
        if len(nome) != 0 and idade != 0 and len(cpf) != 0 and len(cpf2) == 11:
            cadastro.append({"nome":nome, "idade":idade, "cpf":cpf})
            print("scesso")
        else:
            print("ERRO")

def listar(cadatros:list) -> dict:
     if len(cadastro)  != 0:
        for i in cadatros:
            print(i)
     else:
         print("dicionário vazio")

while True:
    opcao = input("""
        Escolha uma das opções:
        1 - adicionar usuário
        2 - listar usuários
        0 - sair
        """)
    
    match opcao:
        case "1":
            nome = input("Nome: ")
            idade = int(input("Idade: "))
            cpf = input("CPF: ")
            adicionar(nome, idade, cpf)
        case "2":
            listar(cadastro)
        case "0":
            print("saindo...")
            break
        case _:
            print("ERRO, opção inválida!")