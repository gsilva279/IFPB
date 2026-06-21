vendas = [ 
 [1200, 3400, 2500], 
 [4500, 1100, 2900],
 [1800, 1900, 3900]
]

maior = 0
indice_vendedor = 0 

for i, vendedor in enumerate(vendas):
    for j, venda_mensal in enumerate(vendedor):
        if venda_mensal > maior:
            maior = venda_mensal
            indice_vendedor = i

print(f"Vendor {indice_vendedor} com maior venda {maior}")

        
