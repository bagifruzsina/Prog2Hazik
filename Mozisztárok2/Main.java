/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fufella
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Film> f=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        while (sor.length() > 0) {
            
            String[] st = sor.split("[():;]");
            
            for (int i = 3; i < st.length; i++) {
                Film a = new Film(st[i]);

                if (f.contains(a)) {
                    f.get(f.indexOf(a)).getSzínészek().add(new Színész(st[0], Integer.parseInt(st[1])));
                } else {
                    a.getSzínészek().add(new Színész(st[0], Integer.parseInt(st[1])));
                    f.add(a);
                }

            }

            sor = sc.nextLine();

        }

        
        Collections.sort(f);
        for(Film i:f)
            System.out.println(i);

    }
}
