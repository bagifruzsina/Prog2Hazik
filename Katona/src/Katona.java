/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Katona {
    
    private int támadóerő;
    private int védőerő;
    
     public Katona(int támadóerő, int védőerő) {
        this.támadóerő = támadóerő;
        this.védőerő = védőerő;
    }

    public int getTámadóerő() {
        return támadóerő;
    }

    public void setTámadóerő(int támadóerő) {
        this.támadóerő = támadóerő;
    }

    public int getVédőerő() {
        return védőerő;
    }

    public void setVédőerő(int védőerő) {
        this.védőerő = védőerő;
    }
    
    public Katona() {
        this.támadóerő=5;
        this.védőerő=5;
    }

    @Override
    public String toString() {
        return "TE:" + támadóerő + ", VE:" + védőerő + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.támadóerő;
        hash = 37 * hash + this.védőerő;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Katona)) {
           return false;
       }
       
       Katona k=(Katona) obj;
       
       return this.támadóerő==k.getTámadóerő() &&this.védőerő==k.getVédőerő();
    }
    

}
