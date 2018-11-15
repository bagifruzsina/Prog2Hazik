/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zárthelyi_eredmények;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fufella
 */
public class Teszt {
    public static void main(String[] args) {
        
        List<Zárthelyi> zh=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        int ures=0,volt,i;
        
        while(sor.length()>0) {
            
            String [] st=sor.split(";");
            volt=0;
            
            if(ures==0) {
                zh.add(new Zárthelyi(st[0], Integer.parseInt(st[1])));
                ures++;
            }
            
            else {
                Zárthelyi valt=new Zárthelyi(st[0], Integer.parseInt(st[1]));
                for(i=0;i<zh.size();i++) {
                    if(zh.get(i).getNév().compareTo(st[0])==0) {
                        volt++;
                        int p=zh.get(i).pont;
                        valt.pont=valt.pont+p;
                        zh.set(i, valt);
                    }
                }
                ures++;
                
                if(volt==0){
                    zh.add(valt);
                }
                
            }
            
            sor=sc.nextLine();
            
        }
        Collections.sort(zh);
        for (Zárthelyi x : zh) {
            System.out.println(x);
        }
        
    }
    
}
