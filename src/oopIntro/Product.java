package oopIntro;

public class Product { // product=ürün

	public Product() { // constructor(yapýcý) bloðu
		System.out.println("Ben çalýþtým");
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
