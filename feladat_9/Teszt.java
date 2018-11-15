/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Fufella
 */
public class Teszt {
    public static List<feladat_9.Hátizsák> kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<feladat_9.Hátizsák> l) {
      
     
        Collections.sort(l);
        
        return l;
    }
    
        public static void main(String[] args) {
        
        List<feladat_9.Hátizsák> h=new ArrayList();
        
        h.add(new feladat_9.Hátizsák("Adidas",20,6,true));
        h.add(new feladat_9.Hátizsák("Nike",15,8,true));
        h.add(new feladat_9.Hátizsák("Puma",19,5,false));
        h.add(new feladat_9.Hátizsák("Budmil",25,4,true));
        h.add(new feladat_9.Hátizsák("Decathlon",18,8,false));
        h.add(new feladat_9.Hátizsák("Hervis",20,200,true));
        h.add(new feladat_9.Hátizsák("Hervis",20,105,true));
       
        List<feladat_9.Hátizsák> k=kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(h);
        
        for (feladat_9.Hátizsák k1 : k) {
            System.out.println(k1);
        }
    
    }
    
}
