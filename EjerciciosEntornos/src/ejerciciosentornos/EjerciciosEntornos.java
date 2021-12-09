package ejerciciosentornos;

import java.util.Scanner;

public class EjerciciosEntornos {

    public static void main(String[] args) {

        float mayor = -5000;
        float menor = 5000;
        Scanner sc = new Scanner(System.in);
        float temp;

        System.out.println("Buenos Dias!!");
        System.out.println("Ingrese el numero de los municipios: ");

        float max = sc.nextFloat();

        for (int cont = 0; cont < max; cont++) {

            System.out.println("Dime la temperatura del municipio");
            temp = sc.nextFloat();

            if (temp < 0) {
                System.out.println("La temperatura esta en negativo");

            } else {
                System.out.println("La temperatura esta en positivo");

            }
            
            if (temp > mayor) {
                mayor = temp;
            }
            
            if (temp < menor) {
                menor = temp;
            }
        }

        System.out.println("La temperatura mayor es " + mayor + " y la temperatura minima es " + menor);

    }
}

