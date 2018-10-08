
import java.util.Random;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Consecutive {
    public static void main(String[] args) {
        int[] anArray = {1,2,3,3,3};

        for(int i=0;i<anArray.length;i++) {

            System.out.println(anArray[i] + " ");
        }
        
        System.out.println(isConsecutiveFour(anArray));

    }
 
     static void printArray(int[] a) 
    {         
        for (int i = 0; i < a.length; i++) 
        {             
            System.out.print(a[i] + " ");         
        }         
        
        System.out.println();     
    } 
    
    public static boolean isConsecutiveFour(int[] values) {
        int flag=0;
        int i;
        if (values.length>=4){
        for(i=0;i<values.length-3;i++) {
            
            if(values[i]==values[i+1])
            {
                if(values[i]==values[i+2]) 
                {
                    if(values[i]==values[i+3]) {
                        return true;
                    }
                }
            } 

        }}
        return false;


    
}
}

    
    

