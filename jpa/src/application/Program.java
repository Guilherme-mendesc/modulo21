package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(1, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Jose Joao", "joao@gmail.com");
		Pessoa p3 = new Pessoa(3, "Astolfo", "astolfo@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		

	}

}
