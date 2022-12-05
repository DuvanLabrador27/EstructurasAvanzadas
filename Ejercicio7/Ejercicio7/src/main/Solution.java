/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author JDBM
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
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
        return resultado;
    }
}

