/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat10;

import feladat_9.Teszt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fufella
 */
public class Main {
    
    public static Autó[] a;
    
    public static List<Autó> legnagyobbTeljesítmény(List<Autó> a){
        Collections.sort(a);
        
        if(a.size()<3) {
            return a;
        }
        
        List<Autó> lista=new ArrayList<Autó>();
         
       
        
        if(a.size()>=3) {
          for(int i=0;i<3;i++){
            lista.add(a.get(i));
           }
          return lista;
        }
        
        return null;
        
    }
    
    
    public static List<Teherautó> teherbírás(Autó [] a) {
        List<Teherautó> t=new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            if(a[i] instanceof Teherautó) {
                Teherautó te=(Teherautó) a[i];
                    if(te.getTeherbírás()>2000){
                        t.add(te);
                    }
            } 
        }
        
         return t;
    }
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        
//        String sz[] =s.split("\n");
//        String rendszám=sz[0];
//        Autó b=new Autó(rendszám,100,true);
//        
//       
//        System.out.println(b.szabályos());
        
        a=new Autó[4];
        for(int i=0;i<4;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(" ");
               if(i<2){
                    a[i]=new Autó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]));
               }
                else {
                   a[i]=new Teherautó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]),Integer.parseInt(st[3]));
               }
        }
        
        
        for (Autó c : a) {
            System.out.println(c);
        }
        
//        List<Autó> autó=new ArrayList();
//        
//        autó.add(new Autó("QWE123", 75, true));
//        autó.add(new Autó("VFC193", 80, false));
//        autó.add(new Autó("IKJ555", 120, true));
//        autó.add(new Autó("QLKO354", 100, false));
//        autó.add(new Autó("PLM978", 115, false));
//        autó.add(new Autó("NMB343", 130, true));
//
//        
//        List<Autó> kiir=legnagyobbTeljesítmény(autó);
//        
//        for (Autó a : kiir) {
//            System.out.println(a);
//        }
        
        System.out.println("_________");
        List<Teherautó> kiirom=teherbírás(a);
        for (Teherautó kiirom1 : kiirom) {
            System.out.println(kiirom1);
        }
            System.out.println(Autó.darabszám);
        }
        
        
    }

