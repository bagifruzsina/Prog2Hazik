/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author Fufella
 */
public class Main {
    
     public static Aszu[] puttony(Bor [] b){                //a metódusnak egy Bor tömböt fogok átadni paraméterül, viszont mivel puttonyszámokat keresünk, ezért Aszú tömböt fogok visszaadni
        int count=0;
        for(int i=0;i<b.length;i++){                
            if(b[i] instanceof Aszu) {                      //egy tömbbel megnézem, hogy a B tömb i. eleme Aszú-e? -> instanceof
                Aszu a=(Aszu) b[i];                         //kasztolok
                if(a.getPuttonySzam()==5) {
                    count++;                                //megszámolom az 5 puttonyos Aszúk számát, elmentem egy változóba
                }
            }
        }
        
        Aszu[] vissza=new Aszu [count];                     //a count már tudja előre, hogy hány 5 puttonyos Aszúm van, ezért készítek egy tömböt, amibe tárolnit tudom őket.
        int index=0;                                        //nem feltétlen ugyanazon a helyen lesz az új tömbben az elem mint ahol a régiben volt, ezért az index változóval figyeljük hogy épp hol járunk az új többen, for ciklusban növelni kell
        
        for(int i=0;i<b.length;i++){
            if(b[i] instanceof Aszu) {
                Aszu a=(Aszu) b[i];
                if(a.getPuttonySzam()==5) {
                    vissza[index]=a;                        //a vissza nevű tömbömbe eltárolom az 5 puttonyos Aszúkat
                    index++;                                //indexet növelem hiszen több sorom lesz.
                }
            }
            
        }
        return vissza;

    }
    
    
    public static void main(String[] args) {
        
        Bor [] bor=new Bor []{
            new Bor("fehér","25hold","finom",18),
            new Bor("kék","22hold","édes",16),
            new Bor("fehér","23hold","száraz",17),
            new Bor("kék","25hold","szar",13),
            new Aszu(3,"10hold",18),
            new Aszu(5,"15hold",15),
            new Aszu(2,"13hold",12)

    };
    
            Aszu[] tomb=puttony(bor);                       //Aszu[] tomb= mutató a memóriába, meghívtuk a puttony metódust, puttony lefut a borra, a tömb nevű változót ráállítja az új tömb(38.sor) kezdetére
            for (Aszu a : tomb) {
                System.out.println(a);
        }

        
    }
    
   
}
