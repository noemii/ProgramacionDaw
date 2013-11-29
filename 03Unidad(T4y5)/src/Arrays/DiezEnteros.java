package Arrays;

import java.util.Arrays;

public class DiezEnteros {

        public static void main(String[] args) {
                int[] enteros;
        
                enteros=new int[20];        
                
                for(int i=0;i<20;i++)
                        enteros[i]=i;

                for(int i=0;i<20;i++)
                        System.out.print(enteros[i]);
                
                System.out.println();
                System.out.print(Arrays.toString(enteros));
        }
}