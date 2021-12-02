package ejerciciosentornos;

import java.util.Scanner;

public class EjerciciosEntornos {

    public static void main(String[] args) {
        
        
        System.out.println("Buenos Dias!!");
        
        System.out.println("Ingrese el numero de los municipios: ");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for(int cont = 0; cont<max; cont++) {
            Scanner sca = new Scanner(System.in);
            System.out.println("Pide la temperatura de el municipio");
            float temp = sca.nextFloat();
            
            
                   if (temp < 0) {
            System.out.println("La temperatura esta en negativo");
        } else {
            System.out.println("La temperatura esta en positivo");
        }
        }
        
        
        
    }

}
