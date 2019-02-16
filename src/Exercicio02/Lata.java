package Exercicio02;
import java.util.Scanner;

public class Lata {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double PI = Math.PI;

    System.out.println("Qual o raio? ");
    double radius = sc.nextDouble();

    System.out.println("Qual a altura? ");
    double height = sc.nextDouble();

    double result = height * Math.pow(radius, 2) * PI;
    System.out.printf("O resultado é, %.4f", result);
    }


}
