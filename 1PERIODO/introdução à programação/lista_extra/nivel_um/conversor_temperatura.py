#3. Converta uma temperatura em Celsius para Fahrenheit. (F = C × 9/5 + 32)
print("###### COVERSOR DE TEMPERATURA ##################")
temp_celsius = float(input("Informe a temperatura em C°: "))
temp_fahrenheit = ((temp_celsius * 9)/5) + 32

print(f"A temperatura {temp_celsius}C° é {temp_fahrenheit}F°")