/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *   Clase Principal de ejecucion del Aplicacion by Marlon                       *
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
