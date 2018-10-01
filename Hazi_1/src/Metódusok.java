/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Metódusok {
    
    public static void Novekvo(int a , int b , int c ) {
  
        if(a<b & a<c & b<c) {
            System.out.println(a+" "+b+" "+c);
        }
        else if(a<b & a<c & c<b) {
            System.out.println(a+" "+c+" "+b);
        }
        else if(b<a & b<c & a<c) {
            System.out.println(b+" "+a+" "+c);
        }
        else if(b<a & b<c & c<a) {
            System.out.println(b+" "+c+" "+a);
        }
        else if(c<b & c<a & b<a) {
            System.out.println(c+" "+b+" "+a);
        }
        else {
            System.out.println(c+" "+a+" "+b);
        }
        
    }
    
    public static void Min_Max(double a, double b, double c){
              double min;
              double max;
              if(a<b & a<c){
                  min=a;
              }else if(b<a & b<c){
                  min=b; 
              }else{
                  min=c;
              }
              
              if(a<0){
                  a*=-1;
              }
              if(b<0){
                  b*=-1;
              }
              if(c<0){
                  c*=-1;
              }
              if(a>b & a>c){
                  max=a;
              }else if(b>c & b>a){
                  max=b;
              }
              else{
                  max=c;
              }
              System.out.println("min="+min+"\nmax="+max);
          }
    
    public static void NegySzam(double a, double b, double c, double d){
        System.out.println(a+" "+b+" "+c+" "+d);
        
        if(d>=0) {
            System.out.println(a+" "+c+" "+b+" "+d);
        }
        else {
            System.out.println(a+" "+b+" "+d+" "+c);
        }
}
    
    public static boolean Haromszog(double a, double b, double c){
    if ( (a < b + c) & (b < a + c) & (c < a + b) ) {
        return true;
    }
    else {
        return false;
    }
   }

    public static int Szokoev(int a, int b){
        int kisebb;
        int nagyobb;
        if(a>b) {
            nagyobb=a;
            kisebb=b;
        }
        else {
            kisebb=a;
            nagyobb=b;
        }
        int i;
        int szokoevek=0;
        for(i=kisebb;i<nagyobb;i++) {
            if(i%4==0 & i%100!=0 | i%400==0) {
                szokoevek++;
            }
        }
        return szokoevek;
    }
   

public static void Jegyek(int jegy){
        switch(jegy) {
            case 1: System.out.println("Elégtelen."); break;
            case 2: System.out.println("Elégséges."); break;
            case 3: System.out.println("Közepes."); break;
            case 4: System.out.println("Jó."); break;
            case 5: System.out.println("Jeles."); break;
            default: System.out.println("Nem érdemjegy."); break;
        }
}

public static int Osztas(int a,int b){
    int hanyados=0;
    while (a>=b) {
        hanyados=hanyados+1;
        a=a-b;
    }
    return hanyados;
}

public static boolean Prim(int n) {
    if ( (n <= 1) || (n % 2 == 0 && n > 2) ) {
        return false;
    }
    int i;
    for(i = 3; i < n / 2.0; i += 2) {
        if (n % i == 0) {
            return false;
        }
    }
   return true;
   
}

public static void Fibonacci (int n){
    int a=0;
    int b=1;
    int c;
    if(n==1) {
        System.out.println(a);
    }
    else if(n==2) {
        System.out.println(a+" "+b);
    }
    else {
        c=a+b;
        System.out.println(a+"\n"+b+"\n"+c);
        int k=3;
        while(k<n) {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
            k=k+1;
        }
    }
     
}

public static int Forditott_szam(int n) {
        int újszám=0;
        while(n!=0) {
            int maradek;
            maradek=n%10;
            újszám=újszám*10+maradek;
            n=n/10;
        }
        return újszám;
        }

public static long Faktorialis(int n) {
    long fakt;
    fakt=1;
    int i;
    for(i = 1; i <= n; i++) {
        fakt *= i;
    }

   return fakt;

}

public static void Kvaloszt(int k, int n1, int n2) {
    int kisebb;
    int nagyobb;
    if(n1>n2) {
        nagyobb=n1;
        kisebb=n2;
    }
    else {
        nagyobb=n2;
        kisebb=n1;
    }
    int i;
            for(i=kisebb;i<nagyobb;i++) {
                if(i%k==0) {
                    
                    System.out.println(i);
                }
            }
    
}

public static int LegkisebbFibo(int n){
    int eredmeny;
    int a=0;
    int b=1;
    int c;
    if(n==0) {
        eredmeny=b;
    }
    else {
        c=a+b;
        
       int k=3;
        do {
            a=b;
            b=c;
            c=a+b;
            eredmeny=c;
            k=k+1;
        }while (a+b<=n);
    }
    return eredmeny;
    
    
}

public static void Ezer(){
    for (int i=0; i<1000; i++) {
	double kobsszeg=0;
	int valt = i;
        while (valt!=0) {
            kobsszeg+=Math.pow(valt%10, 3);
            valt=valt/10;
					}
            if (kobsszeg==i) {
            System.out.println(i);
					}
				}
				
			}
		
    
    
    
    
    }

