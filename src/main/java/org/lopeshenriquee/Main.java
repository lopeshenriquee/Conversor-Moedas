package org.lopeshenriquee;

import jdk.jshell.execution.Util;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main.init();

    }

    public static void init() {
        Scanner scan = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("Seja Bem vindo(a) ao Conversor de Moeda");
        System.out.println("Escolha uma Opção: ");
        System.out.println("1) Dólar ==> Real");
        System.out.println("2) Dólar ==> Euro");
        System.out.println("3) Dólar ==> Yen");
        System.out.println("4) Real ==> Dólar");
        System.out.println("5) Real ==> Euro");
        System.out.println("6) Real ==> Yen> ");
        System.out.println("0) Sair");
        int i = scan.nextInt();

        switch (i) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                break;
            case 6:
                System.out.println("");
                break;
            case 0:
                System.out.println("Encerrando sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Digite um número válido");
                Main.init();
                break;
        }
    }
}