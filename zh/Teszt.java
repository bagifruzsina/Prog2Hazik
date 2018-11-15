/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Fufella
 */
public class Teszt {
    
    public static Hallgató[] h;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        h=new Hallgató[n];
        
        for(int i=0;i<n;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(",");

            h[i]=new Hallgató(Integer.parseInt(st[0]),true);
            
            if(st[1].equals("igaz")) {
                h[i].sokatTanul=true;
            }
            else {
                h[i].sokatTanul=false;
            }
         }
        
        for(int i=0;i<n;i++) {
            if(h[i].dolgozatotIr().megfelelt() &&  h[i].dolgozatotIr().megfelelt()){
                System.out.println("megfelelt");
            }
            else {
                System.out.println("nem felelt meg");
            }
        }
        
        
        
    }
    
}
