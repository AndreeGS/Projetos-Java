package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, x, maior, contador;

        System.out.print("Quantos valores você quer inserir? ");
        N = sc.nextInt();

        
        if (N <= 0) {
            System.out.println("O número de valores deve ser maior que zero.");
        } else {
            System.out.print("Insira o primeiro valor: ");
            maior = sc.nextInt();
            contador = 1;

            while (contador < N) {
                System.out.print("Insira o próximo valor: ");
                x = sc.nextInt();

                if (x > maior) {
                    maior = x;
                }

                contador += 1;
            }

            System.out.println("O maior valor é: " + maior);
        }

        sc.close();
    }
}
