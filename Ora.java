/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

/**
 *
 * @author Fufella
 */
public class Ora {
    
    private int kód;
    private String név;
    private int kezdet;

    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        
        if(kezdet>19){
            this.kezdet=19;
        }
        else if(kezdet<8){
            this.kezdet=8;
        }
        else{
            this.kezdet=kezdet;
        }
        
    }
    
    public int getKód() {
        return kód;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kód + ", nev=" + név + ", kezdet=" + kezdet + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.kezdet;
        return hash;
    }

    @Override
        public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Ora)) {
            return false;
        }
        
        Ora o=(Ora) obj;
        return this.kezdet==o.getKezdet();
   
    }
    
    
    
    
    
}
