/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUAN D BM
 */
public class Competencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese casos de prueba");
        int casos = sc.nextInt();
        int length =0;
        HashMap<Integer, Integer> map = new HashMap();
        int[] arr ;
        Random random = new Random();
        while(casos>0){
            System.out.println("ingrese longitud de array");
            length = random.nextInt(20);
            arr = new int[length];
            for (int i = 0; i < length; i++) {
               int n = random.nextInt(1000);
               if(map.get(n)==null){
                  map.put(n, n); 
                   System.out.println("indice= "+i+", dato= "+n);
                  arr[i]=n;
               }else{
                  i--;
               }
            }
            findRelativeRanks(arr);
            casos--;
        }
    }
    
    public static String[] findRelativeRanks(int[] nums) {
        if (nums == null) {
   
         return null;
        }
        String[] resultado = new String[nums.length];
        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
            index.put(nums[i], i);
        }
        Arrays.sort(nums);
        String[] puestos = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = nums.length - 1; i >= 0; i --) {
            int rank = nums.length - 1 - i;
            if (rank < 3) {
                resultado[index.get(nums[i])] = puestos[rank];
            }
            else {
                resultado[index.get(nums[i])] = "" + (rank + 1);
            }
        }
        
        try {
            generaArchivo(resultado,System.getProperty("user.dir")+"\\prueba.txt");
        } catch (IOException ex) {
            Logger.getLogger(Competencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
        
    }
    
    public static void generaArchivo(String arr[], String rutaFinal) throws IOException {
        if (arr.length > 0) {
            //Creacion de archivo Xlsx.
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rutaFinal), StandardCharsets.ISO_8859_1))) {
                    
                for (int i = 0; i < arr.length; i++) {
                    writer.newLine();
                    writer.write(arr[i]);
                 }
                }
                System.out.println("Archivo generado con exito");
        } else {
            System.out.println("Error al generar archivo por falta de datos");
        }
    }
}
