import java.util.ArrayList;

public class CentralDeInformacoes {

    private ArrayList<Jogador> todosOsJogadores;
    private ArrayList<Palavra> todasAsPalavras;

    public CentralDeInformacoes() {
        this.todosOsJogadores = new ArrayList<>();
        this.todasAsPalavras = new ArrayList<>();
    }

    public boolean adicionarJogador(Jogador jogador) {
        if (jogador == null) {
            return false;
        }
        if (recuperarJogadorPorCPF(jogador.getCpf()) != null) {
            return false;
        }
        if (recuperarJogadorPeloEmail(jogador.getEmail()) != null) {
            return false;
        }
        todosOsJogadores.add(jogador);
        return true;
    }

    public ArrayList<Jogador> getTodosOsJogadores() {
        return todosOsJogadores;
    }

    public void setTodosOsJogadores(ArrayList<Jogador> todosOsJogadores) {
        this.todosOsJogadores = todosOsJogadores;
    }

    public Jogador recuperarJogadorPorCPF(String cpf) {
        for (Jogador j : todosOsJogadores) {
            if (j.getCpf().equals(cpf)) {
                return j;
            }
        }
        return null;
    }

    public Jogador recuperarJogadorPeloEmail(String email) {
        for (Jogador j : todosOsJogadores) {
            if (j.getEmail().equalsIgnoreCase(email)) {
                return j;
            }
        }
        return null;
    }

    public ArrayList<Palavra> getTodasAsPalavras() {
        return todasAsPalavras;
    }

    public void setTodasAsPalavras(ArrayList<Palavra> todasAsPalavras) {
        this.todasAsPalavras = todasAsPalavras;
    }

    public boolean adicionarPalavra(Palavra palavra) {
        if (palavra == null) {
            return false;
        }
        if (recuperarPalavra(palavra.getPalavra()) != null) {
            return false;
        }
        todasAsPalavras.add(palavra);
        return true;
    }

    public Palavra recuperarPalavra(String palavra) {
        for (Palavra p : todasAsPalavras) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                return p;
            }
        }
        return null;
    }
}