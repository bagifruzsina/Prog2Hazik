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
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    
    private double alkoholTartalom;

    public ErjedtGyumolcs(String fajta, String íz, double alkoholTartalom) {
        super(fajta, íz);
        this.alkoholTartalom=alkoholTartalom;
    }
    
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }
    

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }
    
    
    
    
}
