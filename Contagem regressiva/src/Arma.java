
public class Arma {
	
	public boolean temBala(int qntBalas) {
		ContagemRegressiva.detectaTempo();
		if(qntBalas > 0)
			return true;
		else
			return false;
	}

}
