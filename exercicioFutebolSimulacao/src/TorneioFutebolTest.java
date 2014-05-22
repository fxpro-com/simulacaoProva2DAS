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
	
	@Test
	public void torneioTest() {
		
		ArrayList<ArrayList<String>> timesDoTorneio = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> time1 = new ArrayList<String>();
		ArrayList<String> time2 = new ArrayList<String>();
		ArrayList<String> time3 = new ArrayList<String>();
		ArrayList<String> time4 = new ArrayList<String>();
		ArrayList<String> time5 = new ArrayList<String>();
		ArrayList<String> time6 = new ArrayList<String>();
		ArrayList<String> time7 = new ArrayList<String>();
		ArrayList<String> time8 = new ArrayList<String>();
		
		time1.add("flamengo");
		time1.add("3");
		timesDoTorneio.add(time1);
		time2.add("santos");
		time2.add("3");
		timesDoTorneio.add(time2);
		time3.add("goias");
		time3.add("1");
		timesDoTorneio.add(time3);
		time4.add("fluminense");
		time4.add("0");
		timesDoTorneio.add(time4);
		time5.add("palmeiras");
		time5.add("4");
		timesDoTorneio.add(time5);
		time6.add("figueirense");
		time6.add("2");
		timesDoTorneio.add(time6);
		time7.add("corinthians");
		time7.add("3");
		timesDoTorneio.add(time7);
		time8.add("bahia");
		time8.add("9");
		timesDoTorneio.add(time8);
		
		
		assertEquals("bahia", torneioFutebol.torneio(timesDoTorneio));
	}

}
