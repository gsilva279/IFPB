a = int(input ("Lado A: "))
b = int(input ("Lado B: "))
c = int(input ("Lado C: "))
soma = 0

if a > b and b > c:
    maior = a 
    soma = b + c
elif b > c:
    maior = b
    soma = a + c
else:
    maior = c
    soma = a + b
    
if soma < maior:
    print("Não é triângulo!")
else:
    if a == b and a == c and c ==b:
        print("Equilátero")
    elif a == b or a == c or c == b:
        print ("Isosceles")
    else:
        print("Escaleno")