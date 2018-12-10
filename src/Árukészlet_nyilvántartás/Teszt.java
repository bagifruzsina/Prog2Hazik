/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Árukészlet_nyilvántartás;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fufella
 */
public class Teszt {
    
    public static void main(String[] args) {
        
        List<Árukészlet> lista=new ArrayList<>();
        List<Árukészlet> kiir=new ArrayList<>();
        
        try{
            FileReader fr=new FileReader(new File("sample_árukészlet.txt"));  
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            
            while((sor=br.readLine())!=null) {
                
                String [] st=sor.split(";");
                if(st[0].equals("E")) {
                    lista.add(new Élelmiszer(st[0], st[1],Double.parseDouble(st[2]), st[3],Integer.parseInt(st[4]), Integer.parseInt(st[5])));
                    continue;
                }
                if(st[0].equals("T")){
                    lista.add(new Tartós_fogyasztási_cikk(st[0], st[1],Double.parseDouble(st[2]),st[3],Integer.parseInt(st[4])));
                    continue;
                }
                
                else{
                    System.out.println("Hibás input");
                }
                
            }
            
            
            
            br.close();
            
        }catch(IOException e)
        {
            System.out.println("Fájl hiba!");
        }
        
        for(int i=0;i<lista.size();i++) {
            int volt=0;
            
            for(int j=0;j<kiir.size();j++) {
                if(lista.get(i).equals(kiir.get(j))) {
                    volt++;
                    kiir.get(j).setDb(kiir.get(j).getDb()+lista.get(i).getDb());
                    break;
                }
            }
            
            if(volt==0) {
                kiir.add(lista.get(i));
            }
        }
        
        for (Árukészlet x : kiir) {
            System.out.println(x);
        }

        
    }
}
