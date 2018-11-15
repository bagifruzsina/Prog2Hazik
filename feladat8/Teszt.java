/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat8;

import java.util.ArrayList;

/**
 *
 * @author Fufella
 */
public class Teszt {
    public static void main(String[] args) {
        
        NewClass n=new NewClass(new ArrayList());
        n.add(5);
        n.add(12);
        n.add(6.6);
        n.add(8.8);
        n.add(18.4);
        n.add(200);
        n.add(79.8);
        n.add(200);
        
        System.out.println("Eredetileg a tartalom :");
        System.out.println(n);
        System.out.println("----------------");
        System.out.println("Melyik elem található meg az 5.helyen?");
        System.out.println(n.get(5));
        
        System.out.println("----------------");
        System.out.println("6.6 (3.elem - 2.index ) törlése után");
        n.delete(3);
        System.out.println(n);
        System.out.println("----------------");
        System.out.println("Tartalmazza -e a lista a 18.4-et?");
        if(n.contains(18.4)) System.out.println("A lista tartalmazza a 18.4-et");
        else System.out.println("A lista nem tartalmazza a 18.4-et");
        System.out.println("----------------");
        System.out.println("Hanyadik pozíción található meg legelőször a 200?");
        System.out.println(n.getFirstOccurrence(200));
        
        
    }
}
