package ejerciciosentornos;

import java.util.Scanner;

public class EjerciciosEntornos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura que hace");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("La temperatura esta en negativo");
        } else {
            System.out.println("La temperatura esta en positivo");
        }

    }

}
