package modele;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestthinkAhead {

	public static void main(String[] args) {
	
	Grille g =new Grille(0, 0);
		Joueur j=new Joueur();
		Coup c =new Coup(0, 0, null);
		AlignementCase a=new AlignementCase(0, 0, 0);
		g.cases();
		g.selectioncase(0, 0);
		c.jouecoup();
		c.positioncase();
	a.getCasesLibre(0);
	a.getCaseLibreValeurMax(0);
		j.ajoutenposition("aicha,awa,rama,fatou ,awa,jojo",5);
	}
}


