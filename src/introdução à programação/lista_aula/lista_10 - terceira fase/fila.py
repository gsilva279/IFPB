numeros = []

def inserir_numero(n):
    if n.isdigit():
        numeros.append(int(n))
        return True
    else:
        print("Entrada inválida!")
        return False

def exibir_lista():
     return numeros

while True:
    opcao = input("""
        ============================== 
        MENU 
        ============================== 
        1 - Inserir números na Lista 
        2 - Exibir Lista como Fila (FIFO) 
        3 - Finalizar programa 
        Opção: 
    """)

    match opcao:
        case "1":
            #adicionar
            i = 0
            while i < 5:
                num = input(f"Informe o {i + 1}° número: ")
                if inserir_numero(num):
                    i += 1
        case "2":
            #Exibir
            print(exibir_lista())
        case "3":
            #sair
            print("saindo...")
            break
        case _:
            print("Entrada inválida, digite apenas uma das opções!")