#3. Em um sistema de e-commerce, não sabemos quantos itens o usuário vai comprar. A lista é a estrutura ideal para o "Carrinho". Crie um programa que: 1 – adicione elementos no carrinho, 2- tire elementos do carrinho, 3 – imprima  elementos do carrinho e saia do programa. (Veja como se usa o match, case)

carrinho = []

while True:
    escolha = int(input("Escolha uma das opções: 1 – adicione elementos no carrinho \n2- tire elementos do carrinho \n3 – imprima  elementos do carrinho e saia do programa."))

    match escolha:
        case 1:
            elemento = input("Adicionar: ")
            carrinho.append(elemento)
        case 2:
            excluir = input("Excluir: ")
            carrinho.remove(excluir)
        case 3:
            print(carrinho)
            break