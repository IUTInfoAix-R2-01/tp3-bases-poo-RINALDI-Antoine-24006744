package exoprof;

public class Livre {
	private double price;
	private String name;
	private int quantite;
	
	public Livre(double price,String name, int quantite) {
		this.price = price;
		this.name = name;
		this.quantite = quantite;
	}
	
	public double getPrice(){
		return price;
	}
	public String getName() {
		return name;
	}
	public int getQuantite() {
		return quantite;
	}
}
