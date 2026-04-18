def retangulo(largura, altura, caractere="*"):
    linha = caractere * largura
    for i in range(largura):
        print(linha)


retangulo(4,3)