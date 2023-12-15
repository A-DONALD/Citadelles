package donald.fr.unitTest;

import donald.fr.modele.Assassin;
import donald.fr.modele.Joueur;
import donald.fr.modele.PlateauDeJeu;
import donald.fr.modele.Roi;

public class TestAssassin {
	public static void main(String[] args) {
		TestAssassin test = new TestAssassin();
		test.test1();
		test.test2();
	}
	
	public void test1() {
		System.out.println("TEST DU CONSTRUCTEUR");
		PlateauDeJeu plateau = new PlateauDeJeu();
		Roi roi = new Roi();
		plateau.ajouterPersonnage(roi);
		Assassin assassin = new Assassin();
		plateau.ajouterPersonnage(assassin);
		Test.test(plateau.getNombrePersonnages()== 2,"nombre de joueurs");
		Test.test(plateau.getPersonnage(1)==assassin,
				"recuperation du personnage de l'assassin");
		Test.test(plateau.getPersonnage(1).getRang()==1,
				"recuperation du rang");
	}
	public void test2() {
		System.out.println("TEST DE L'ASSASSINAT DU ROI");
		PlateauDeJeu plateau = new PlateauDeJeu();
		Roi roi = new Roi();
		plateau.ajouterPersonnage(roi);

		Joueur joueur = new Joueur("Billy");
		Assassin assassin = new Assassin();
		assassin.setJoueur(joueur);
		plateau.ajouterPersonnage(assassin);
		
		// on utilise le pouvoir de l'assassin
		// NB: seul le roi peut etre assassine dans cette situation
		assassin.utiliserPouvoirAvatar();
		Test.test(roi.getAssassine(),"le roi est assassine");
	}
	
}
