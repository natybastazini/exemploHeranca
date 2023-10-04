package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Carro extends Veiculos {
    boolean airbag = false;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarCarro(){
        System.out.println("//-------------------- Cadastro --------------------//");
        System.out.println("Informe a marca do Veiculo: ");
        super.marca = scanner.nextLine();
        System.out.println("Informe o modelo: ");
        super.modelo = scanner.nextLine();
        System.out.println("Informe se tem airbag [true ou false]");
        airbag = scanner.nextBoolean();
        System.out.println("//--------------------------------------------------//");

    }

}
