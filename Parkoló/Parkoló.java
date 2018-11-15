/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkoló;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fufella
 */
public class Parkoló{
    public String cím;
    public double terület;
    public int kapacitás;
    public int rendszám;

    public Parkoló(String cím, double terület, int kapacitás, int rendszám) {
        this.cím = cím;
        this.terület = terület;
        this.kapacitás = kapacitás;
        this.rendszám = rendszám;
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public double getTerület() {
        return terület;
    }

    public void setTerület(double terület) {
        this.terület = terület;
    }

    public int getKapacitás() {
        return kapacitás;
    }

    public void setKapacitás(int kapacitás) {
        this.kapacitás = kapacitás;
    }

    public int getRendszám() {
        return rendszám;
    }

    public void setRendszám(int rendszám) {
        this.rendszám = rendszám;
    }

   

    @Override
    public String toString() {
        return this.cím+": "+(this.kapacitás-this.rendszám)+" szabad hely";
    }

   
    
    
    
}
