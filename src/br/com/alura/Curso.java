package br.com.alura;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	// Cria uma map que n�o que cria uma rela��o entre chave e elemento, mas nao guarda a ordem d inser��o
	//private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	//Aqui tamb� cria um map mas dessa vez, assim como o linkedHashSet , esse tamb�m guarda  a ordem de inser��o
	private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
	//Tem essa cole��o LinkedHashSet que diferente do HashSet ele devolve a ordem de inser��o qundo percorrer a lista mas n�o ossui get para buscar elemento pelo �ndice
	private Set<Aluno> alunos = new LinkedHashSet<>();
	
	//Tem tamb�m essa op��o com TreeSet, que devolve o elementos na ordem do comparator as isso implica que a classe em que ser compar�vel, ou seja implements Comparable ou passar um Comparator no contrutor dessa estrutura. busca quase t�o r�pida quanto a tabela de espalhamento do HashSet que se chama �rvore rubronegra
	//private Set<Aluno> alunos = new TreeSet<>();

	
	//private Set<Aluno> alunos = new HashSet<>();
	

	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		
		return Collections.unmodifiableList(aulas);
		
		//dessa forma outra pessoa ainda pode adicionar uma aula na lista usando a referencia entre os objetos, que nesse caso � "aulas"
		//return aulas;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}	
	
	public int getTempoTotal(){
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		
		return tempoTotal;	
	}
	
	@Override
	public String toString() {
		
		return "[Curso: " + nome  + " minutos - Aula: " + this.aulas + " | Tempo total: " + this.getTempoTotal() + " - Instrutor: "+ this.instrutor + "]";
	}

	public void matricula(Aluno aluno) {
		// adiciona no Set de alunos
		this.alunos.add(aluno);
		
	    // cria a rela��o no Map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {

		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == (numero))
//			return aluno;
//		}
//		throw new NoSuchElementException("Matricula n�o encontrada " + numero);
		
		//Utilizando o Map � possivel fazer uma associa��o entre aluno e amatricula ou outro atributo que a classe tenha
		//basta chamar o map que foi declarado nos atributos e passar o valor que est� no par�metro. Caso n�o encotre o parametro ele por padr�o retorna null
		//return matriculaParaAluno.get(numero);
		
		//caso eu queira que ele retorne uma Exception basta eu colocar a linha acima dentro de um if, como farei a seguir
		
		if(!matriculaParaAluno.containsKey(numero)) 
			throw new NoSuchElementException("Matricula n�o localizada");
			return matriculaParaAluno.get(numero);
	
		
	}

	
}
