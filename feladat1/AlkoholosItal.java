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
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String íz;
    private double alkoholTartalom;

    public AlkoholosItal(String íz, double alkoholTartalom) {
        this.íz = íz;
        this.alkoholTartalom = alkoholTartalom;
    }
    
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }
    
    public String milyenIzu(){
        return íz;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "\u00edz=" + íz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
    
    
    
}
