#16.Descubra se um número é primo.

numero = int(input("Informe um número para testar sua primalidade: "))
primo = True

for i in range(2, numero -1):
    if numero % i == 0:
        primo = False
    
if primo:
        resultado = "é primo"
else:
        resultado = "não é primo"
        
print(f"o número {numero} {resultado}")