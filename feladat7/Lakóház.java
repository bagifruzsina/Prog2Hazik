/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat7;

/**
 *
 * @author Fufella
 */
public class Lakóház implements Comparable<Lakóház>{
    
    public double emeletMagasság=3.2;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletekSzáma, double alapterület) {
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() {
        return cím;
    }

    public int getEmeletekSzáma() {
        return emeletekSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }
    
    public double légköbméter() {
        return this.alapterület*this.emeletekSzáma*this.emeletMagasság;
    }

    @Override                               //a toString StringBuilderrel van megvalósítva (???)
    public String toString() {
        return "Lak\u00f3h\u00e1z{" + "emeletMagass\u00e1g=" + emeletMagasság + ", c\u00edm=" + cím + ", emeletekSz\u00e1ma=" + emeletekSzáma + ", alapter\u00fclet=" + alapterület + '}';
    }

    @Override
    public int compareTo(Lakóház o) {
        return Double.compare(this.légköbméter(), o.légköbméter());
    }
    
    
    
    
    
}
