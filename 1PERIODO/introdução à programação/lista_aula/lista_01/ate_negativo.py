num = int(input("Número: "))
maior = num 
menor = num

while True:
    num = int(input("Número: "))
    
    if num >= 0 :
        if num > maior:
            maior = num 
        if num < menor:
             menor = num
    else:
         print (f"número negativo: {num}")
         break 
         

print(maior, menor)