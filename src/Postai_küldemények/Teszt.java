/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postai_küldemények;

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
        List<Csomag> folista = new ArrayList<Csomag>();
        String sor;
        String[] st;
        
        try{
            FileReader fr=new FileReader(new File("sample_posta.txt"));    //args[0]
            BufferedReader br=new BufferedReader(fr);
            while((sor=br.readLine())!=null){
                int ir_egyezik=0;
                st=sor.split(":");
                
                for (Csomag x : folista) {
                    if(Integer.parseInt(st[1])==x.irányítószám){
                        ir_egyezik=1;
                        x.összérték+=Integer.parseInt(st[5]);
                        x.lista.add(new Adatok(st[0], st[2], st[3], Integer.parseInt(st[4]), Integer.parseInt(st[5])));
                    }
                }
                if(ir_egyezik==0){
                    folista.add(new Csomag(Integer.parseInt(st[1]), Integer.parseInt(st[5]), null));
                    folista.get(folista.size()-1).lista=new ArrayList<>();
                    folista.get(folista.size()-1).lista.add(new Adatok(st[0], st[2], st[3], Integer.parseInt(st[4]), Integer.parseInt(st[5])));
                }

            }

        }catch(IOException e){
            
        }
        
        for(int i=0;i<folista.size();i++){
            Collections.sort(folista.get(i).lista);
        }
        
        Collections.sort(folista);
        
        for (Csomag x : folista) {
            System.out.println(x);
        }
    }
}