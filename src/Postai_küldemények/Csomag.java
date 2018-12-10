/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postai_küldemények;

/**
 *
 * @author Fufella
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Csomag implements Comparable<Csomag>{
    public int irányítószám;
    public int összérték;
    public List<Adatok> lista;

    public Csomag(int irszam, int ossz_ar, List<Adatok> lista) {
        this.irányítószám = irányítószám;
        this.összérték = összérték;
        this.lista = lista;
    }

    @Override
    public int compareTo(Csomag o) {
        return Integer.compare(this.irányítószám, o.irányítószám); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(irányítószám).append(": ").append(összérték).append(" Ft").append(System.getProperty("line.separator"));
        for(int i=0;i<lista.size();i++)
        {
            sb.append(lista.get(i));
            if(i!=lista.size()-1) sb.append(System.getProperty("line.separator"));
        }
        
        
        return sb.toString();
    }

   
    
    
}
