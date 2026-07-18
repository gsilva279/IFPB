# Python

- break: Interrompe o loop imediatamente e sai dele.
- continue: Pula o resto do código da rodada atual e vai direto para a próxima repetição.

## While (enquanto):
- while: O while (enquanto) é usado quando você não sabe exatamente quantas vezes o código vai rodar. Ele continua repetindo enquanto uma condição for verdadeira (True).Cuidado: Se a condição nunca se tornar falsa, você cria um "loop infinito", o que pode travar seu programa.
    - incremento
    - condição inicial

### O Loop "Infinito" Controlado (while True):
Muito comum em menus de sistemas ou jogos. Você cria um loop propositalmente infinito e usa o break para sair dele quando uma condição interna for atingida.

while True:
    comando = input("Digite 'sair' para fechar ou 'ajuda' para suporte: ").lower()
    
    if comando == "sair":
        print("Encerrando programa...")
        break  # Única forma de sair desse loop
    elif comando == "ajuda":
        print("Aqui está o menu de ajuda.")
    else:
        print("Comando não reconhecido.")

## for (para):
Usado quando se sabe o número de repetições.

 - range(): função para gerar um conjunto númerico a partir de 0 (por padrão). 
    range (1 -> incio(start), 10 ->fim(stop), 2 ->incremento(step))
 - i : iteração, variável.

 for i in X:
    print(i)



exercio: sequencia de fibonnachi