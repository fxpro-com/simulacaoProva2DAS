import java.util.ArrayList;


public class TorneioFutebol {

	public String partida(ArrayList<String> time1, ArrayList<String> time2) {
		
		int golsPrimeiroTime = Integer.parseInt(time1.get(1));
		int golsSegundoTime = Integer.parseInt(time2.get(1));
		
		if(golsPrimeiroTime > golsSegundoTime)
			return time1.get(0);
		if(golsPrimeiroTime < golsSegundoTime)
			return time2.get(0);
		else
			return time1.get(0);
	}

	public String torneio(ArrayList<ArrayList<String>> timesDoTorneio) {
		
		ArrayList<ArrayList<String>> ganhadoresPartida = new ArrayList<ArrayList<String>>();
		
		if(timesDoTorneio.size() == 2){
			return this.partida(timesDoTorneio.get(0), timesDoTorneio.get(1));
		}
		
		for(int i = 0; i<timesDoTorneio.size(); i+=2){
			ArrayList<String> ganhador = new ArrayList<String>();
			ganhador = this.mataMata(timesDoTorneio.get(i),timesDoTorneio.get(i+1));
			
			ganhadoresPartida.add(ganhador);
		}
		
		return this.torneio(ganhadoresPartida);
	}
	
public ArrayList<String> mataMata(ArrayList<String> time1, ArrayList<String> time2) {
		
		int golsPrimeiroTime = Integer.parseInt(time1.get(1));
		int golsSegundoTime = Integer.parseInt(time2.get(1));
		
		if(golsPrimeiroTime > golsSegundoTime)
			return time1;
		if(golsPrimeiroTime < golsSegundoTime)
			return time2;
		else
			return time1;
	}

}
