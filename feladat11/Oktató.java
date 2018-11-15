/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat11;

/**
 *
 * @author Fufella
 */
public class Oktató extends Személy{
    private String tanszék;

    public Oktató(String név, int életkor, boolean férfi,String tanszék) {
        super(név, életkor, férfi);
        this.tanszék=tanszék;
    } 

    public String getTanszék() {
        return tanszék;
    }

    public void setTanszék(String tanszék) {
        this.tanszék = tanszék;
    }

    @Override
    public String toString() {
        return super.név+" "+super.életkor+" "+super.isFérfi()+" "+ tanszék;
    }
    
    
}
