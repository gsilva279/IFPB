bancodedados = {}
filadeimpressao = []

def validarCPF(cpf):
    if cpf.isdigit() and len(cpf) == 11:
       return True
    else:
        return False

def adicionarCadastro(cpf, nome, endereco):
    if validarCPF(cpf) and cpf not in bancodedados:
        bancodedados[cpf] = {"nome": nome, "endereço": endereco }
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
        return cpf + "removido com sucesso!!!"
    else:
         return "Dados não encontrados, por favor verifique seu cpf"