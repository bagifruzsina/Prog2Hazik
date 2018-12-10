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
public class Élelmiszer extends Árukészlet{

    public Élelmiszer(String rövidités, String név, double egységár, String mennyiségi_egység, int szavatossági_idő, int db) {
        super(rövidités, név, egységár, mennyiségi_egység, szavatossági_idő, db);
    }

  

    @Override
    public String toString() {
        return super.getRövidités()+" "+super.getNév()+" "+super.getEgységár()+" "+super.getSzavatossági_idő()+" "+super.getMennyiségi_egység()+" "+super.getDb();
    }
            
    
}
