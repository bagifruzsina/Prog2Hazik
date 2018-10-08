/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class VendeglatoMain {
    
    public static Kocsma[] adottItaltKínálóKocsmák(VendéglátóipariEgység[] ven, String ital) {
         int count=0;
        for(int i=0;i<ven.length;i++)
        {
            if(ven[i] instanceof Kocsma) {
                Kocsma k=(Kocsma) ven[i];
                for(int j=0;j<k.getSörlap().length;j++) 
                    if(k.getSörlap()[j].equals(ital)) { 
                        count++;                        
                        
                    }
                
            }
            
        }
        Kocsma[] kocsma=new Kocsma[count];

        int t=0;
        for(int i=0;i<ven.length;i++)
        {
            if(ven[i] instanceof Kocsma) { 
                Kocsma k=(Kocsma) ven[i];
                for(int j=0;j<k.getSörlap().length;j++) 
                    if(k.getSörlap()[j].equals(ital)) { 
                        kocsma[t]=k;
                        t++;
                        
                    }
                
            }
            
        }
        
       
        
        return kocsma;
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        VendéglátóipariEgység [] ven=new VendéglátóipariEgység[]{
            new Kocsma("Kis Kocsma",50,new String[]{"borsodi","heineken","kozel"}),
            new Kocsma("Nagy Kocsma",100,new String[]{"kőbányai","heineken","soproni"}),
            new Kocsma("Közepes Kocsma",75,new String[]{"becks","pilsner","borsodi"}),
            new Kocsma("Pici Kocsma",25,new String[]{"budweiser","becks","soproni"}),
            new Kocsma("Óriás Kocsma",125,new String[]{"radler","borsodi","kozel"}),
            new Étterem("Kis Étterem",51,new String[]{"rántottsajt","libacomb","őzpörkölt"}),
            new Étterem("Nagy Étterem",101,new String[]{"csirkemáj","velő","marhaszegy"}),
            new Étterem("Közepes Étterem",76,new String[]{"húsleves","kakashere","velő"}),
            new Étterem("Pici Étterem",26,new String[]{"pacal","cigánypecsenye","rántottsajt"}),
            new Étterem("Óriás Étterem",126,new String[]{"libacomb","húsleves","gyümölcsleves"})

        };
        
        Kocsma[] kocs=adottItaltKínálóKocsmák(ven,"borsodi");
        for(Kocsma t:kocs)
            System.out.println(t);
    }
    
}
