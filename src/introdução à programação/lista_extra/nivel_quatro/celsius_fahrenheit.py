#21. Crie uma função celsius_para_fahrenheit(c) reutilizando o exercício 3.

def celsius_para_fahrenheit(c):
    return((c * 9)/5) + 32


c = float(input("Informe a temperatura em C°: "))
resultado = celsius_para_fahrenheit(c)
print(f"A temperatura {c}C° é {resultado}F°")