import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TorneioFutebolTest {

	TorneioFutebol torneioFutebol;
	
	@Before
	public void setUp() throws Exception {
		torneioFutebol = new TorneioFutebol();
	}

	@Test
	public void ganhadorPartidatest() {
		ArrayList<String> time1 = new ArrayList<String>();
		ArrayList<String> time2 = new ArrayList<String>();
		
		time1.add("goias");
		time1.add("3");
		time1.add("santos");
		time1.add("2");
		
		assertEquals("goias", torneioFutebol.partida(time1,time2));
	}

}