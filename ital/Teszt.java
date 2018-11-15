/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Locale;

/**
 *
 * @author Fufella
 */
public class Teszt {
    
    public static void main(String[] args) {
       
        Ital [] ital=new Ital [] {
                new Ital("almalé","0.25l",249),
                new Ital("tea","0.5l",399),
                new Ital("baracklé","0.3l",299),
                new SzeszesItal("sör", "0.33l", 499, 4.5),
                new SzeszesItal("pálinka", "0.2l", 1299, 48.9),
                new SzeszesItal("bor", "0.5l", 599, 16.5),
                new SzeszesItal("tátratea", "0.5l", 4999, 71.1),
                new SzeszesItal("whiskey", "1l", 1399, 30.0),
                new SzeszesItal("kacsa", "0.02l", 499, 20.0)
            
        };
        
        
        SzeszesItal [] t=Dolgozat.metódus(ital);
        for (SzeszesItal a : t) {
            System.out.println(a);    
        }
    }
   
}
    

