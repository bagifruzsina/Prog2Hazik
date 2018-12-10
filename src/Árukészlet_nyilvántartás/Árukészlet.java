/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Árukészlet_nyilvántartás;

import java.util.Objects;

/**
 *
 * @author Fufella
 */
public class Árukészlet {
    
    private String rövidités;
    private String név;
    private String mennyiségi_egység;
    private double egységár;
    private int szavatossági_idő;
    private int db;

    public Árukészlet(String rövidités, String név, double egységár,String mennyiségi_egység, int szavatossági_idő, int db) {
        this.rövidités = rövidités;
        this.név = név;
        this.mennyiségi_egység = mennyiségi_egység;
        this.egységár = egységár;
        this.szavatossági_idő = szavatossági_idő;
        this.db = db;
    }

    public String getRövidités() {
        return rövidités;
    }

    public void setRövidités(String rövidités) {
        this.rövidités = rövidités;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getMennyiségi_egység() {
        return mennyiségi_egység;
    }

    public void setMennyiségi_egység(String mennyiségi_egység) {
        this.mennyiségi_egység = mennyiségi_egység;
    }

    public double getEgységár() {
        return egységár;
    }

    public void setEgységár(double egységár) {
        this.egységár = egységár;
    }

    public int getSzavatossági_idő() {
        return szavatossági_idő;
    }

    public void setSzavatossági_idő(int szavatossági_idő) {
        this.szavatossági_idő = szavatossági_idő;
    }

    @Override
    public String toString() {
        return "\u00c1ruk\u00e9szlet{" + "n\u00e9v=" + név + ", mennyis\u00e9gi_egys\u00e9g=" + mennyiségi_egység + ", egys\u00e9g\u00e1r=" + egységár + ", szavatoss\u00e1gi_id\u0151=" + szavatossági_idő + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ||!(obj instanceof Árukészlet)) {
            return false;
        }
        
        Árukészlet a=(Árukészlet) obj;
        
        return this.név.equals(a.getNév()) && this.rövidités.equals(a.getRövidités()) && this.egységár==a.getEgységár() && this.mennyiségi_egység.equals(a.getMennyiségi_egység());
    }

    
    
    
    
    
}
