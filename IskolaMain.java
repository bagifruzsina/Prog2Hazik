/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author Fufella
 */
public class IskolaMain {
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//bemnet: nap óraszám
		String sor = sc.nextLine();
		String st[] = sor.split(" ");
		Orarend orarend = new Orarend(st[0]);
		
		
		
		int n = Integer.parseInt(st[1]);
		for (int i = 0; i<n; i++) {
			//bemenet: kód név idő
			
			sor = sc.nextLine();
			st = sor.split(" ");
			int kód = Integer.parseInt(st[0]);
			int szam = Integer.parseInt(st[2]);
			Ora temp = new Ora(kód, st[1], szam);
			
			if (orarend.oratHozzaad(temp)) {
				System.out.println("Sikeres hozzáadás!");
			} else {
				System.out.println("Sikertelen hozzáadás!");
			}
		}
		orarend.kiirat();
		
		
		
		
		
	}
}



