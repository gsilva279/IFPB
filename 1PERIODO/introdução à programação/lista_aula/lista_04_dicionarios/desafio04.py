alunos = {}

while True:
    opcao = int(input("""
        1 - Adicionar;
        2 - Remover;
        3 - Ver dados
        0 - Sair
    """))

    if opcao == 1:
        #Adicionar o aluno:
        matricula = int(input("Informe a matrícula do aluno: "))
        nome = input ("Informe o nome do aluno: ")
        status = True
        nota1 = float(input("Nota 1: "))
        nota2 = float(input("Nota 2: "))
        nota3 = float(input("Nota 3: "))

        if matricula in alunos:
            print("A matricula coencide com outra existente, informe outra matricula!!")
        else:
            alunos.update({matricula: {"nome": nome, "status": status, "nota1": nota1, "nota2": nota2, "nota3":nota3}})
            print(alunos)

    elif opcao == 2:
        #remover
        matricula_remover = int(input("Informe a matrícula para remover o aluno: "))

        if matricula_remover in alunos:
            alunos.pop(matricula_remover)
            print("Removido com sucesso!")
            print(alunos)
    elif opcao == 3:
        #ver e media
        matricula_ver = int(input("Informe a matrícula: "))

        if matricula_ver in alunos:
            n1 = alunos[matricula_ver]["nota1"]
            n2 = alunos[matricula_ver]["nota2"]
            n3 = alunos[matricula_ver]["nota3"]

            media = (n1 + n2 + n3)/3

            print(alunos[matricula_ver])
            print(f"Média: {media:.2f}")
        else:
            print("Matrícula não encontrada no sistema!")

    elif opcao == 0:
        print("Saindo...")
        break
    else:
        print("Erro, infome uma opção válida!")