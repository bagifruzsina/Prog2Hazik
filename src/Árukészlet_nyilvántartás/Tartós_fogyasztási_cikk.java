/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Árukészlet_nyilvántartás;

/**
 *
 * @author Fufella
 */
public class Tartós_fogyasztási_cikk extends Árukészlet{

    public Tartós_fogyasztási_cikk(String rövidités, String név, double egységár, String mennyiségi_egység, int db) {
        super(rövidités, név, egységár, mennyiségi_egység, 0, db);
    }

    

    @Override
    public String toString() {
        return super.getRövidités()+" "+super.getNév()+" "+super.getEgységár()+" "+super.getMennyiségi_egység()+" "+super.getDb();
    }

    
    
}
