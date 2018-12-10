/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

/**
 *
 * @author Fufella
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cég implements Comparable<Cég>{
    public String név;
    public String telephely;
    public int év;
    public int évesbevétel;
    public int db;

    public Cég(String nev, String telephely, int Év, int Éves_bevÉtel, int Év_db) {
        this.név = név;
        this.telephely = telephely;
        this.év = év;
        this.évesbevétel = évesbevétel;
        this.db = db;
    }

    

    @Override
    public String toString() {
        return név+ " ("+telephely+"): "+évesbevétel;
    }

    @Override
    public int compareTo(Cég o) {
        int diff =Integer.compare(o.évesbevétel, this.évesbevétel);
        if(diff!=0) return diff;
        
        diff=Integer.compare(this.db, o.db);
        if(diff!=0) return diff;
        
        return this.név.compareTo(o.név);
    }
    
    
    
    
}
