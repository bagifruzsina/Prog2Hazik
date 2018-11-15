/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import java.util.Objects;

/**
 *
 * @author Fufella
 */
public class Autó implements Comparable<Autó>{
    
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    public static int darabszám=0;

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        darabszám++;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public void setTeljesítmény(int teljesítmény) {
        this.teljesítmény = teljesítmény;
    }

    public void setAutomata(boolean automata) {
        this.automata = automata;
    }
    
    

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", teljes\u00edtm\u00e9ny=" + teljesítmény + ", automata=" + automata + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null|| !(obj instanceof Autó)) {
            return false;
        }
        Autó a=(Autó) obj;
        return this.rendszám==a.getRendszám();
        
    }

    @Override
    public int compareTo(Autó t) {
        return (-1)*Integer.compare(this.teljesítmény, t.teljesítmény);
    }
    
    public boolean szabályos() {
       if(rendszám.length()!=6) {
           return false;
       }
       else{
        for(int i=0;i<3;i++) {
                if(!Character.isAlphabetic(rendszám.charAt(i))) {
                    return false;
                }
        }
        for(int i=3;i<6;i++) {
                if(!Character.isDigit(rendszám.charAt(i))) {
                    return false;
                }
         }

     }
       return true;
    }
}