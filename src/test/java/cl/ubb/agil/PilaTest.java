package cl.ubb.agil;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class PilaTest {
	
	@Test
	public void CreatePila() {
		Pila pil = new Pila();
	}
	
	@Test
	public void agregaunostacknovacio(){
		
		Pila pil = new Pila();
		
		boolean result = pil.pilavacia();
		
		assertThat (result,is(true));
		
	}

}
