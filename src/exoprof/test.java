package exoprof;

public class test {

	public static void main(String[] args) {
		Livre l1 = new Livre(1000000,"Le Livre De La Jungle",10);
		System.out.println("Le premier livre disponible est à " + l1.getPrice() + "€.");
		System.out.println("C'est " + l1.getName() + ".");
		System.out.println("Il reste actuellement " + l1.getQuantite() + " exemplaires disponibles.");
		
		Livre l2 = new Livre(42.42,"Les Aventures De Pinocchio",42);
		System.out.println("Le deuxième livre disponible est à " + l2.getPrice() + "€.");
		System.out.println("C'est " + l2.getName() + ".");
		System.out.println("Il reste actuellement " + l2.getQuantite() + " exemplaires disponibles.");
	}

}