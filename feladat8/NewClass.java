/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fufella
 */
public class NewClass implements RealNumbers{

    public ArrayList<Double> kutyi;

    public NewClass(ArrayList<Double> kutyi) {
        this.kutyi = kutyi;
    }
    
    @Override
    public void add(double num) {
        kutyi.add(num);
    }

    @Override
    public double get(int idx) {
        return kutyi.get(idx-1);
    }

    @Override
    public void delete(int idx) {
        kutyi.remove(idx-1);
    }

    @Override
    public boolean contains(double num) {
        if(kutyi.contains(num)) {
            return true;
        }
        return false;
    }

    @Override
    public int getFirstOccurrence(double num) {
        return (kutyi.indexOf(num)+1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Több sorból áll a toString() egy egyedre, akkor kell használni a StringBuilder-t
        
        for (Double x : kutyi) {
            sb.append(x).append(System.getProperty("line.separator"));
        }
        
        
        return sb.toString();
    }
    
    
    
}
