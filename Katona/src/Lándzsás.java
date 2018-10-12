/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Lándzsás extends Katona{

    public Lándzsás(int támadóerő, int védőerő) {
        super(támadóerő, védőerő);
    }

    @Override
    public String toString() {
        return "Ládzsás " + "TE:"+super.getTámadóerő()+",VE:"+super.getVédőerő();
    }
    
    
    
}
