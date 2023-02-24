package collections;

import model.Pessoa;

public class TestObjeto {
	public static void main(String[] args) {
		String nome = "AC";
		System.out.println(nome);
		
		String sobrenome = null;
		System.out.println(sobrenome);
		
		// não inicializada
		String faculdade;
		
		// não compila
		// System.out.println(faculdade);
		
		Pessoa p1 = new Pessoa();
		p1.setId(1);
		p1.setNome("AC");
		
		System.out.println(p1);
		
		
	}
}
