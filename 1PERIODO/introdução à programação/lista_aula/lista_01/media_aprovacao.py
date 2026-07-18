nota1 = float(input("Nota 1: "))
nota2 = float(input("Nota 2: "))
nota3 = float(input("Nota 3: "))

media = (nota1+nota2+nota3)/3

if media >= 7:
    status = "aprovado"
    nota4 = " "
else:
    status = "Recuperação"
    nota4 = ((50 - media * 4)/6)

print (f"Você está {status} com média {media:.2f}  nota4:{nota4:.2f}")