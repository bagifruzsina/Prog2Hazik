/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztálypénz;

/**
 *
 * @author Fufella
 */
public class Osztálypénz implements Comparable<Osztálypénz>{
    
    public String név;
    public int pénz;

    public Osztálypénz(String név, int pénz) {
        this.név = név;
        this.pénz = pénz;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPénz() {
        return pénz;
    }

    public void setPénz(int pénz) {
        this.pénz = pénz;
    }

    @Override
    public String toString() {
        return név + ";" + pénz;
    }
    
    

    @Override
    public int compareTo(Osztálypénz t) {
        if(Integer.compare(this.pénz, t.pénz)==0) {
            return this.név.compareTo(t.név);
        }
        return (-1)*Integer.compare(this.pénz, t.pénz);
        
    }
    
    
    
}
