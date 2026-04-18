user = input("Send you user: ")
password = int(input("Send you password: "))

cont = 3;

while cont > 0:
    if user ==  "Admin" and pasword == 12345:
        print("Acesso permitido")
        break
    else:
        cont -= 1
        #ver a lógica do jogo:
        if cont > 0:
            print(f"Acesso negado, você tem {cont} tentativas")
        else:
            print("Bloqueado!")