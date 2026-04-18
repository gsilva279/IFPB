atleta1 = float(input("Tempo do atleta 1: "))
atleta2 = float (input ("Tempo atleta 2: "))

if atleta1 < atleta2:
    vm = 100/atleta1
    temp_capeao = atleta2 - atleta1
    status = "Atleta1 campeão"
elif atleta2 < atleta1:
    vm = 100/atleta2 
    temp_capeao = atleta1 - atleta2
    status = "Atleta2 campeão"


print(f"{status} com vm {vm:.2f}m/s com uma diferença de {temp_capeao:.2f}s")