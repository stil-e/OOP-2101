

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Arraysortreverse {
     public static void main(String[] args) {
         //initial array of pallet IDs
         String[] pallets = {"B14", "A11", "B12", "A13"};
         //sort the array in ascending order
         System.out.println("sorted...");
         Arrays.sort(pallets);
         for (String pallet : pallets) {
             System.out.println("--" + pallet);
         }
         //Reverse the sorted array
         System.out.println("\nReversed ....");
         List<String> palletlist = Arrays.asList(pallets);
         Collections.reverse(palletlist);
         {
             for (String pallet : palletlist) {

                 System.out.println("--" + pallet);
             }

         }

     }}