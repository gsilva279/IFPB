num = int(input("Informe um número para verificar se é par ou ímpar: "))

#uso do operador ternário: valor_verdadeiro if <condição> else valor_falso
status = "par" if num % 2 == 0 else "ímpar"
print(f"O número {num} é {status}")