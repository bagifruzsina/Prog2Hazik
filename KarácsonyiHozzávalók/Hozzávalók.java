/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KarácsonyiHozzávalók;

/**
 *
 * @author Fufella
 */
public class Hozzávalók implements Comparable<Hozzávalók>{
    
    public String hozzávaló;
    public int mennyiség;

    public Hozzávalók(String hozzávaló, int mennyiség) {
        this.hozzávaló = hozzávaló;
        this.mennyiség = mennyiség;
    }

    public String getHozzávaló() {
        return hozzávaló;
    }

    public void setHozzávaló(String hozzávaló) {
        this.hozzávaló = hozzávaló;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    @Override
    public String toString() {
        return hozzávaló + ";" + mennyiség;
    }

    @Override
    public int compareTo(Hozzávalók t) {
        if(this.hozzávaló.equals(t.hozzávaló)) {
            return (-1)*Integer.compare(this.mennyiség,t.mennyiség);
        }
        return this.hozzávaló.compareTo(t.hozzávaló);
    }
    
    
    
    
    
}
