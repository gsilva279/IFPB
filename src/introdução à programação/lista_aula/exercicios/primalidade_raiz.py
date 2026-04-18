num = int(input("Informe um número para verificar sua primalidade: "))
resultado = True

#int(num ** 0.5) + 1
#num ** 0.5: Se um número num não é primo, ele pode ser escrito como: num = a × b e pelo menos um desses fatores a ou b é menor ou igual à raiz quadrada de num
#int() : remove a parte decimal
# +1 : é necessário porque o range não inclui o valor final

for i in range(2, int(num ** 0.5) + 1):
    if num % i == 0:
        resultado = False
        break

#uso do operador ternário
print("É primo" if resultado else "Não é primo") 