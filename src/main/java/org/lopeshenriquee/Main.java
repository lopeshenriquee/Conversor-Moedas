package org.lopeshenriquee;

import org.lopeshenriquee.controller.Coin;
import org.lopeshenriquee.controller.CoinConsult;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Main.init();
    }

    public static void init() {
        System.out.println("\nSeja Bem vindo(a) ao Conversor de Moeda");
        System.out.println("Digite a moeda para ser convertida (ex: ):");
        String baseCurrency = scan.nextLine().toUpperCase();

        System.out.println("Digite a moeda alvo (ex: BRL, USD):");
        String targetCurrency = scan.nextLine().toUpperCase();

        CoinConsult coinConsult = new CoinConsult();
        Coin coin = coinConsult.getCoin(baseCurrency, targetCurrency);

        System.out.println("Conversão atual: 1 "+ baseCurrency +" = " + coin.value() + " "+ targetCurrency);
        System.out.print("Digite o valor que deseja converter: ");
        double valueCoin = scan.nextDouble();

        double valueConvert = valueCoin * coin.value();
        System.out.println(valueCoin + " " + baseCurrency + " = " + valueConvert + " " + targetCurrency);

        System.out.println("\nDeseja realizar outra conversão? (s/n)");
        String response = scan.next();
        if (response.equalsIgnoreCase("s")) {
            init();
        } else {
            System.out.println("Encerrando o programa...");
            System.exit(0);
        }
    }
}