/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Másfélmillió {
    private String név;
    private String útvonal;

    public Másfélmillió(String nev, String utvonal) {
        this.név = név;
        this.útvonal = útvonal;
    }

    public String getNév() {
        return név;
    }

    public String getÚtvonal() {
        return útvonal;
    }

    @Override
    public String toString() {
        return név ;
    }
    
    
}