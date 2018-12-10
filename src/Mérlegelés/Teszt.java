/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fufella
 */
public class Teszt {
    public static void main(String[] args) {
        List<Cég> lista = new ArrayList<Cég>();
        String[] st;
        String sor;
        try
        {
            FileReader fr=new FileReader(new File("sample_merleg.txt"));  
            BufferedReader br=new BufferedReader(fr);
            while( (sor=br.readLine())!=null)
            {
                st=sor.split(":");
                int volt=0;
                for(int i=0;i<lista.size();i++)
                {
                    if(lista.get(i).telephely.compareTo(st[1])==0 && lista.get(i).név.compareTo(st[0])==0)
                    {
                        lista.get(i).db++;
                        lista.get(i).évesbevétel+=Integer.parseInt(st[3]);
                        volt++;
                    }
                }
                if(volt==0) lista.add(new Cég(st[0], st[1], Integer.parseInt(st[2]),Integer.parseInt(st[3]),1)); 
                
            }
            Collections.sort(lista);
            for (Cég x : lista) {
                System.out.println(x);
            }
            
            
        }catch(FileNotFoundException ex){
            System.err.println("Nincs ilyen file!!");
        
        }catch(IOException e){
            
        }
    }
}