cpfs = [
    "123.456.789-09",
    "12345678909",
    "123.456.78a-09",
    "999.999.999-99",
    "123-456.789-09",
]

resutado = []

for cpf in cpfs:
    if len(cpf) == 14:
        if cpf[3] == "." and cpf[7] == "." and cpf[11] == "-":
            if cpf[0].isdigit() and cpf[1].isdigit() and cpf[2].isdigit() and cpf[4].isdigit() and cpf[5].isdigit() and cpf[6].isdigit() and cpf[8].isdigit() and cpf[9].isdigit() and cpf[10].isdigit() and cpf[12].isdigit() and cpf[13].isdigit():
                resutado.append(cpf)

print(resutado)