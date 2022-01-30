package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {

	public static void main(String[] args) {
		
		//� um conjunto (uma cole��o) que devolve naturalmente os elementos em uma ordem aleat�ria
		//por conta disso n�o possui o m�todo get para bus car um elemento pelo ID
		// n�o aceita redundancia mesma se voc� der o comanda para adicionar
		//para acessar os elementos utilizar u forEach ou o metodo foreach
		
		//Poderia utiliza ao inv�s de Set o nome da Interface m�e Colection. Dessa forma indepentende do tipo de cole��o que eu usar vai funcior, pois todas s�o filhas de Colection e a implementam 
		//exceto qando � preciso buscar um elemento pelo �ndice, pois assim como o Set, a Collection n�o o m�todo get e para isso precisaria usar uma List
	
		Collection <String> alunos = new HashSet<>();
		
		//Set<String> alunos = new HashSet<>();
		alunos.add("Rodirgo Turini");
		alunos.add("alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Jacqueline");
		alunos.add("Felipe");
		alunos.add("Bruno");
		alunos.add("Aline");
		alunos.add("Willian");
		alunos.add("Gabriel");
		
		//imprimindo com forEach
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		
		// toda cole��o possui o m�todo contins que verifica se j� existe o elemento na cole��o, mas no Set ele j� faz autom�ticamente
		//m�tos como o conteains e remove s�o executados muito mais rapidamente, pois est� utilizando um HashSet (tabela de espalhamento)
		
		//imprimindo usando o m�todo foreach
		//alunos.forEach(aluno -> {System.out.println(aluno);});
		
		System.out.println("O tamnho da Cole��o �  de " + alunos.size() + " elementos");
		
	}
	
	
	

}
