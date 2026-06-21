produtos = {}

for i in range(3):
    produto = input(f"Informe o nome do produto {i + 1}: ").lower()
    valor = float(input(f"Informe o preço do produto {i + 1}: R$ "))
    produtos.update({produto : valor})

print("\nProdutos cadastrados:", list(produtos.keys()))

pesquisa = input("\nInforme o produto para pesquisa: ").lower()
if pesquisa in produtos:
    print(f"Produto : {pesquisa}")
    print(f"Preço   : R$ {produtos[pesquisa]:.2f}")
else:
    print(f"Produto '{pesquisa}' não encontrado.")
