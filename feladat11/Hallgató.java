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
public class Hallgató extends Személy{

    private double átlagtulajdonság;
    private double átlag=4;
    
    public Hallgató(String név, int életkor, boolean férfi,double átlagtulajdonság) {
        super(név, életkor, férfi);
        this.átlagtulajdonság=átlagtulajdonság;
    }

    public double getÁtlagtulajdonság() {
        return átlagtulajdonság;
    }

    public void setÁtlagtulajdonság(double átlagtulajdonság) {
        this.átlagtulajdonság = átlagtulajdonság;
    }

    public void setÁtlag(double átlag) {
        this.átlag = átlag;
    }
    
    

    @Override
    public String toString() {
        return super.név+" "+super.életkor+" "+super.isFérfi()+" "+átlagtulajdonság;
    }
    
    public boolean jóképességű() {
        if(átlagtulajdonság>=4) {
            return true;
        }
        return false;
    }
    
}
