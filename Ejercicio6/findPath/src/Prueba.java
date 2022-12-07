/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * * * *        Clase de Creacion y ejecucion de pruebas aleatorias      * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Prueba {

    //Creacion de objeto de la clase Solucion
    Solution s = new Solution();

    //Creacion de objeto tipo Fichero de la clase File denominado "Pruebas.txt" 
    File Pruebas = new File("Pruebas.txt");

    //Creacion de objeto tipo Fichero de la clase File denominado "Resultados.txt" 
    File Resultado = new File("Resultados.txt");

    //Crear el archivo de  texto "Pruebas.txt", se debe trabajar usando excepciones -  try-catch
    public void crearArchivo() {
        try {
            System.out.println("Creando archivo de texto denominado 'Pruebas'...");

            if (Pruebas.createNewFile()) { //Creacion del archivo de texto  "Pruebas.txt"
                System.out.println("¡Archivo creado con exito!"); //Creacion del archivo por primera vez
            } else {
                System.out.println("El Archivo Pruebas.txt ya esta creado, revisa en el directorio principal"); // El archivo ya fue creado anteriormente
            }

        } catch (IOException Exception) {
            System.out.println("Error Grave en Ejecucion del Metodo");
        }
    }

    //Metodo que genera un numero aleatorio a traves de un rango (Maximo - Minimo)
    public static int generaNumeroAleatorio(int maximo, int minimo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num; //Retorna un numero entero aleatorio dentro del rango
    }
    
    public static int [][] edge (int a){
        int[][] result = null;
        
        if(a==1){
        int [][] matriz = {{1,0},{1,2},{0,3}};
        result = matriz;
       
}
        else if(a==2){
        int [][] matriz = {{0,1},{1,2}};
        result = matriz;
       
}
                if(a==3){
        int [][] matriz = {{0,1},{0,2},{0,3}};
        result = matriz;
       
}
        else if(a==4){
        int [][] matriz = {{0,1},{1,2},{2,3}};
        result = matriz;
       
}

                
      if(a==5){
        int [][] matriz = {{0,1},{1,2},{3,4},{1,0}};
        result = matriz;
       
}
        else if(a==6){
        int [][] matriz = {{0,1},{1,2},{1,3},{3,4}};
        result = matriz;
       
}
                if(a==7){
        int [][] matriz = {{0,1},{1,2},{1,3},{2,3},{4,5}};
        result = matriz;
       
}
        else if(a==8){
        int [][] matriz  = {{0,1},{1,4},{1,3},{3,4},{3,5}};
        result = matriz;
       
}
         return result;
    }
    
public static int  sizetree (int a){
        int result=0;
        
        if(a==1){
        int  matriz = 4;
        result = matriz;
       
}
        else if(a==2){
         int  matriz = 3;
        result = matriz;
       
}
        else if(a==3){
         int  matriz = 4;
        result = matriz;
       
}
        else if(a==4){
         int  matriz = 4;
        result = matriz;
       
}
              if(a==5){
        int  matriz = 5;
        result = matriz;
       
}
        else if(a==6){
         int  matriz = 5;
        result = matriz;
       
}
        else if(a==7){
         int  matriz = 6;
        result = matriz;
       
}
        else if(a==8){
         int  matriz = 6;
        result = matriz;
       
}
         return result;
    }

public static int []originDest (int a){
       int []originDest = new int [2]; ;
        
        if(a==1){
        int  matriz = 4;
        originDest[0] = (matriz-matriz)+2;
        originDest[1] = (matriz-1);
}
        else if(a==2){
         int  matriz = 3;
        originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
        else if(a==3){
         int  matriz = 4;
      originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
        else if(a==4){
         int  matriz = 4;
        originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
              if(a==5){
        int  matriz = 5;
        originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
        else if(a==6){
         int  matriz = 5;
        originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
        else if(a==7){
         int  matriz = 6;
        originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
        else if(a==8){
         int  matriz = 6;
        originDest[0] = (matriz-matriz)+1;
        originDest[1] = (matriz-1);
       
}
         return originDest;
    }
    //Metodo que genera, escribe  y almacena el conjunto de casos de pruebas en el archivo "Pruebas.txt"
    public void generarPruebas() {

        //Contadores de bucles  para cada una de las diferentes casos de prueba
        int pc = 1; //-> Primer Caso
        int sc = 1; //-> Segundo Caso

        try {

            // La Clase FileWriter permite la escritura de un archivo, se debe trabajar usando try-catch
            FileWriter escritura = new FileWriter(Pruebas);

            /* Primer Caso de Prueba - 20 pruebas de arreglos ordenados */
            while (pc <= 20) {

                int a = generaNumeroAleatorio(0,9);
             
               int [] ruta = originDest(a);
                    
                //Escribiendo sobre el archivo dicho caso de prueba en String con espaciado y aplicando salto de linea
                escritura.write("ID TEST" + pc + "//Test-" + a +"-Cantidad Nodos:" + sizetree(a) + "Arbol en Matriz:" + Arrays.deepToString(edge(a)) + " Origen: " + ruta[0] + " Destino: " + ruta[1]+  "\r\n");
                pc++; //Incrementa iterador hasta cumplir con 20 lineas de casos de pruebas
            }

            escritura.close();
        } catch (IOException Exception) {

        }

    }

    

    public void ejecutarPruebas() {

        //Creacion del archivo de texto  "Resultado.txt"
        try {
            System.out.println("Creando archivo de texto denominado 'Resultado'...");

            if (Resultado.createNewFile()) {
                System.out.println("¡Archivo creado con exito!"); //Creacion del archivo por primera vez
            } else {
                System.out.println("El Archivo Resultado.txt ya esta creado, revisa en el directorio principal");// El archivo ya fue creado anteriormente
            }

            //Clase FileReader, lectura de un archivo (para este caso, lectura del archibo de texto: "Pruebas.txt"
            FileReader lector = new FileReader(Pruebas);
            BufferedReader lectura = new BufferedReader(lector);

            //Se lee cada linea completa del archivo de pruebas, se almacena en casodeprueba
            String casodeprueba = lectura.readLine();

            //Contador que ayudara a iterar los 100 casos de pruebas
            int iterador = 1;

            //Escritura del Archibo "Resultados.txt"
            FileWriter escritura = new FileWriter(Resultado);

            //Mientras iterador, realiza en bucle 80 iteracciones de los casos de prueba
            while (iterador  <= 20) {

                //Leemos la cadena completa y convertimos la cadena en un arreglo de String arraynumerica [] separado por su espacio " " usando split()
                String[] arraynumerica = casodeprueba.split("-");
                
                //Creacion de un arreglo de enteros int [], donde almacenara por cada linea, sus numeros
                int[] nums = new int[arraynumerica.length];

                //Bucle for que iterra cada uno de los elementos del arreglo de String
               int test = Integer.parseInt(arraynumerica[1]);
                
                boolean result = s.validPath(sizetree(test), edge(test),(originDest(test)[0]),(originDest(test)[1]));
               
                
                //Escribe en el archivo de texto de resultados, la respuesta recibida y genera salto de linea
                escritura.write(result + "\r\n");
                casodeprueba = lectura.readLine();  //asigna el valor de casos de prueba, la siguiente linea del texto
                iterador++; //El iterador va incrementado!
            
            
        }
            System.out.println("Pruebas ejecutadas exitosamente, revisa el fichero Resultados.txt en SRC");
            escritura.close();
              }
            catch (IOException Exception) {

        }
  
    }
}

