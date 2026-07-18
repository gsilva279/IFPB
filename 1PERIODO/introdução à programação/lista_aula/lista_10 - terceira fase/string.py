global_string = ""

def inserir_dados_string(entrada):
     #o global faz referencia a uma variável global
     global global_string
     global_string = global_string + entrada

def ler_exibir_string():
    if len(global_string) != 0:
        return f" -> {global_string}"
    else:
         return "-> String vazia"

def  atualizar_string(antigo, novo):
    global global_string
    if antigo in global_string:
        global_string = global_string.replace(antigo, novo)
    else:
        return "Válor não encontrado para atualizar"
    
def remover_dados_string(valor):
    global global_string
    if valor in global_string:
        global_string = global_string.replace(valor, "")
    else:
        return "Válor não encontrado para remover"
    
def comparacoes():
    global dados
    if global_string.isdigit():
        dados = "Dígito"
    if global_string.isascii():
        dados = "Caractere"
    return dados


while True:
    opcao = input("""
        ============================== 
        MENU 
        ============================== 
        1 - Inserir dados na String 
        2 - Ler e exibir os dados armazenados na String 
        3 - Atualizar dados da String
        4 - Remover dados da String
        5 - Sair   
        Opção: 
    """)
     
    if opcao == "1":
        entrada = input("Infome uma palavra para adicionar: ")
        inserir_dados_string(entrada)
    elif opcao == "2":
         print(ler_exibir_string())
         print(comparacoes())
    elif opcao == "3":
        antigo = input("Valor antigo para atualizar: ")
        novo = input("Atualizar para: ")
        print(atualizar_string(antigo, novo))
    elif opcao == "4":
         valor = input("Informe um valor para remover: ")
         remover_dados_string(valor)
    elif opcao == "5":
         print("Saindo...")
         break
    else:
         print("Erro, infome uma opção válida!")
