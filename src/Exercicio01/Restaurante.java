package Exercicio01;
import java.util.Scanner;

public class Restaurante {
    public static void main(String args[]) {


    Scanner sc = new Scanner(System.in);

    System.out.println("Conta: ");
    double conta = sc.nextDouble();
    double valorTotal = conta *1.1;
    System.out.printf("valor total: %.2f", valorTotal);

    }

}

