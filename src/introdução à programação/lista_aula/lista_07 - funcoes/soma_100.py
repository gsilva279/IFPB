def soma_ate_100():
    soma = 0
    for i in range(1, 101):
        soma += i
    return f"A soma dos cem primeiros números é: {soma}"

resultado = soma_ate_100()
print(resultado)