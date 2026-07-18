#2. Faça um programa que gere uma lista que dá 10% de desconto para quem custa  mais de 100, mas ignora itens que custam menos de 10. Considere a lista  precos = [10, 50, 150, 200, 5] como referência.

precos = [10, 50, 150, 200, 5]
precos_descontos = []

for p in precos:
    if p > 100:
        novo_preco = p - (p * 0.10)
        precos_descontos.append(novo_preco)
    else:
        precos_descontos.append(p)

print(f"Com desconto: {precos_descontos}")

#com list com List Comprehension:
precos = [10, 50, 150, 200, 5]
preco_filtrados = [p - (p * 0.10) if p > 100 else p for p in precos if p >= 10]
print(f"Resultado final: {preco_filtrados}")