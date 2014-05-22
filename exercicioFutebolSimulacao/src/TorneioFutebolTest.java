import static org.junit.Assert.*;

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
		
		assertArrayEquals("goias", torneioFutebol.partida());
	}

}
