numero = int(input("Informe um número: "))

if numero % 4 == 0 and numero % 5 == 0:
    print ("É divisível por ambos")
elif numero % 4 == 0:
    print ("É divisível apenas por 4")
elif numero % 5 == 0:
    print("É divisível por 5")
else:
    print ("Não é divisível por nenhum dos números ")