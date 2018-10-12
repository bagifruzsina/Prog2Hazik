/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Teszt {
    
    public static Katona megkuzd(Katona k1,Katona k2) {
            
        Katona nyertes=new Katona();
            if(k1.getTámadóerő()>k2.getVédőerő()) {
                
                nyertes=k1;
            }   
            else if(k2.getTámadóerő()>k1.getVédőerő()) {
                
                nyertes=k2;
            }
            else if(k1.getTámadóerő()==k2.getTámadóerő()) {
                
                nyertes=k1;
            }
            
            
        return nyertes;
    }
    
    
    public static void main(String[] args) {
        
      Nyilas k1=new Nyilas(80,65,40);
      Nyilas k2=new Nyilas(88,92,52);
      Lándzsás k3=new Lándzsás(90,56);
        
        
        
        System.out.println("1. kör résztvevői:\n");
        System.out.println(k1);
        System.out.println(k2);
        Katona elsőnyertes=megkuzd(k1,k2);
        System.out.println("Első nyertes: "+elsőnyertes);
        System.out.println("\n");
        
        System.out.println("2. kör résztvevői:\n");
        System.out.println(elsőnyertes);
        System.out.println(k3);
        Katona nyertes=megkuzd(elsőnyertes,k3);
        System.out.println("CSATANYERTES: "+nyertes);
            
        
        
        
        
        
    }
    
}
