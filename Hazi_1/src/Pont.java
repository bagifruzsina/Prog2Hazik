/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Pont {
    private double vektor1;
    private double vektor2;

    public Pont(double vektor1, double vektor2) {
        this.vektor1 = vektor1;
        this.vektor2 = vektor2;
    }
    
    public double getVektor1() {
        return this.vektor1;
    }
    
    public double getVektor2() {
        return this.vektor2;
    }
    
    public void setVektor1(double v1) {
        this.vektor1=v1;
    }
    
    public void setVektor2(double v2) {
        this.vektor2=v2;
    }
}
