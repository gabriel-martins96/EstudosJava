package Queues;
import java.util.LinkedList;
import java.util.Queue;
public class Queues {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//Adição
		//a)Tradicional - retorna exceção, se fila cheia
		fila.add("Ana");
		
		//b)Com restrição de quantidade - retorna boolean, se fila cheia	
		fila.offer("José");
		
		//Obtendo elemento da fila:
		System.out.println(fila.peek()); //return null
		System.out.println(fila.element()); //return exception
		
		
		//Outros métodos: size, clear, isEmpty, poll (chama e remove da fila), contains...
		
		
	}

}
