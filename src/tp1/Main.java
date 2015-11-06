package tp1;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		int x = p.getX();
		System.out.println("x=" + x);
		p.setX(4);
		x = p.getX();
		System.out.println("x=" + x);
		
		Etudiant etudiant = new Etudiant("Tintin");
		System.out.println("Etudiant = " + etudiant.getNom());
		
		etudiant.setNom("Hadock");
		System.out.println("Etudiant = " + etudiant.getNom());
	}

}
