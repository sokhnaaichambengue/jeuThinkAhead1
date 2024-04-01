package modele;

import java.util.Scanner;

public class Grille {
int AlignementsActif;
int cases;
int m=2;
int [] val=new int [m];
int [] [] array =new int [m][m];
int [][] j1=new int[m][m];
int [][] ca =new int[m][m];
int [] po =new int[m];
int choisie;
public Grille(int alignementsactif, int cases) {
	super();
	this.AlignementsActif = alignementsactif;
	this.cases = cases;
}
public void cases() {
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++)	{
			System.out.println("saisir le nombre de ligne et de colonne de la case ");
			array[i][j]=sc.nextInt();
			System.out.println("saisir son contenu");
			val[i]=sc.nextInt();
			System.out.println("Saisir les joueurs");
			j1[i][j]=sc.nextInt();
			if("j1[i][j"=="array[i][j]") {
				System.out.println("le choix ne porte pas au niveau des lignes ");
			}
			else {
				System.out.println("le choix se porte au niveau des colonnes");
			}
			
			System.out.println("choisie une case svp");
			ca[i][j]=sc.nextInt();
			System.out.println("saisir le nombre de points");
			po[i]=sc.nextInt();
			if(ca[i][j]==po[i]) {
				System.out.println("donner le nombre de points au joueur");
			}
			else {
				System.out.println(" ne lui donne pale nombre de points");
			}
			if(ca[i][j]==choisie) {
				System.out.println("la case pourra etre choisie");
			}
			else {
				System.out.println("la case ne pourra plus etere choisie merci");
			}
			
			
			}
	}
}
		
public int getCases(int position) {
	return position;
	
}
public void selectioncase(int position,int joueur) {
	if("ca[i][j]"== "j1[i][j]") {
		System.out.println("fin du jeu");
	}
	else {
		System.out.println("continuer a joue");
	}
	
}
public void setAlignementsActif(int num , int orientaion) {
	
}
}