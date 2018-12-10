/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kémia;

/**
 *
 * @author Fufella
 */
public class KemiaiElem implements ReakcioKepes<KemiaiElem>{
        
    private String vegyjel;
    private int rendszám;
    private String főcsoport;

    public KemiaiElem(String vegyjel, int rendszám, String főcsoport) {
        this.vegyjel = vegyjel;
        this.rendszám = rendszám;
        this.főcsoport = főcsoport;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public int getRendszám() {
        return rendszám;
    }

    public void setRendszám(int rendszám) {
        this.rendszám = rendszám;
    }

    public String getFőcsoport() {
        return főcsoport;
    }

    public void setFőcsoport(String főcsoport) {
        this.főcsoport = főcsoport;
    }
    
    

    @Override
    public boolean reakciobaLephet(KemiaiElem o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean reakciobaLephet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
