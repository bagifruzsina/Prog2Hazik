/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author Fufella
 */
public interface Rendezheto<R> {
    
    public boolean egyenlo(R o);   
    public boolean nagyobbMint(R o);   
    public boolean kisebbMint(R o); 
    
}
