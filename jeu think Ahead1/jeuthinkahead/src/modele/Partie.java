package modele;

public class Partie {
int grille;
int joueur;
int listecoupsjoues;
int scores;
int m=4;
int [] pos=new int [m];
int [] num=new int[m];
public Partie(int grille, int joueur, int listecoupsjoues, int scores) {
	super();
	this.grille = grille;
	this.joueur = joueur;
	this.listecoupsjoues = listecoupsjoues;
	this.scores = scores;
}	
public int getJoueur(int joueur) {
	return joueur;
	
}
public int getgrille() {
	return grille;
	
	
}

		
	public void commencer() {
	}
	public int getScores(int scores) {
		return scores;	
	}
	public void ajoutCoup(int coup) {
		
	}
	public void annulerCoup(int nbr) {
		
	}
	}

