package n_para_m;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("José");
		
		Curso curso1 = new Curso ("Java completo");
		Curso curso2 = new Curso ("Web completo");
		Curso curso3 = new Curso ("React completo");
		
		aluno1.adicionarCurso(curso1);
		curso1.adicionarAluno(aluno1);
		
		//Prova da relação bidirecional
		for (Curso curso: aluno1.listaCursos) {
			System.out.println(curso.nome);
		}
		
		System.out.println(aluno1.procurarCurso("Java completo")); 
		System.out.println(aluno1.procurarCurso("Olheira"));
		
		//jeito complicado de mostrar do Leo: Nome do Curso + Nome dos alunos
		Curso cursoEncontrado = aluno1.procurarCurso("Java completo");
		if (cursoEncontrado != null) {
			//exiba:
			System.out.println("Exibir:");
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.listaAlunos);
		}
	}
}
