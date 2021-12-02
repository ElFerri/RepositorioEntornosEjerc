package ejerciciosentornos;

import java.util.Scanner;

public class EjerciciosEntornos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float max = sc.nextFloat();
        System.out.println("Buenos Dias!!");
        

        for(int cont = 0; cont<max; cont++) {
            
            System.out.println("Pide la temperatura de el municipio");
            float temp = sc.nextFloat();
            
            
                   if (temp < 0) {
            System.out.println("La temperatura esta en negativo");
        } else {
            System.out.println("La temperatura esta en positivo");
        }
        }
        
        
        
    }

}
