/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkoló;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fufella
 */
public class Teszt {
    public static void main(String[] args) {
        List<Parkoló> lista=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int db=0,count=0;
        
        while(sor.length()>0) {
            
            String [] st=sor.split(";");
            
            db=0;
            for(int i=0;i<st.length-3;i++) {
                db++;
            }
            lista.add(new Parkoló(st[0],Double.parseDouble(st[1]),Integer.parseInt(st[2]),db));
            
            
            sor=sc.nextLine();
            
        }
        
        for (Parkoló x : lista) {
            if(x.kapacitás-x.rendszám>3){
            System.out.println(x);
            }
        }
        
    }
}
