#meia entrada no cinema:

idade = int(input("Informe sua idade: "))
status = input("Infome seu status (E - estudante/ N - não é estudante): ")

if idade >= 60 or status == "E":
    print("Você tem direito a meia entrada.")
else:
  print("Você não tem direito a meia entrada")