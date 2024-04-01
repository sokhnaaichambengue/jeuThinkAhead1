package modele;

import java.util.Scanner;

public class Coup  {
	int positioncase;
	int orientation;
	int m=6;
	int [] coup=new int[m];
	int [] numero =new int[m];
	int [] colonne =new int[m];
	int [] ligne =new int [m];
public Coup(int positioncase, int orientation, int[] coup) {
		super();
		this.positioncase = positioncase;
		this.orientation = orientation;
}

public void jouecoup() {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<coup.length;i++) {
		System.out.println("saisir les coups");
		coup[i]=sc.nextInt();
		System.out.println("saisir les numeros");
		numero[i]=sc.nextInt();
		if(numero[i]==coup[i]) {
		System.out.println("affiche le numero du joueur qui joue dans chaque coup");
	}
		else {
			System.out.println("aucune joueur n'a joue au coup");
		}
	}
}
	

public void positioncase() {
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<colonne.length;i++) {
		System.out.println("saisir le nombre de colonne");
		System.out.println("le coup etait dans une ligne");
		colonne[i]=sc.nextInt();
		System.out.println("sasir le nombre deligne");
		System.out.println("le coup etait joue dans une ligne");
		ligne[i]=sc.nextInt();
		
	}
}
}
