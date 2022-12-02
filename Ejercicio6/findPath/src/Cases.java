import java.io.*;
import java.util.Random;

public class Cases {
    public static int nEdges(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public void matrix(int cases){
        try{
            String path = "prueba.txt";
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw  = new BufferedWriter(fw);
            for (int i=0; i < cases; i++){
                int value = (int)Math.floor(Math.random());
                bw.write(String.valueOf(value));
                if (i != cases -1){
                    bw.write("\n");
                }
            }
            bw.close();
        } catch (Exception e){
                e.printStackTrace();

        }
    }

    public int [][] fullArrayS (int arr[][]){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            archivo = new File("prueba.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int j = 0;
            while ((linea = br.readLine()) != null);
            arr[j][0] = Integer.parseInt(linea);
            arr[j][0] = Integer.parseInt(linea);
            j++;
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr){
                    fr.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return arr;
    }

}
