package Exercicio03;
import java.util.Scanner;

public class Zenaldo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Salario bruto");
        double amount = sc.nextDouble();

        System.out.println("Valor da prestação");
        double value = sc.nextDouble();

        double max = amount * 0.3;

        if (value >= max) {
            System.out.println("Desculpe mas não dá.");
        } else {
            System.out.println("Agora sim.");
        }
    }
}

