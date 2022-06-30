package cadastro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TarefaTest {
	
	@Test
	void testaConstrutorNomeNulo() {
		try {
			new Tarefa(null, 2 , "reator");
			fail("Esperado NPE quando o nome for nulo");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	void testaConstrutorNomeVazio() {
		try {
			new Tarefa("", 2 , "reator");
			fail("Esperado NPE quando o nome for nulo");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	
	@Test
	void testaHashCode(){
		
		Tarefa t1 = new Tarefa("abc", 2, "reator");
		Tarefa t2 = new Tarefa("abc", 3, "cafeteria");
		assertEquals(t1.hashCode(), t2.hashCode());
	}
	

	@Test
	void assertEqualsObjetosIguais(){
		
		Tarefa t1 = new Tarefa("abc", 2, "reator");
		Tarefa t2 = new Tarefa("abc", 3, "cafeteria");
		assertEquals(t1, t2);
	}
	
	
	@Test
	void assertEqualsObjetosDiferentes(){
		
		Tarefa t1 = new Tarefa("abc", 2, "reator");
		Tarefa t2 = new Tarefa("def", 3, "cafeteria");
		assertNotEquals(t1, t2);
	}
	
}

