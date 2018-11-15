package boletin_11_1;
import java.util.Scanner;

public class Boletin_11_1{
    private static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){
        long inicio = System.currentTimeMillis();
        String frase = "A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica.";
        do{
            System.out.println("\nESCRIBE A SEGUINTE FRASE:\n" + frase);
        }while(!leer.nextLine().equals(frase));
        do{
            System.out.println("\nPREME ENTER PARA REMATAR");
        }while(!"".equals(leer.nextLine()));
        long fin = System.currentTimeMillis();
        System.out.println("\nTARDACHES " + (fin - inicio) + " milisegundos (" + (fin - inicio) / 1000 + " segundos)");
    }
}
