def inverter_string(string:str) -> str:
    if string == "":
        return ""
    else:
        return string[-1] + inverter_string(string[:-1])
    
palavra = input("Informe uma palavra para inverter: ")
print(inverter_string(palavra))