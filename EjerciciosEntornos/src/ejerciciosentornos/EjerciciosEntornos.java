package ejerciciosentornos;

import java.util.Scanner;

public class EjerciciosEntornos {

    public static void main(String[] args) {
        
        
        System.out.println("Buenos Dias!!");
        int mayor = 0;
        int menor = 0;
        int mayorS = 0;
        int menorS = 0;
        System.out.println("Ingrese el numero de los municipios: ");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for(int cont = 0; cont<max; cont++) {
            Scanner sca = new Scanner(System.in);
            System.out.println("Pide la temperatura de el municipio");
            float temp = sca.nextFloat();
            
            
        if (temp < 0) {
            System.out.println("La temperatura esta en negativo");
            System.out.println("La temperatura mayor de los casos pedidos es" +temp);
            System.out.println("La temperatura menor de los casos pedidos es" +temp);
            
        } else {
            System.out.println("La temperatura esta en positivo");
            
        
 
 
        if (temp<mayor) {
                       temp = mayor;
        } else {
                temp = menor;
                }
        }
                   
        
        System.out.println("La temperatura mayor es"  +mayor  + "y la temperatura minima es " +menor);
        
        }
    }
}


