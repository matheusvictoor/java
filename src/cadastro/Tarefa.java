package cadastro;

import java.util.Objects;

public class Tarefa {

	private String nome;
	private int tempo;
	private String local;
	
	public Tarefa(String nome, int tempo, String local) {
		//verifica se os atributos nome e local são nulos
		if(nome == null || local == null) {
			throw new NullPointerException();		
		}
		//verifica se os atributos nome e local são vazios
		if(nome.equals("") || local.equals("")) {
			throw new IllegalArgumentException();		
		}
		this.nome = nome;
		this.tempo = tempo;
		this.local = local;
	}
	
	@Override
	public int hashCode() {
		//ou return this.nome.equals()
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa t = (Tarefa) obj;
		//ou return this.nome.equals(t.nome);
		return Objects.equals(nome, t.nome);
	}
}
