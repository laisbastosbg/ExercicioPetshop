package Model;

public class Pet {

    private String nome;

    private String nomeTutor;

    private Boolean estaLimpo;

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

    public Boolean getEstaLimpo() {
        return estaLimpo;
    }

    public void setEstaLimpo(Boolean estaLimpo) {
        this.estaLimpo = estaLimpo;
    }
}
