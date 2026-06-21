nome = input("Informe um nome: ").strip()

if not nome[0].isupper():
    nome = nome.capitalize()
    print(nome)
else:
    print(f"A palavra {nome} tem letra maiúscula.")
