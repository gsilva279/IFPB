import random
import string

def gerar_senha(tamanho, opcao):
    match opcao:
        case 1:
            caracteres = string.digits
        case 2:
            caracteres = string.digits + string.ascii_letters
        case 3:
            caracteres = string.digits + string.ascii_letters + string.punctuation
        
    senha =  ""
    for i in range(tamanho):
        senha += random.choice(caracteres)
    
    return senha

opcao = int(input("""
                    1 - só números;
                    2 - Números e letras;
                    3 - Números, letras e especiais.
                    -> 
                  """))
tamanho = int(input("Quantidade de caracteres para a senha: "))
print(gerar_senha(tamanho, opcao))
