/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KarácsonyiHozzávalók;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fufella                                                                              
 */
public class Teszt {
    
    public static void main(String[] args) {
        List<Hozzávalók>  lista= new ArrayList();                                      

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int uresalista=0,voltalistaban,i=0;                                                     
        
        while (sor.length() > 0) {                                                     
            String[] st = sor.split(";");                                              
            voltalistaban=0;                                                           
            if(uresalista==0){                                                         
                lista.add(new Hozzávalók(st[0], Integer.parseInt(st[1])));             
                uresalista++;
            }
            else {                                                                     
                   Hozzávalók h=new Hozzávalók(st[0], Integer.parseInt(st[1]));        
                    for(i=0;i<lista.size();i++){                                       
                       if(lista.get(i).getHozzávaló().compareTo(st[0])==0) {           
                           voltalistaban++;                                            
                           int mennyi=lista.get(i).mennyiség;                          
                           h.mennyiség+=mennyi;                                        
                           lista.set(i, h);                                            
                       }
                     }   
              uresalista++;                                                            
                   if(voltalistaban==0) {                                              
                       lista.add(h);
                   }
                }
            sor = sc.nextLine(); 
            }
        Collections.sort(lista);
        for (Hozzávalók x : lista) {
            System.out.println(x);
        }
            }

           

}
   
