/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zárthelyi_eredmények;

/**
 *
 * @author Fufella
 */
public class Zárthelyi implements Comparable<Zárthelyi>{
    
    public String név;
    public int pont;

    public Zárthelyi(String név, int pont) {
        this.név = név;
        this.pont = pont;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return név + ": " + pont + " pont";
    }
    
    
    
    @Override
    public int compareTo(Zárthelyi t) {
        if(Integer.compare(this.pont, t.pont)==0) {
            return this.név.compareTo(t.név);
        }
        return (-1)*Integer.compare(this.pont, t.pont);
    }
    
    
    
}
