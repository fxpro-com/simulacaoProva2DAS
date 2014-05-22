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
		time2.add("santos");
		time2.add("2");
		
		assertEquals("goias", torneioFutebol.partida(time1,time2));
	}
	
	
	@Test
	public void empateTest() {
		ArrayList<String> time1 = new ArrayList<String>();
		ArrayList<String> time2 = new ArrayList<String>();
		
		time1.add("flamengo");
		time1.add("3");
		time2.add("santos");
		time2.add("3");
		
		assertEquals("flamengo", torneioFutebol.partida(time1,time2));
	}

}
