import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int pruebas;
        try {
            pruebas = 0;
            int j = 0;
            int numDatos = 0;
            if (args.length > 0) {
                pruebas = Integer.parseInt(args[0]);
            }

     else{
            Scanner sc = new Scanner(System.in);
            System.out.println("cantidad de casos: ");
            pruebas = sc.nextInt();
        }
        while (j < pruebas) {
            if (args.length == 2) {
                numDatos = Integer.parseInt(args[1]);
            } else numDatos = (int) Math.floor(Math.random());
            Cases cs = new Cases();
            int arr[][];
            arr = new int [numDatos][2];
            cs.matrix(numDatos);
            System.out.println("Prueba "+(j + 1));
            System.out.println();
            j++;
        }
    }catch (Exception e){
            System.out.println(e + "mal");
        }
    }
}