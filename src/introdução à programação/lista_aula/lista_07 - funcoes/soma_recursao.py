def soma_ate_100(n):
    if n == 1:
        return 1
    else:
        return n + soma_ate_100(n - 1)

print(soma_ate_100(100))