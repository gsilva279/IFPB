#12. Imprima apenas os números pares entre 1 e 50.

#uso do while
par = 1
while par <= 50:
   if par % 2 == 0:
    print(par)

   par += 1

#uso do for
for pares in range(1, 50):
    if pares % 2 == 0:
        print(pares)