package modele;

import java.util.Scanner;

public class AlignementCase {
int orientation;
int lescases;
int position;
int m=6;
int []num=new int[m];
int [] []cases=new int [m][m];
int [][] max=new int[m][m];
int [][] min= new int[m][m];

public AlignementCase(int orientation, int lescases, int position) {
	super();
	this.orientation = orientation;
	this.lescases = lescases;
	this.position = position;
}
public int getCaseNum(int numero) {
	
	return numero;
}
public int getCasesLibre(int caselibre) {
	for(int i=0;i<num.length;i++) {
	Scanner sc =new Scanner(System.in);
	System.out.println("saisir encore les numeros");
	num[i]=sc.nextInt();
	if("num[i]"!=null) {
		System.out.println("ne choisie pas la case");
	}

	else {
		System.out.println("choisie une case");
	}
	}
	return caselibre;
	
}
public int getCaseLibreValeurMax(int caselibrevaleurmax) {
for(int i=0;i<cases.length;i++) {
	Scanner sc=new Scanner(System.in);
	System.out.println("sasir les cases");
	int j = 0;

	cases[i][j]=sc.nextInt();
		System.out.println("Saisir les valeurs maximales");
		if("cases[i][j]"==null && cases[i][j]>max[i][j]) {
			cases[i][j]=max[i][j];
			max[i][j]=sc.nextInt();
	}
		
		}
	

	
return caselibrevaleurmax;
}
}

