#Simule um login simples: peça usuário e senha e valide com valores fixos.
for i in range(3, 0, -1):
    print("##### Simulador de login #####")
    login = input("Login: ")
    senha = input("Senha: ")

    if login == "admin" and senha == "12345":
        print("Login realizado com sucesso")
        break
    else:
        print(f"Login ou senha errados, você tem {i - 1} tentativas")

        if i == 1:
            print("Exedido o número de tentativas")