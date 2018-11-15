/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Random;

/**
 *
 * @author Fufella
 */
public class Hallgató {
    
   public int mennyitKészült;
   public boolean sokatTanul;

    public Hallgató(int mennyitKészült, boolean sokatTanul) {
        this.mennyitKészült = mennyitKészült;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKészült() {
        return mennyitKészült;
    }

    public void setMennyitKészült(int mennyitKészült) {
        this.mennyitKészült = mennyitKészült;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }
    
    
   
   public Dolgozat dolgozatotIr(){
       Random r=new Random();
       int szam;
       
       if(sokatTanul==true) {
           szam=(r.nextInt()%((7-4)+1)+4)*mennyitKészült;
           
       }
       else {
           szam=(r.nextInt()%((5-0)+1)+0)*mennyitKészült;
           
            }
       
       Dolgozat vissza=new Dolgozat(szam);
       
       if(vissza.pontszam==-1) {
           System.out.println("Nem írt");
       }
       System.out.println(szam);
       return vissza;
       
   }
    
}
