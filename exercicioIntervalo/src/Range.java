import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLEditorKit.Parser;


public class Range {
	
	int primeiroNumero, segundoNumero;
	
	public Range(String intervalo) {
		int posiVirgula=0;
		for(int i=0; i<intervalo.length(); i++){
			if(intervalo.charAt(i)== ','){
				posiVirgula=i;
			}
		}
		String num1 = intervalo.substring(1, posiVirgula);
		String num2 = intervalo.substring(posiVirgula+1, intervalo.length()-1);
		
		primeiroNumero = Integer.parseInt(num1);
		segundoNumero = Integer.parseInt(num2);
		
		if(intervalo.charAt(0) == '(')
			primeiroNumero++;
		if(intervalo.charAt(intervalo.length()-1) == ')')
			segundoNumero--;
	}

	public String constroeIntervalo() {
		String retorno = "";
		for(int i=primeiroNumero; i<=segundoNumero; i++){
			retorno+=i;
			if(i!=segundoNumero){
				retorno+=",";
			}
		}
		return retorno;
	}
}
