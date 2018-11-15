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
public class Bor extends AlkoholosItal{
    
    private String szőlőfajta;
    private String termoTerulet;
      
   
    public Bor(String szőlőfajta, String termoTerulet,String íz, double alkoholTartalom) {
        super(íz, alkoholTartalom);
        this.szőlőfajta=szőlőfajta;
        this.termoTerulet=termoTerulet;
    }
    
    public String milyenSzolobolKeszult() {
        return szőlőfajta;
    }
    
    
    public String holTermett() {
        return termoTerulet;
    }

    public String getSzőlőfajta() {
        return szőlőfajta;
    }

    public void setSzőlőfajta(String szőlőfajta) {
        this.szőlőfajta = szőlőfajta;
    }

    public String getTermoTerulet() {
        return termoTerulet;
    }

    public void setTermoTerulet(String termoTerulet) {
        this.termoTerulet = termoTerulet;
    }
    
    

    @Override
    public String mibolKeszult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
