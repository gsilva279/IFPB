banco_dados = {}

def validar_rg(rg):
    if rg.isdigit() and len(rg) == 7:
        return True
    else:
        return False

def adicionar_pessoa(rg, primeiro_nome, segundo_nome):
    if validar_rg(rg) and rg not in banco_dados:
        banco_dados[rg] = {
            "primeiro_nome": primeiro_nome, 
            "segundo_nome": segundo_nome
        }
    else:
        return "Erro: cadastro já existe no DB ou rg inválido"
    
def ler_dados(rg):
    if validar_rg(rg) and rg in banco_dados:
        return banco_dados[rg]
    else:
        return "Pessoa não encontrado ou não cadastrada"

def exibir_dados_rg(rg):
    if validar_rg(rg) and rg in banco_dados:
        dados = ler_dados(rg)
        return f"""
                ==== Dados da pessoa ====
                - RG: {rg}
                - Nome: {dados["primeiro_nome"]}
                - Segundo nome: {dados["segundo_nome"]}
            """
    else:
        return "Pessoa não cadastrada"

def atualizar_pessoa(rg, novo_nome, novo_seg):
    if validar_rg(rg) and rg in banco_dados:
        banco_dados[rg].update({ "primeiro_nome": novo_nome, "segundo_nome": novo_seg})
    else:
        return "Cadastro não encontrado ou código errado"

def deletar_cadastro(rg):
    if validar_rg(rg) and rg in banco_dados:
        del banco_dados[rg]
    else:
        return "Cadastro não encontrado ou código errado"



while True:
    opcao = input("""
        ============================== 
        MENU 
        ============================== 
        1 - Adicionar uma pessoa.
        2 - Ler os dados de uma pessoa pelo RG.
        3 - Exibir os dados de uma pessoa pelo RG.
        4 - Atualizar os dados de uma pessoa pelo RG.
        5 - Deletar uma pessoa pelo RG.
        6 - Sair.
        Opção: 
    """)

    if opcao == "1":
        print("========= Cadastro =========")
        rg = input("RG: ")
        primeiro_nome = input("Prineiro nome: ")
        segundo_nome = input("Segundo nome: ")
        print(adicionar_pessoa(rg, primeiro_nome, segundo_nome))
    elif opcao == "2":
        print("========= Ler =========")
        rg = input("Informe o RG para ler os dados: ")
        print(ler_dados(rg))
    elif opcao == "3":
        print("========= Exibir =========")
        rg = input("Informe o RG para exibir os dados: ")
        print(exibir_dados_rg(rg))
    elif opcao == "4":
        print("========= Atualizar =========")
        rg = input("Informe o RG para atualizar os dados: ")
        novo_nome = input("Informe o novo nome: ")
        novo_seg = input("Informe o novo segundo nome: ")
        atualizar_pessoa(rg, novo_nome, novo_seg)
    elif opcao == "5":
        print("========= Excluir =========")
        rg = input("Informe o RG para excluir os dados: ")
        deletar_cadastro(rg)
    elif opcao == "6":
        print("Saindo...")
        break
    else:
        print("Entrada inválida, digite apenas uma das opções!")