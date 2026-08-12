import os
bancodedados = {}
filadeimpressao = []

#depois verificar onde essa função vai ser chamda
def limpar():
    os.system('cls' if os.name == 'ntf' else 'clear')
    
def validarCPF(cpf):
    if cpf.isdigit() and len(cpf) == 11:
       return True
    else:
        return False

def adicionarCadastro(cpf, nome, endereco):
    if validarCPF(cpf) and cpf not in bancodedados:
        bancodedados[cpf] = {"nome": nome, "endereço": endereco}
        return cpf + " cadastrado com sucesso!!!"
    else:
        return "CPF inválido ou já cadastrado!!!" 
        
def obterCadastroPorCPF(cpf):
    if validarCPF(cpf) and cpf in bancodedados:
        usuarios = bancodedados[cpf]
        return f"""
                ==== {cpf} ====
                - Nome: {usuarios["nome"]}
                - Endereço: {usuarios["endereço"]}
            """
    else:
        return "Dados não encontrados, por favor verifique seu cpf"

def removerCadastro(cpf):
    if validarCPF(cpf) and cpf in bancodedados:
        del bancodedados[cpf]
        return "removido com sucesso!!!"
    else:
         return "Dados não encontrados, por favor verifique seu cpf"


#funções para a fila de impressão:
def painel_impressao():
    if filadeimpressao:
        resultado = f"Fila de impressão de cadastros\n:"
        for i, cpf in enumerate(filadeimpressao):
            resultado += f">> {i + 1} - CPF: {cpf}\n"
        return resultado
    else:
        return "Fila de impressão de cadastros:\n>> VAZIA"

def adicionar_fila(cpf):
    if cpf in bancodedados:
        filadeimpressao.append(cpf)
    print(filadeimpressao)