banco_dados = {}

def validar_codigo(codigo):
    if codigo.isdigit() and len(codigo) == 8:
        return True
    else:
        return False

def adicionar_produto(codigo, nome, fabricante):
    if codigo not in banco_dados:
        if validar_codigo(codigo):
            int(codigo)
            banco_dados[codigo] = [nome, fabricante]
        else:
            return "código errado"

def ler_dados_codigo(codigo):
    if validar_codigo(codigo) and codigo in banco_dados:
        return banco_dados[codigo]
    else:
        return "Produto não cadastrado ou código errado"
    
def exibir_dados(codigo):
    if validar_codigo(codigo) and codigo in banco_dados:
        dados = ler_dados_codigo(codigo)
        return f"""
                ==== Dados do produto ====
                - Código: {codigo}
                - Nome: {dados[0]}
                - Fabricante: {dados[1]}
            """
    else:
        return "Produto não cadastrado"

def atualizar_produto(codigo, novo_nome, novo_fab):
    if validar_codigo(codigo) and codigo in banco_dados:
        banco_dados[codigo] = [novo_nome, novo_fab]
    else:
        return "Produto não cadastrado ou código errado"

def deletar_produto(codigo):
    if validar_codigo(codigo) and codigo in banco_dados:
        banco_dados.pop(codigo)
    else:
        return "Produto não cadastrado ou código errado"

while True:
    opcao = input("""
        ============================== 
        MENU 
        ============================== 
        1 - Adicionar um produto.
        2 - Ler os dados de um produto pelo código.
        3 - Exibir os dados de um produto pelo código.
        4 - Atualizar os dados de um produto pelo código.
        5 - Deletar um produto pelo código.
        6 - Sair.
        Opção: 
    """)

    match opcao:
        case "1":
            print("========= Produto =========")
            codigo = input("Código (8 digitos): ")
            nome = input("Nome: ")
            fabricante = input("Fabricante: ")
            adicionar_produto(codigo, nome, fabricante)
        case "2":
            codigo = input("Informe o código do produto: ")
            exibir = ler_dados_codigo(codigo)
            print(exibir)
        case "3":
            codigo = input("Informe o código do produto: ")
            exibir = exibir_dados(codigo)
            print(exibir)
        case "4":
             print("========= Atualizar produto =========")
             codigo = input("Informe o código do produto: ")
             novo_nome = input("Novo nome: ")
             novo_fab = input("Novo fabricante: ")
             atualizar_produto(codigo, novo_nome, novo_fab)
        case "5":
            print("========= Deletar produto =========")
            codigo = input("Informe o código do produto: ")
            deletar_produto(codigo)
        case "6":
            print("Saindo")
            break
        case  _:
            print("Entrada inválida, digite apenas uma das opções!")
