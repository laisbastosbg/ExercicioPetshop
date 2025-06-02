package Model;

public class MaquinaDeLavagem {

    public static final int CAPACIDADE_MAXIMA_DE_AGUA_EM_LITROS = 30;

    public static final int CAPACIDADE_MAXIMA_DE_SHAMPOO_EM_LITROS = 10;

    public static final int ABASTECIMENTO_DE_AGUA = 2;

    public static final int ABASTECIMENTO_DE_SHAMPOO = 2;

    public static final int CONSUMO_DE_AGUA_BANHO = 10;

    public static final int CONSUMO_DE_SHAMPOO_BANHO = 2;

    public static final int CONSUMO_DE_AGUA_LIMPEZA = 3;

    public static final int CONSUMO_DE_SHAMPOO_LIMPEZA= 1;

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

    public int getQuantidadeShampooEmLitros() {
        return quantidadeShampooEmLitros;
    }

    public Pet getPet() {
        return pet;
    }

    public void botarPetNaMaquina(Pet pet) {
        if(pet != null && !pet.getNome().isEmpty()) {
            this.pet = pet;
        }
    }

    public void tirarPetDaMaquina() {
        if (!this.pet.getEstaLimpo()) {
            this.pet = null;
            this.precisaLimpeza = true;
        } else {
            this.pet = null;
        }
    }

    public int abastecerTanqueDeAgua () {

        if (this.quantidadeAguaEmLitros + ABASTECIMENTO_DE_AGUA > CAPACIDADE_MAXIMA_DE_AGUA_EM_LITROS) {
            this.quantidadeAguaEmLitros = CAPACIDADE_MAXIMA_DE_AGUA_EM_LITROS;
        } else {
            this.quantidadeAguaEmLitros += ABASTECIMENTO_DE_AGUA;
        }

        return this.quantidadeAguaEmLitros;
    }

    public int abastecerTanqueDeShampoo() {

        if (this.quantidadeShampooEmLitros + ABASTECIMENTO_DE_SHAMPOO > CAPACIDADE_MAXIMA_DE_SHAMPOO_EM_LITROS) {
            this.quantidadeShampooEmLitros = CAPACIDADE_MAXIMA_DE_SHAMPOO_EM_LITROS;
        } else {
            this.quantidadeShampooEmLitros += ABASTECIMENTO_DE_SHAMPOO;
        }

        return this.quantidadeShampooEmLitros;
    }

    public void darBanho() {

        if (this.quantidadeAguaEmLitros < CONSUMO_DE_AGUA_BANHO) {
            System.out.println("Água insuficiente, abasteça o tanque.");
        } else if (this.quantidadeShampooEmLitros < CONSUMO_DE_SHAMPOO_BANHO) {
            System.out.println("Shampoo insuficiente, abasteça o tanque.");
        } else if (pet == null) {
            System.out.println("Coloque o pet na máquina.");
        } else {
            this.quantidadeAguaEmLitros -= CONSUMO_DE_AGUA_BANHO;
            this.quantidadeShampooEmLitros -= CONSUMO_DE_SHAMPOO_BANHO;
            this.pet.setEstaLimpo(true);

            System.out.printf("Banho em %s finalizado.\n", pet.getNome());
            System.out.printf("Tanque de água: %d\n", this.quantidadeAguaEmLitros);
            System.out.printf("Tanque de Shampoo: %d\n", this.quantidadeShampooEmLitros);
        }
    }

    public void limpar() {
        if (this.quantidadeAguaEmLitros < CONSUMO_DE_AGUA_LIMPEZA) {
            System.out.println("Água insuficiente, abasteça o tanque.");
        } else if (this.quantidadeShampooEmLitros < CONSUMO_DE_SHAMPOO_LIMPEZA) {
            System.out.println("Shampoo insuficiente, abasteça o tanque.");
        }else {
            this.quantidadeAguaEmLitros -= CONSUMO_DE_AGUA_LIMPEZA;
            this.quantidadeShampooEmLitros -= CONSUMO_DE_SHAMPOO_LIMPEZA;
            System.out.println("Limpeza completa.");
            System.out.printf("Tanque de água: %d\n", this.quantidadeAguaEmLitros);
            System.out.printf("Tanque de Shampoo: %d\n", this.quantidadeShampooEmLitros);
        }

    }
}
