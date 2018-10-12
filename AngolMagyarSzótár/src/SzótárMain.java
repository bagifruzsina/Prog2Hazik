
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class SzótárMain {
    
    public static Szótár sz[];
    
    public static void rendez(Szótár [] s) {
        for(int i=0;i<s.length-1;i++) {
            for(int j=i+1;j<s.length;j++) {
                if(s[i].getAngol().compareTo(s[j].getAngol())==0) {
                    if(s[i].getMagyar().compareTo(s[j].getMagyar())>0) {
                        Szótár tmp=s[i];
                        s[i]=s[j];
                        s[j]=tmp;
                    }
                }
                
                else if(s[i].getAngol().compareTo(s[j].getAngol())>0) {
                    Szótár tmp=s[i];
                    s[i]=s[j];
                    s[j]=tmp;
                }
            }
            
        }
        
    }
    
    
    
    public static void kiir(Szótár [] s) {
        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }
        
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        
        sz=new Szótár[n];
        for(int i=0;i<n;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(":");
            
            sz[i]=new Szótár(st[0],st[1]);
            
        }
        
        kiir(sz);
        System.out.println("\n");
        rendez(sz);
        kiir(sz);
    }
    
}
