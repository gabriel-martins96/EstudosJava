package n_para_m;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	//Colocar os atributos de instância como final
	final String nome;
	final List <Curso> listaCursos = new ArrayList(); //O que será constante é o endereço de memória que está apontado, não os elementos da lista
	
	Aluno (String nome){
		this.nome = nome;
	}
	//Relação bidirecional
	void adicionarCurso(Curso curso) {
		this.listaCursos.add(curso);
		curso.listaAlunos.add(this);	
	}
	void removerCurso(Curso curso) {
		this.listaCursos.remove(curso);
		curso.listaAlunos.remove(this);
	}
	
	//Encontrar curso pelo nome
	/*Qual o verbo? 
	 * R:procurarCurso
	 *  O quê eu vou procurar?
	 *  R: Um objeto pelo nome
	 *  Como eu faço isso?
	 *  R: Através de um ForEach e vendo se há equivalência entre minha String e a String atributo de instância nome
	 * */
	Curso procurarCurso(String nome) {
		for (Curso curso: this.listaCursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		System.out.println("Curso não encontrado");
		return null;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}
	
	
}
