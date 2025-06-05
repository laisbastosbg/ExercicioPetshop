package Model;

public class MaquinaDeLavagem {

    private int quantidadeAguaEmLitros;

    private int quantidadeShampooEmLitros;

    private Pet pet;

    private boolean precisaLimpeza;

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

    public boolean getPrecisaLimpeza() {
        return precisaLimpeza;
    }

    public void setPrecisaLimpeza(boolean precisaLimpeza) {
        this.precisaLimpeza = precisaLimpeza;
    }
}
