def celsius_faheint(C):
    F = C * 9/5 + 32
    return f"{F} F°"

entrada = float(input("Informe a tenperatura em Celsius: "))
print(celsius_faheint(entrada))

