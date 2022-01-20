package ejerciciosentornos;


import java.util.Scanner;

/**
 * Clase temperatura para gestionar temperatura de los municipios
 *
 * @author 
 */
public class EjerciciosEntornos{

    /**
     * 
     */
    /**
     * Metodo myMethod para escribir frases y introduzirlas en un lugar querido.
     * @param x Simboliza un numero que podra ser escrito por el usuario
     * @return 
     */
    
    public static int myMethod(int x) {
        return 5 + x;
        
    }

    /**
     * Método main
     *
     * @param args Argumentos de linia de comandos
     */

    public static void main(String[] args) {
        System.out.println(myMethod(3));
        //Variable que nos va a guardar las temperaturas introducidas.
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        
        int[] municipios;
        double[] temperaturas;

        Scanner sc = new Scanner(System.in);
        float temp;
        

        System.out.println("Buenos Dias!!");
        System.out.println("Ingrese el numero de los municipios: ");

        int max = sc.nextInt();

        temperaturas = new double[max];
        municipios = new int[max];

        for (int cont = 0; cont < max; cont++) {

            System.out.println("Dime la temperatura del municipio");
            temp = sc.nextFloat();
            temperaturas[cont] = temp;

            for(cont = 0; cont < max; cont++) {
                System.out.println("Dime como se llaman los municipios por orden puesto de la temperatura indicada");
                int muni;
                muni = sc.nextInt();
            municipios[cont] = muni;
            }
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

        System.out.println("Las temperaturas han sido guardadas y son las siguientes");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);

        }
        System.out.println("Los municipios son los siguientes");
        for (int y = 0; y < municipios.length; y++) {
            System.out.println(municipios[y]);
        }
    }
}
