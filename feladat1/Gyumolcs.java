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
public class Gyumolcs {
    private String fajta;
    private String íz;

    public Gyumolcs(String fajta, String íz) {
        this.fajta = fajta;
        this.íz = íz;
    }
    
    public String milyenFajtaju() {
        return fajta;
    }
    
    public String milyenIzu() {
        return íz; 
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getÍz() {
        return íz;
    }

    public void setÍz(String íz) {
        this.íz = íz;
    }
    
    

    @Override
    public String toString() {
        return "Gyumolcs{" + "fajta=" + fajta + ", \u00edz=" + íz + '}';
    }
    
    
    
}
