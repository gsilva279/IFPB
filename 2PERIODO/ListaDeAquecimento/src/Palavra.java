import java.time.LocalDate;
import java.util.Objects;

public class Palavra {

    private String palavra;
    private String dica;
    private LocalDate dataCadastro;
    private Dificuldade dificuldade;

    public Palavra(String palavra, String dica, Dificuldade dificuldade) {
        this.palavra = palavra;
        this.dica = dica;
        this.dificuldade = dificuldade;
        this.dataCadastro = LocalDate.now();
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Palavra outra = (Palavra) obj;
        return palavra != null && palavra.equalsIgnoreCase(outra.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavra == null ? null : palavra.toLowerCase());
    }

    @Override
    public String toString() {
        return palavra + " - " + dica;
    }
}