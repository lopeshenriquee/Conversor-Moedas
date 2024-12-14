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
        String baseCurrency = validateCoin("Digite a moeda para ser convertida: ");
        String targetCurrency = validateCoin("Digite a moeda alvo: ");

        convertCurrency(baseCurrency, targetCurrency);

    }
    public static void convertCurrency(String baseCurrency, String targetCurrency){
        CoinConsult coinConsult = new CoinConsult();
        Coin coin;

        while(true){
            try {
                coin = coinConsult.getCoin(baseCurrency, targetCurrency);
                break;
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
                baseCurrency = validateCoin("Digite a moeda para ser convertida: ");
                targetCurrency = validateCoin("Digite a moeda alvo: ");
            }
        }

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

    public static String validateCoin(String message){
        String currency;
        while(true) {
            System.out.println(message);
            currency = scan.next().toUpperCase();

            if (currency.matches("^[A-Z]{3}$")) {
                break;
            } else {
                System.out.println("Moeda inválida! Tente novamente (ex: USD, BRL)");
            }
        }
        return currency;
    }
}