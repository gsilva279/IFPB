funcionarios = {
    1: {"nome": "José", "cargo": "Produtor", "departamento": "Agricultura", "permissoes": ["leitura", "escrita"]},
    2: {"nome": "Maria", "cargo": "Gerente", "departamento": "Vendas", "permissoes": ["leitura"]},
    3: {"nome": "Carlos", "cargo": "Analista", "departamento": "TI", "permissoes": []}
    }

while True:
    opcao = input('''
        Digite:
        1 - Verificar permissão;
        2 - Atualizar permissão
        '''
    )
    
    if opcao == '1':
        id = int (input("Informe o id do funcionário: "))
        permisao = input("Informe a permissão do funcionário: ").lower()

        if id in funcionarios:
            if permisao in funcionarios[id]["permissoes"]:
                print("True")
            else:
                print("False")
        else:
            print("O funcionário não está na lista!")

    elif opcao == '2':
        #atualizar
        id = int (input("Informe o id do funcionário: "))
        nova_permissão = input("Informe uma nova permissão: ").lower()
        funcionarios[id].update({"permissoes": [nova_permissão]})

        print("Permissão atualizada com sucesso!")
        print(funcionarios[id])
        
    else:
        break