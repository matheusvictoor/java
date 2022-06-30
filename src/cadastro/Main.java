package cadastro;

public class Main {

	public static void main(String[] args) {
		
		Base base = new Base();
		
		// era para ser capturado do usuário, mas estou simplificando a entrada
		String nome = "Ativar reator";
		int tempo = 2;
		String local = "reator";
		
		base.cadastraTarefa(nome, tempo, local);

	}

}
