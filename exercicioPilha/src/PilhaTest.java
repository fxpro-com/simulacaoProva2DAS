import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;


public class PilhaTest {
	Pilha pilha;
	
	@Before
	public void setup(){
		pilha = new Pilha();
	}
	
	@Test
	public void realizarPushtest() {
		assertEquals("cleiton", pilha.empurrar());
	}

}
