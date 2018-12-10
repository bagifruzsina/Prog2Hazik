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
class Adatok implements Comparable<Adatok>{
    public String név;
    public String település;
    public String utca;
    public int házszám;
    public int csomiérték;

    public Adatok(String nev, String telepules, String utca, int hazszam, int csomag_erteke) {
        this.név = név;
        this.település = település;
        this.utca = utca;
        this.házszám = házszám;
        this.csomiérték = csomiérték;
    }

    @Override
    public String toString() {
        return település+", "+utca+" "+házszám+"., "+név+", "+csomiérték+" Ft";
    }

    @Override
    public int compareTo(Adatok o) {
        int tmp= this.település.compareTo(o.település);
        if(tmp!=0) return tmp;
        
        tmp=this.utca.compareTo(o.utca);
        if(tmp!=0) return tmp;
        
        tmp=Integer.compare(this.házszám, o.házszám);
        if(tmp!=0) return tmp;
        
        tmp=this.név.compareTo(o.név);
        if(tmp!=0) return tmp;
        
        return Integer.compare(o.csomiérték, this.csomiérték);
    }
    
    
    
    
}