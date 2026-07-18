def eh_palindromo(palavra:str) -> bool:
    palavra = palavra.replace(" ", "").lower()
    if len(palavra) <= 1:
        return True
    if palavra[0] != palavra[-1]:
        return False
    else:
        return eh_palindromo(palavra[1:-1])

print(eh_palindromo("arara"))