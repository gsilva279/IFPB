nomes = [
    "Camila", "Bruno", "Ana", "Mariana", "Rodrigo",
    "Bia", "Amanda", "Matheus", "Carlos", "Rafaela",
    "Aline", "Breno", "Marcos", "Caio", "Renan",
    "Arthur", "Beatriz", "Manuela", "Clara", "Ricardo"
]

dic = {}
resultado = []

for nome in nomes:
    letra = nome[0]

    if letra in dic:
        dic[letra].append(nome)
    else:
        dic[letra] = [nome]

for letra, grupo in dic.items():
    resultado.append(tuple(grupo))

print(resultado)
