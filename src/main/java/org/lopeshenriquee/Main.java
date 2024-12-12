package org.lopeshenriquee;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("Seja Bem vindo(a) ao Conversor de Moeda");
        System.out.println("Escolha uma Opção: ");
        int i = scan.nextInt();
        switch (i) {
            case 1:
                System.out.println("1) Dólar ==> Real");
                break;
            case 2:
                System.out.println("2) Dólar ==> Euro");
                break;
            case 3:
                System.out.println("3) Dólar ==> Yen");
                break;
            case 4:
                System.out.println("4) Real ==> Dólar");
                break;
            case 5:
                System.out.println("5) Real ==> Euro");
                break;
            case 6:
                System.out.println("6) Real ==> Yen> ");
                break;
            default:
                System.out.println("Digite um número válido");
        }
    }
}