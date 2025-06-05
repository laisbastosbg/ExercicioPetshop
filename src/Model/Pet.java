package Model;

public class Pet {

    private String nome;

    private String nomeTutor;

    private boolean estaLimpo;

    public Pet(String nome, String nomeTutor) {
        this.nome = nome;
        this.nomeTutor = nomeTutor;
        this.estaLimpo = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public boolean getEstaLimpo() {
        return estaLimpo;
    }

    public void setEstaLimpo(boolean estaLimpo) {
        this.estaLimpo = estaLimpo;
    }
}
