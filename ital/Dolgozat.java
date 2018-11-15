/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Arrays;

/**
 *
 * @author Fufella
 */
public class Dolgozat extends SzeszesItal{

    public Dolgozat(String név, String kiszerelés, int ár, int alkoholtartalom) {
        super(név, kiszerelés, ár, alkoholtartalom);
    }
    
    public static SzeszesItal[] metódus(Ital [] t){
        
        SzeszesItal[] tomb=new SzeszesItal[3];
        int count=0;

        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal k=(SzeszesItal) t[i];
                  count++;
            }
        }
        
        SzeszesItal [] atmeneti=new SzeszesItal [count];
        int index=0;
        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal k=(SzeszesItal) t[i];
                  atmeneti[index]=k;
                  index++;
            }
        }

        
        for(int i=0;i<atmeneti.length-1;i++) {
            for(int j=i+1;j<atmeneti.length;j++) {
               if(atmeneti[i].getAlkoholTartalom()<atmeneti[j].getAlkoholTartalom()) {
                    SzeszesItal tmp=atmeneti[i];
                    atmeneti[i]=atmeneti[j];
                    atmeneti[j]=tmp;
               }
            }
        }
       //ha a tömbben nincsen 3 szeszesital akkor null-t dobjon ki, ha van, akkor adja vissza a tömböket.
        
        if(count<3) {
            return null;
        }
        else{
        tomb[0]=atmeneti[0];
        tomb[1]=atmeneti[1];
        tomb[2]=atmeneti[2];
       
        return tomb;
        }
        
    }
}
