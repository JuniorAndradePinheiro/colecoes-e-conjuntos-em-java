package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as Cole��es do Java", "Paulo Silveira");
	
		javaColecoes.adiciona(new Aula("Dominando as Cole��es do Java", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Cole��es", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os Alunos:");
		
		
		//A forma mais antiga de se percorrer uma cole��o � utilizando o iterator no java 5 ainda
		
		// Set do tipo Alunos  vindo de javaColecoes.getAlunos()
		Set<Aluno> alunos = javaColecoes.getAlunos();

		//Criei um iterador para Aluno que que recebe esses paramentros por meio de um m�todo iterator que todas as cole��es possui
		Iterator<Aluno> iterador = alunos.iterator();
		
		
		//normalmete se utilizava o while para percorrer a cole��o
		//O m�todo hasNext() de iterator verifica se tem um proximo elemento na lista
		while(iterador.hasNext()) {
			
			//o m�todo next() pega o p�ximo elemento da lista e est� jogando na variavel proximo
			Aluno proximo = iterador.next();
			
			//imprime o a variavel proximo
			System.out.println(proximo);
		}
		
		
		
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		
		
		
		
		System.out.println("O aluno " + a1 +" est� maticulado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		
		//para comparar um elemento em cole��es � necess�rio sobreescrever o m�todo equalls
		//comparando de um elemento � igual a outro
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println(a1.equals(turini));
		
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}
	
}
