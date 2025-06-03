package Controller;

import Model.MaquinaDeLavagem;
import Model.Pet;

public class BanhoController {
    public static final int CAPACIDADE_MAXIMA_DE_AGUA_EM_LITROS = 30;

    public static final int CAPACIDADE_MAXIMA_DE_SHAMPOO_EM_LITROS = 10;

    public static final int ABASTECIMENTO_DE_AGUA = 2;

    public static final int ABASTECIMENTO_DE_SHAMPOO = 2;

    public static final int CONSUMO_DE_AGUA_BANHO = 10;

    public static final int CONSUMO_DE_SHAMPOO_BANHO = 2;

    public static final int CONSUMO_DE_AGUA_LIMPEZA = 3;

    public static final int CONSUMO_DE_SHAMPOO_LIMPEZA= 1;

    public MaquinaDeLavagem maquina;

    public void botarPetNaMaquina(Pet pet) {
        if (this.maquina.getPet() == null) {
            if(pet != null && !pet.getNome().isEmpty()) {
                this.maquina.setPet(pet);
            } else {
                System.out.println("Erro. Tente novamente.");
            }
        } else {
            System.out.println("Apenas um pet por vez");
        }
    }

    public void tirarPetDaMaquina() {
        if (this.maquina.getPet()!= null) {
            if (!this.maquina.getPet().getEstaLimpo()) {
                this.maquina.setPet(null);
                this.maquina.setPrecisaLimpeza(true);
                System.out.println("Pet retirado. Realizar limpeza da máquina.");
            } else {
                this.maquina.setPet(null);
                System.out.println("Pet retirado.");
            }
        } else {
            System.out.println("Não há pets na máquina");
        }
    }

    public void verificarSeHaPetNaMaquina() {
        if (this.maquina.getPet() != null) {
            System.out.println("Pet na máquina.");
        } else {
            System.out.println("Não há pets na máquina");
        }
    }

    public void abastecerTanqueDeAgua () {

        if (this.maquina.getQuantidadeAguaEmLitros() + ABASTECIMENTO_DE_AGUA > CAPACIDADE_MAXIMA_DE_AGUA_EM_LITROS) {
            this.maquina.setQuantidadeAguaEmLitros(CAPACIDADE_MAXIMA_DE_AGUA_EM_LITROS);
        } else {
            this.maquina.setQuantidadeAguaEmLitros(this.maquina.getQuantidadeAguaEmLitros() + ABASTECIMENTO_DE_AGUA);
        }

        System.out.printf("Abastecimento realizado. %d de água no tanque.\n", this.maquina.getQuantidadeAguaEmLitros());
    }

    public void abastecerTanqueDeShampoo() {

        if (this.maquina.getQuantidadeShampooEmLitros() + ABASTECIMENTO_DE_SHAMPOO > CAPACIDADE_MAXIMA_DE_SHAMPOO_EM_LITROS) {
            this.maquina.setQuantidadeShampooEmLitros(CAPACIDADE_MAXIMA_DE_SHAMPOO_EM_LITROS);
        } else {
            this.maquina.setQuantidadeShampooEmLitros(this.maquina.getQuantidadeShampooEmLitros() + ABASTECIMENTO_DE_SHAMPOO);
        }

        System.out.printf("Abastecimento realizado. %d de shampoo no tanque.\n", this.maquina.getQuantidadeShampooEmLitros());
    }

    public void darBanho() {

        if (this.maquina.getPrecisaLimpeza()) {
            System.out.println("Operação cancelada. Realize limpeza da máquina.");
        } else {
            if (this.maquina.getQuantidadeAguaEmLitros() < CONSUMO_DE_AGUA_BANHO) {
                System.out.println("Água insuficiente, abasteça o tanque.");
            } else if (this.maquina.getQuantidadeShampooEmLitros() < CONSUMO_DE_SHAMPOO_BANHO) {
                System.out.println("Shampoo insuficiente, abasteça o tanque.");
            } else if (this.maquina.getPet() == null) {
                System.out.println("Coloque o pet na máquina.");
            } else {
                this.maquina.setQuantidadeAguaEmLitros(this.maquina.getQuantidadeAguaEmLitros() - CONSUMO_DE_AGUA_BANHO);
                this.maquina.setQuantidadeShampooEmLitros(this.maquina.getQuantidadeShampooEmLitros() - CONSUMO_DE_SHAMPOO_BANHO);
                this.maquina.getPet().setEstaLimpo(true);

                System.out.printf("Banho em %s finalizado.\n", this.maquina.getPet().getNome());
                System.out.printf("Tanque de água: %d\n", this.maquina.getQuantidadeAguaEmLitros());
                System.out.printf("Tanque de Shampoo: %d\n", this.maquina.getQuantidadeShampooEmLitros());
            }
        }
    }

    public void limpar() {
        if (this.maquina.getQuantidadeAguaEmLitros() < CONSUMO_DE_AGUA_LIMPEZA) {
            System.out.println("Água insuficiente, abasteça o tanque.");
        } else if (this.maquina.getQuantidadeShampooEmLitros() < CONSUMO_DE_SHAMPOO_LIMPEZA) {
            System.out.println("Shampoo insuficiente, abasteça o tanque.");
        }else {
            this.maquina.setQuantidadeAguaEmLitros(this.maquina.getQuantidadeAguaEmLitros() - CONSUMO_DE_AGUA_LIMPEZA);
            this.maquina.setQuantidadeShampooEmLitros(this.maquina.getQuantidadeShampooEmLitros() - CONSUMO_DE_SHAMPOO_LIMPEZA);
            System.out.println("Limpeza completa.");
            System.out.printf("Tanque de água: %d\n", this.maquina.getQuantidadeAguaEmLitros());
            System.out.printf("Tanque de Shampoo: %d\n", this.maquina.getQuantidadeShampooEmLitros());
        }

    }
}
