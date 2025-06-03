package Model;

public class MaquinaDeLavagem {


    private int quantidadeAguaEmLitros;

    private int quantidadeShampooEmLitros;

    private Pet pet;

    private Boolean precisaLimpeza;

    public MaquinaDeLavagem() {
        this.quantidadeAguaEmLitros = 0;
        this.quantidadeShampooEmLitros = 0;
        this.pet = null;
        this.precisaLimpeza = false;
    }

    public int getQuantidadeAguaEmLitros() {
        return quantidadeAguaEmLitros;
    }

    public void setQuantidadeAguaEmLitros(int quantidade) {
        this.quantidadeAguaEmLitros = quantidade;
    }

    public int getQuantidadeShampooEmLitros() {
        return quantidadeShampooEmLitros;
    }

    public void setQuantidadeShampooEmLitros(int quantidade) {
        this.quantidadeShampooEmLitros = quantidade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Boolean getPrecisaLimpeza() {
        return precisaLimpeza;
    }

    public void setPrecisaLimpeza(Boolean precisaLimpeza) {
        this.precisaLimpeza = precisaLimpeza;
    }
}
