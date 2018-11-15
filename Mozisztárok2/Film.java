/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Fufella
 */
public class Film implements Comparable<Film> {
    
    private String cím;
    private List<Színész> színészek;

    public Film(String cím) {
        this.cím = cím;
        this.színészek = new ArrayList<>();
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public List<Színész> getSzínészek() {
        return színészek;
    }

    public void setSzínészek(List<Színész> színészek) {
        this.színészek = színészek;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ||!(obj instanceof Film)) {
            return false;
        }
        
        Film f=(Film) obj;
        return this.cím.equals(f.getCím());
    }

    @Override
    public int compareTo(Film t) {
        if(this.színészek.size()==t.getSzínészek().size()) {
            return this.cím.compareTo(t.getCím());
        }
        
        return (-1)*Integer.compare(this.színészek.size(), t.getSzínészek().size());
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cím).append(":\n");
        Collections.sort(színészek);
        for (int i = 0; i < színészek.size(); i++) {
            if (i == színészek.size() - 1) {
                sb.append(színészek.get(i));
            } else {
                sb.append(színészek.get(i)).append("\n");
            }
        }
        return sb.toString();
    }
    
    
    
    
}
