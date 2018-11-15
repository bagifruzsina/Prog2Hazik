/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok2;

/**
 *
 * @author Fufella
 */
public class Színész implements Comparable<Színész>{
    
    private String név;
    private int születésiév;

    public Színész(String név, int születésiév) {
        this.név = név;
        this.születésiév = születésiév;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getSzületésiév() {
        return születésiév;
    }

    public void setSzületésiév(int születésiév) {
        this.születésiév = születésiév;
    }

    @Override
    public int compareTo(Színész t) {
        if(Integer.compare(this.születésiév, t.születésiév)==0){
            return this.név.compareTo(t.név);
        }
        
      return Integer.compare(this.születésiév, t.születésiév);
    }

    @Override
    public String toString() {
        return  születésiév + ": "+név;
    }
    
    
    
    
}
