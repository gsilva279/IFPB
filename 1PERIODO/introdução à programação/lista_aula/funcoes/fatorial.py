def fatorial(n):
    fat = 1
    
    while n > 1:
        fat *= n
        n -= 1
        
    return fat

n = int(input("informe um número: "))
print(f"Fatorial: {fatorial(n)}")