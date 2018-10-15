/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
      private static void rendez(Másfélmillió []m){
        for(int i=0;i<m.length-1;i++)
            for(int j=i+1;j<m.length;j++)
                if(kék(m[i])<kék(m[j])){
                   Másfélmillió tmp=m[i];
                    m[i]=m[j];
                    m[j]=tmp;
                }else
                    if(kék(m[i])==kék(m[j])){
                        if((piros(m[i])+zöld(m[i])+sárga(m[i]))==(piros(m[j])+zöld(m[j])+sárga(m[j]))){
                            if(m[i].getNév().compareTo(m[j].getNév())>0){
                                Másfélmillió tmp=m[i];
                                m[i]=m[j];
                                m[j]=tmp;
                            }
                        }else 
                            if((piros(m[i])+zöld(m[i])+sárga(m[i]))<(piros(m[j])+zöld(m[j])+sárga(m[j]))){
                                Másfélmillió tmp=m[i];
                                m[i]=m[j];
                                m[j]=tmp;
                            }
                    }
    }
    
    private static int kék(Másfélmillió kék){
        String findString="K"; 
        int firstIndex=0;
        String str=kék.getÚtvonal();
        int count=0;
        while(firstIndex!=-1){   //-1 et ad vissza az indexOf ha már nincs mit keresni ugymond 
            firstIndex=str.indexOf(findString, firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length(); // első kör után 2 lesz a first indexem majd visszameg a while-ra
            }
        }
        return count;
    }
     
    private static int zöld(Másfélmillió zöld){
        String findString="Z";
        int firstIndex=0;
        String str=zöld.getÚtvonal();
        int count=0;
        while(firstIndex!=-1){
            firstIndex=str.indexOf(findString,firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length();
            }
        }
        return count;
    }
    
    private static int sárga(Másfélmillió sárga){
        String findString="S";
        int firstIndex=0;
        String str=sárga.getÚtvonal();
        int count=0;
        while(firstIndex!=-1){
            firstIndex=str.indexOf(findString,firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length();
            }
        }
        return count;
    }
    
    private static int piros(Másfélmillió piros){
        String findString="P";
        int firstIndex=0;
        String str=piros.getÚtvonal();
        int count=0;
        while(firstIndex!=-1){
            firstIndex=str.indexOf(findString,firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length();
            }
        }
        return count;
    }
    
    private static Másfélmillió mil[];
    
    
    public static void kiir(Másfélmillió k[]){
        for(int i=0;i<k.length;i++){
            System.out.println(k[i]);
        }
    }
    
    
    
    public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=Integer.parseInt(sc.nextLine());
    mil=new Másfélmillió[n];

    for(int i=0;i<n;i++){
        String sor=sc.nextLine();
        String st[]=sor.split(";");
        mil[i]=new Másfélmillió(st[0],st[1]);
            }
    
    rendez(mil);
    kiir(mil);
    
    }
    
  
    
    
}
