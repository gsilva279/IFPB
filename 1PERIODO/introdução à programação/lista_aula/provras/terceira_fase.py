bancodedados = {}
filadeimpressao = []


while True:
    opcao = input("""
        ===========================
            ESTILO STILY
        ===========================
        1 – Cadastrar usuário
        2 – Remover cadastro
        3 – Consultar cadastro
        4 – Imprimir cadastros
        5 – Sair
        """)
    
    match opcao:
        case "1":
            print("cadastrar")
        case "2":
            print("Remover")
        case "3":
            print("consultar")
        case "4":
            print("Imprimir")
        case "5":
            print("Sair")
            break
        case _:
            print("Erro, escolha apenas uma das opções!!!")