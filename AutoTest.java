/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class AutoTest {
    private static Autó[] amax;
   
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó [] teher){
        
  for(int i=0;i<teher.length-1;i++){
            for(int j=i+1;j<teher.length;j++)
            {
                if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()) 
                {
                        Teherautó tmp=teher[i];
                        teher[i]=teher[j];
                        teher[j]=tmp;
                    }

                }

        }
  for(Teherautó x:teher){
           System.out.println(x);

    }
 }
    
    
   public static Autó keresMaxMotorTeljesítmény(Autó []auto){
        Autó max=new Autó("AAA111",0);

                for(int i=0;i<auto.length;i++)
                {
                    if(auto[i]  instanceof Autó)
                    {
                        Autó a=(Autó) auto[i];
                        if(a.getMotorTeljesítmény()>max.getMotorTeljesítmény())
                        {
                        max=a;
                        }
                    }
                }
       for(Autó i:auto)
       {
           if(i instanceof Autó)
           {
               if(i.getMotorTeljesítmény()>max.getMotorTeljesítmény())
               {
                   max=i;
               }
           }
       }
       if(max.getMotorTeljesítmény()>0)
       {
            return max;
        }
       else
       {
            return null;
       }

    }
    
  
    
    public static void main(String[] args) 
    {
        
        Autó [] auto=new Autó[]
        {
            new Teherautó("IPP829",252,1000),
            new Teherautó("DSA987",280,800),
            new Teherautó("POI156",300,1100),
            new Teherautó("ZUT195",150,700),
            new Teherautó("KLM993",350,1250),
            new Autó("LKO102",120),
            new Autó("ABC306",125),
            new Autó("RET987",115),
            new Autó("BLI789",100),
            new Autó("PRO165",65)

        };
        
        Teherautó [] tehau=new Teherautó[]
        {
            new Teherautó("IPP822",455,1250),
            new Teherautó("FGH123",400,1000),
            new Teherautó("PLM936",395,900),
            new Teherautó("XCV932",415,950),
            new Teherautó("LMV111",420,880),
            new Teherautó("AQC123",500,1100),
            new Teherautó("IZN116",490,1150),
            new Teherautó("NMC654",510,1050),
            new Teherautó("IPX987",400,1400),
            new Teherautó("MLK321",480,1300),
            
        };

        
        rendezMaxSzállíthatóTeherCsökkenőleg(tehau);
        Autó au=keresMaxMotorTeljesítmény(auto);
    
        System.out.println("\n");
        System.out.println(au);

        
    }
            
    
}

       
        