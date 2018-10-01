
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Main {
    private static int[] anArray;
    public static void main(String[] args) {
        
         System.out.println("I.RÉSZ");
        System.out.println("\n1. feladat:");
        Pont p1=new Pont(9.55,10);
        Pont p2=new Pont(100.1,63);
        Pont p3=new Pont(5,90.5);
        Pont p4=new Pont(92.73,51.96);
         
        p1.setVektor2(p1.getVektor2()+5);
        p2.setVektor2(p2.getVektor2()+5);
        p3.setVektor1(p3.getVektor1()-3.4);
        p4.setVektor1(p4.getVektor1()-3.4);
        
        System.out.println("1. pont módosított koordinátái: "+p1.getVektor1()+"    "+p1.getVektor2());
        System.out.println("2. pont módosított koordinátái: "+p2.getVektor1()+"    "+p2.getVektor2());
        System.out.println("3. pont módosított koordinátái: "+p3.getVektor1()+"    "+p3.getVektor2());
        System.out.println("4. pont módosított koordinátái: "+p4.getVektor1()+"    "+p4.getVektor2());
   
        
        System.out.println("\n2. feladat:");
        
        RegularPolygon a=new RegularPolygon();
        RegularPolygon b=new RegularPolygon(6, 4.9);
        RegularPolygon c=new RegularPolygon(11, 6.4, 5, 10);
        
        System.out.println("A területe:"+a.getArea()+" kerülete:"+a.getPerimeter());
        System.out.println("B területe:"+b.getArea()+" kerülete:"+b.getPerimeter());
        System.out.println("C területe:"+c.getArea()+" kerülete:"+c.getPerimeter());
        
        
        System.out.println("\n3. feladat:");
                Rectangle r1=new Rectangle(4, 40);
        Rectangle r2=new Rectangle(3.5, 35.9);
        
        System.out.println("1. téglalap :\n"
                                +"-szélessége: "+r1.width
                                +"\n-magassága: "+r1.width
                                +"\n-területe: "+r1.getArea()
                                +"\n-kerülete: "+r1.getPerimeter());
        
        System.out.println("\n2. téglalap :\n"
                                +"-szélessége: "+r2.width
                                +"\n-magassága: "+r2.width
                                +"\n-területe: "+r2.getArea()
                                +"\n-kerülete: "+r2.getPerimeter());

            
            
        System.out.println("\n4. feladat:");

        
        
        System.out.println("\n5. feladat:");
         QuadraticEquation q1=new QuadraticEquation(1,2,3);
        QuadraticEquation q2=new QuadraticEquation(2,4,2);
        QuadraticEquation q3=new QuadraticEquation(6,24,3);
        
        System.out.println("1. eredmeny: "+q1.getDiscriminant());
        if(q1.getDiscriminant()>0) {
            System.out.println("x1="+q1.getRoot1()+" "+"x2="+q1.getRoot2());
        }
        else if(q1.getDiscriminant()==0) {
            System.out.println("x="+q1.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
  
        
        System.out.println("\n2. eredmeny: "+q2.getDiscriminant());
        if(q2.getDiscriminant()>0) {
            System.out.println("x1="+q2.getRoot1()+" "+"x2="+q2.getRoot2());
        }
        else if(q2.getDiscriminant()==0) {
            System.out.println("x="+q2.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
        
        
        System.out.println("\n3. eredmeny: "+q3.getDiscriminant());
        if(q3.getDiscriminant()>0) {
            System.out.println("x1="+q3.getRoot1()+" "+"x2="+q3.getRoot2());
        }
        else if(q3.getDiscriminant()==0) {
            System.out.println("x="+q3.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
        

        
        System.out.println("\n6. feladat:");
        
        LinearEquation l1=new LinearEquation(10,2,25,5,5,0.6);
        LinearEquation l2=new LinearEquation(7,84.6,9,10.7,1.2,12);
        LinearEquation l3=new LinearEquation(3,2,6,4,87,18);
        
        if(l1.isSolvable()) {
            System.out.println("1. egyenletrendszer megoldása: x="+l1.getX()+" y="+l1.getY());
        }
        else {
            System.out.println("1. egyenletrendszer megoldása: The equation has no solution.");
        }
        
        if(l2.isSolvable()) {
            System.out.println("2. egyenletrendszer megoldása: x="+l2.getX()+" y="+l2.getY());
        }
        else {
            System.out.println("2. egyenletrendszer megoldása: The equation has no solution.");
        }
        
        if(l3.isSolvable()) {
            System.out.println("3. egyenletrendszer megoldása: x="+l3.getX()+" y="+l3.getY());
        }
        else {
            System.out.println("3. egyenletrendszer megoldása: The equation has no solution.");
        }
        
        
        
        System.out.println("..................................................................................");
      
        System.out.println("II. RÉSZ");
        
      
        System.out.println("\n1. feladat:");
        Metódusok.Novekvo(-65, 13, 333);

    System.out.println("\n2. feladat:");
    Metódusok.Min_Max(-1,-90,-9);
   
    
    System.out.println("\n3. feladat:");
    Metódusok.NegySzam(1,2,3,4);
    
    System.out.println("\n4. feladat:");
    System.out.println(Metódusok.Haromszog(4,5,6));
    
    System.out.println("\n5. feladat:");
    System.out.println(Metódusok.Szokoev(1996,2018));
    
    System.out.println("\n6.feladat:");
    Metódusok.Jegyek(5);
    System.out.println("\n7. feladat:");
    System.out.println(Metódusok.Osztas(19,5));
    
    System.out.println("\n8. feladat:");
    System.out.println(Metódusok.Prim(13));
    
    System.out.println("\n9. feladat:");
    Metódusok.Fibonacci(9);
    
    System.out.println("\n10. feladat:");
    System.out.println(Metódusok.Forditott_szam(1234));
    
    System.out.println("\n11. feladat:");
    System.out.println(Metódusok.Faktorialis(12));
    
    System.out.println("\n12. feladat:");
    Metódusok.Kvaloszt(3,4,12);
    
    System.out.println("\n13. feladat:");
    System.out.println(Metódusok.LegkisebbFibo(13));
    
    System.out.println("\n14. feladat:");
    Metódusok.Ezer();
    
    

   
 } 

    
}

   
