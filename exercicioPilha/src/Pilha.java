import java.util.Stack;


public class Pilha {

	Stack pilha = new Stack();
	
	public String empurrar() {
		pilha.push("cleiton");
		return (String) pilha.get(0);
	}

}
