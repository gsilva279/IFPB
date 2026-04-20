salario = float(input("Informe seu salário: "))
faltas = int(input("Informe a quantidade de faltas: "))

if faltas != 0:
    print(f"Não tem direito ao aumento pois teve {faltas} faltas")
else:
    if salario <= 1500:
        salario += 200
    elif salario <= 3000.0:
        salario += 100
    else:
        salario += 50
    print(f"Seu salário é {salario:.2f}")
        
