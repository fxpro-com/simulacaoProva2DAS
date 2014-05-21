import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RangeTest {

	private Range range;
	
	@Before
	public void setUp() throws Exception {
		range = new Range("[1,4]");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando");
	}

	@Test
	public void contruirIntervalotest() {
		/*ArrayList<String> cadastro = new ArrayList<String>();
		cadastro.add("1");
		cadastro.add("2");
		cadastro.add("3");*/
		
		assertEquals("1,2,3", range.constroeIntervalo());
	}

}
