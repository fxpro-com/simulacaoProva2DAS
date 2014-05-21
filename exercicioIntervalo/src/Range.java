import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLEditorKit.Parser;


public class Range {
	
	int primeiro, segundo;
	
	public Range(String intervalo) {
		int posiVirgula=0;
		for(int i=0; i<intervalo.length(); i++){
			if(intervalo.charAt(i)== ','){
				posiVirgula=i;
			}
		}
		String num1 = intervalo.substring(1, posiVirgula);
		String num2 = intervalo.substring(posiVirgula+1, intervalo.length()-1);
		
		primeiro = Integer.parseInt(num1);
		segundo = Integer.parseInt(num2);
	}

	public String constroeIntervalo() {
		String retorno = "";
		for(int i=primeiro; i<=segundo; i++){
			retorno+=i;
			if(i!=segundo){
				retorno+=",";
			}
		}
		return retorno;
	}
}
