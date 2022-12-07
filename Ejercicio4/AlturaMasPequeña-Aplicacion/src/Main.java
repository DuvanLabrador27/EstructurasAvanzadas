/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *   Clase Principal de ejecucion del Aplicacion de Ordenamiento por Paridad     *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class Main {
    public static void main (String args[]){
        Solution s = new Solution();
        Prueba p = new Prueba();
        p.crearArchivo();
        p.generarPruebas();
        p.ejecutarPruebas();
    }
}
