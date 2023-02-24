package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.plaf.synth.SynthSeparatorUI;

import model.Pessoa;

public class Listas {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa();
		p1.setId(1);
		p1.setNome("AC");
		
		pessoas.add(p1);
		
		p1 = new Pessoa();
		p1.setId(2);
		p1.setNome("Pelé");
		
		pessoas.add(p1);

		System.out.println(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getId());
		} 
		
		pessoas.forEach(pessoa -> {
			System.out.println("Pessoa " + pessoa.getId());
		});
		
		Optional<Pessoa> p2 = pessoas.stream()
				.filter(pessoa -> pessoa.getId().equals(3))
				.findAny();
		
		if (p2.isPresent()){
			System.out.println("isPresent " +  p2.get());
		}
		
		Pessoa p3 = pessoas.stream()
				.filter(pessoa -> pessoa.getId().equals(3))
				.findAny()
				.orElse(null);
		System.out.println("com orElse " + p3);

				
	}
}
