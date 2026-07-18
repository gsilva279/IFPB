a = int(input("Informe o lado A do triangulo: "))
b = int(input("Informe o lado B do triangulo: "))
c = int(input("Informe o lado C do triangulo: "))

if c < a + b:
    if a == b == c:
        print("Triangulo Equilatero!")
    elif a != b != c:
        print("Trinagulo Escaleno!")
    else:
        print("Triangulo Isóceles!")
else: 
    print("Os valores informados não formam um triangulo.")

