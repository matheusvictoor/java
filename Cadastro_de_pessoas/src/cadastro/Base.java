package cadastro;

public class Base {
	
	private Tarefa[] tarefas;
	private Pessoa[] pessoas;
	
	public Base() {
		this.tarefas = new Tarefa[1000];
		this.pessoas = new Pessoa[1000];
		
	}
	
	public void cadastraTarefa(String nome, int tempo, String local) {
		for(int i = 0; i < this.tarefas.length; i++) {
			if(this.tarefas[i] == null) {
				this.tarefas[i] = new Tarefa(nome, tempo, local);
				break;
			}
		}
	}
}
