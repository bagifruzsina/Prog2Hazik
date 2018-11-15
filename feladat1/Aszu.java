/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author Fufella
 */
public class Aszu extends Bor {
    
    private int puttonySzam;

    public Aszu(int puttonySzam, String termoTerulet, double alkoholTartalom) {
        super(null,termoTerulet, null,alkoholTartalom);                                                   //kéri az ősosztály minden attribútumát, String:null, boolean:false, int:
        this.puttonySzam=puttonySzam;
    }
    
    public int hanyPuttonyos(){
        return puttonySzam;
    }

    public int getPuttonySzam() {
        return puttonySzam;
    }

    public void setPuttonySzam(int puttonySzam) {
        this.puttonySzam = puttonySzam;
    }
    
    

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }
    
    
    
    
}
