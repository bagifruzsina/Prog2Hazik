/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_9;

/**
 *
 * @author Fufella
 */
public class Hátizsák implements Comparable<Hátizsák>{
    
    private String márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    public void setMárka(String márka) {
        this.márka = márka;
    }

    public void setŰrtartalom(double űrtartalom) {
        this.űrtartalom = űrtartalom;
    }

    public void setZsebekSzáma(int zsebekSzáma) {
        this.zsebekSzáma = zsebekSzáma;
    }

    public void setVízhatlan(boolean vízhatlan) {
        this.vízhatlan = vízhatlan;
    }
    

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k{" + "m\u00e1rka=" + márka + ", \u0171rtartalom=" + űrtartalom + ", zsebekSz\u00e1ma=" + zsebekSzáma + ", v\u00edzhatlan=" + vízhatlan + '}';
    }

    @Override
//   public int compareTo(Hátizsák o) {
//     if(this.márka.equals(o.getMárka())){
//         return -1*Integer.compare(this.zsebekSzáma, o.zsebekSzáma);
//         
//     }
//         return this.márka.compareTo(o.getMárka());
//     
//    }
    
    public int compareTo(feladat_9.Hátizsák o) {
        int dif=this.márka.compareTo(o.márka);
        if(dif!=0) {
            return dif;                                 

        }
        return Integer.compare(this.zsebekSzáma, o.zsebekSzáma)*(-1);
    }

 
    
    
}