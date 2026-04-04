import math

numero = int(input("Informe um número para testar sua primalidade: "))
primo = True

if numero < 0:
      numero *= -1

if numero < 2:
    primo = False

for i in range(2, int(math.sqrt(numero)) +1):
    if numero % i == 0:
        primo = False
        break
    
if primo:
        resultado = "é primo"
else:
        resultado = "não é primo"
        
print(f"o número informado {resultado}")