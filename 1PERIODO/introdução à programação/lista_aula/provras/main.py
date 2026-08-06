import funcoes as fd

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
            cpf = input("CPF: ").strip()
            nome = input("Nome: ")
            endereco = input("Endereço: ")
            print(fd.adicionarCadastro(cpf, nome, endereco))
        case "2":
            cpf = input("CPF: ")
            fd.removerCadastro(cpf)
        case "3":
            print("consultar")
            cpf = input("CPF: ")
            print(fd.obterCadastroPorCPF(cpf))
        case "4":
            print("Imprimir")
        case "5":
            print("Sair")
            break
        case _:
            print("Erro, escolha apenas uma das opções!!!")