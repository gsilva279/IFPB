cpf = input("Informe o seu CPF: ")

if cpf.isdigit():
    if len(cpf) == 11:
        print(f"***.{cpf[3:6]}.{cpf[6:9]}-***")
    else:
        print("O número precisa ter 11 digítos")
else:
    print("não é um CPF válido")