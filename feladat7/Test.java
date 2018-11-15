/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Fufella
 */
public class Test {
    
    public static List<Lakóház> tágasLakóházak(List<Lakóház> l, double térfogat) {            //ez a metódus a második paraméterként megadott térfogatnál nagyobb térfogatú lakóházak listáját adja vissza
        List<Lakóház> h=new ArrayList();
        for(int i=0;i<l.size();i++) {
            if(l.get(i) instanceof Lakóház) {
                if(l.get(i).légköbméter()>térfogat) {
                    h.add(l.get(i));
                }                                                                       
             }
     }
        return h;
    }
    
    public static void main(String[] args) {
        
        List<Lakóház> l=new ArrayList(); 
         
        l.add(new Lakóház("Alma utca",5,70));
        l.add(new Lakóház("Körte utca",4,54));
        l.add(new Lakóház("Pék utca",10,50));
        l.add(new Lakóház("Kurta utca",8,75));
        l.add(new Lakóház("Kis utca",5,70));
        l.add(new Lakóház("Nagy utca",4,80));
        l.add(new Lakóház("Acsádi út",8,88));
        l.add(new Lakóház("Kassai út",7,88));
        l.add(new Lakóház("Ábel utca",9,62));
        l.add(new Lakóház("Éva utca",10,49));
        

        for (Lakóház a : l) {
            System.out.println(a);
        }
        
        System.out.println("_______");
        List<Lakóház> uj=tágasLakóházak(l,1700);
        for (Lakóház a : uj) {
            System.out.println(a);
        }
        
        

    }
    
}
