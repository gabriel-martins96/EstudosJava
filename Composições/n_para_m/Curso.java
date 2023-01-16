package n_para_m;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	//Criando relação: 1 curso tem muitos alunos
	final String nome;
	final List <Aluno> listaAlunos = new ArrayList();
	
	Curso (String nome){
		this.nome = nome;
	}
	
	//relação biderecional
	//Curso A vai ter X alunos e X Alunos vão ter o Curso A
	void adicionarAluno (Aluno aluno) {
		this.listaAlunos.add(aluno);
		aluno.listaCursos.add(this);
	}
	void removerAluno(Aluno aluno) {
		this.listaAlunos.remove(aluno);
		aluno.listaCursos.remove(this);
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
