# Faixas de imposto:
# Até R$ 1.000,00      → isento (0%)
# R$ 1.000 a R$ 3.000  → 20%
# Acima de R$ 3.000    → 35%

salario = float(input("Sálario: R$ "))
base = salario
imposto = 0.0

if base > 3000:
    imposto += (base - 3000) * 0.35
    base = 3000

if base > 1000:
    imposto += (base - 1000) * 0.20

print(f"Salário: R$ {salario:8.2f}")
print(f"Imposto: R$ {imposto:8.2f}")
print(f"Líquido: R$ {salario - imposto:8.2f}")