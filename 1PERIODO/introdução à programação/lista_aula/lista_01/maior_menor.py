for i in range(5):
    a = int(input("Número: "))
    if i == 0:
        maior = a
        menor = a
    if a > maior:
         maior = a 
    if a < menor:
         menor = a
    
  
      
print(maior, menor)