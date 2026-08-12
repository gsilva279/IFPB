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
            print("=== cadastro ===")
            cpf = input("CPF: ").strip()
            nome = input("Nome: ")
            endereco = input("Endereço: ")
            print(fd.adicionarCadastro(cpf, nome, endereco))
        case "2":
            print("=== remover ===")
            cpf = input("CPF: ")
            print(fd.removerCadastro(cpf))
        case "3":
            print("=== consultar ===")
            cpf = input("CPF: ")
            print(fd.obterCadastroPorCPF(cpf))
        case "4":
            while True:
                opcao = input("""
                                =================================
                                            IMPRESSÃO
                                ==================================
                                1 – Escolher cadastro para impressão
                                2 – Imprimir cadastro(s) escolhido(s)
                                3 – Voltar para o Menu principal
                            """)
                if opcao == "1":
                    while True:
                        opcao = input("""
                                        1 – Inserir cadastro na fila de impressão
                                        2 – Remover cadastro da fila de impressão
                                        3 – Voltar para o Menu anterior 
                                    """)
                        if opcao == "1":
                            print(fd.painel_impressao())
                            cpf = input("Digite o CPF do cliente para INSERIR o seu cadastro na fila de impressão: ")
                            fd.adicionar_fila(cpf)
                        elif opcao == "2":
                            print("remover da fila de impressão")
                        elif opcao == "3":
                            print("saindo")
                            break
                        else:
                            print("Infome uma opção válida!!!")
                elif opcao == "2":
                    print("imprimir")
                elif opcao == "3":
                    print("voltar ao inicio")
                    break
                else:
                    print("Infome uma opção válida!!!")
        case "5":
            print("Sair")
            break
        case _:
            print("Erro, escolha apenas uma das opções!!!")