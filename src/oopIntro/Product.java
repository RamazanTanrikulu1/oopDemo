package oopIntro;

public class Product { // product=�r�n

	public Product() { // constructor(yap�c�) blo�u
		System.out.println("Ben �al��t�m");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice; // unitPrice=fiyat
	String detail; // detail=detay

}
