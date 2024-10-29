package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja exercicio?");
        System.out.println("Digite 1 - Ex1");
        System.out.println("Digite 2 - Ex2");
        System.out.println("Digite 3 - Ex3");
        System.out.println("Digite 4 - Ex4");
        System.out.println("Digite 5 - Ex5");
        System.out.println("Digite 6 - Ex6");
        int valueScan = scan.nextInt();

        switch (valueScan) {
            case 1:
                System.out.print("Digite o primeiro numero: ");
                int value1 = scan.nextInt();
                System.out.print("Digite o segundo numero: ");
                int value2 = scan.nextInt();
                int sum = value1 + value2;
                System.out.print("A Soma desses 2 numeros é: " + sum);
                break;

            case 2:
                var pi = 3.14159;
                var raio = scan.nextDouble();
                raio *= raio;
                double area = pi * Math.pow(raio, 2);
                System.out.println("Valor da área: " + area);
                //FORMULA ERRADA ARRUMAR DPS
                break;

            case 3:
                System.out.print("Digite o primeiro numero: ");
                int num1 = scan.nextInt();
                System.out.print("Digite o segundo numero: ");
                int num2 = scan.nextInt();
                System.out.print("Digite o terceiro numero: ");
                int num3 = scan.nextInt();
                System.out.print("Digite o quarto numero: ");
                int num4 = scan.nextInt();
                var dif = (num1 * num2) - (num3 * num4);
                System.out.print("Diferença: " + dif);
                break;

            case 4:
                System.out.println("Numero do funcionario: ");
                //CONTINUAR DEPOIS MTO CHATO ESSE EXERCICIOS

            default:
                System.out.print("Programa encerrado");
                break;
        }
    }
}