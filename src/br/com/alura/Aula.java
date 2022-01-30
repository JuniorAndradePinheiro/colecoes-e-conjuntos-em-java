package br.com.alura;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	
	//Reescrevendo o compareTo da SuperClasse Object pois o m�todo como est� vai passar o pacote e o hashcode, dessa forma definimos oque o toString vai retornar
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aula:" + this.titulo + ", " + this.tempo + "minuto(s)]";
	}

	
	//implementando o m�todo compareTo da interface Comparable para que dessa forma as aulas sejam ordenas pelo t�tulo
	@Override
	public int compareTo(Aula outraAula) {
		
		return this.titulo.compareTo(outraAula.titulo);
	}
}	
	