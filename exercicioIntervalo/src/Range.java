import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLEditorKit.Parser;


public class Range {

	ArrayList<String> numerosContidosNoIntervalo;
	char primeiro, segundo;
	
	public Range(String intervalo) {
		this.numerosContidosNoIntervalo = new ArrayList<String>();
		
		primeiro = intervalo.charAt(1);
		segundo = intervalo.charAt(3);
	
		for(int i = primeiro-48; i <= segundo-49; i++){
			numerosContidosNoIntervalo.add(String.valueOf(i));
		}
	}

	public String constroeIntervalo() {
		java.util.Iterator<String> iterator = numerosContidosNoIntervalo.iterator();
		String retorno = null;
		int contadorNumeros = 0;
		
		while(iterator.hasNext()){
			contadorNumeros++;
			if(numerosContidosNoIntervalo.size() != contadorNumeros)
				retorno += iterator.next() + ",";
			else
				retorno = iterator.next();
		}
		System.out.println(primeiro);
		System.out.println(segundo);
		System.out.println(numerosContidosNoIntervalo);
		
		return retorno;
	}
}
