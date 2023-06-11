package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		

		
		Department obj = new Department(500, "Diretory");
		
		
		Seller seller = new Seller (501, "jose ", "jose@gmail.com", new Date(), 20000.0,obj);
		
		System.out.println(seller);
		
	}

}
