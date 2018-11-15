/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Objects;

/**
 *
 * @author Fufella
 */
public class Ital implements Comparable<Ital>{
    protected String név;                
    protected String kiszerelés;                                    //csomag láthatóságú
    protected int ár;     

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }
    
    @Override
    public String toString() {
        return  név+", " +kiszerelés+"dl, "+ár+" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ||!(obj instanceof Ital)) {
            return false;
        }
        
        Ital i=(Ital) obj;
        
        return this.név==i.getNév() && this.kiszerelés==i.getKiszerelés();
        
    }

    @Override
    public int compareTo(Ital t) {
        return Double.compare(this.getÁr(), t.getÁr());             //ha fordítva írom be csökkenőbe rendezi
    }
    
    
}
