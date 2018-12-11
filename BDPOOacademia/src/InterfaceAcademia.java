import exceptions.AcademiaNaoExisteException;
import exceptions.AlunoJaExisteException;
import exceptions.AlunoNaoExisteException;

public interface InterfaceAcademia {
	public void cadastrarAluno(Aluno aluno, Academia academia)
			throws AlunoJaExisteException, AcademiaNaoExisteException, AlunoJaCadastradoException;

	public void removerAluno(Integer idAluno) throws AlunoNaoExisteException;

	public void cadastrarProfessor(Instrutor instrutor, Academia academia)throws ProfessorJaExisteException, AcademiaNaoExisteException, ProfessorNaoExisteException, InstrutorJaCadastradoException ;

	public void removerProfessor(Integer idProfessor) throws ProfessorNaoExisteException;

	public void cadastrarExercicios(Exercicio exercicio, Academia academia) throws ExercicioJaExisteException, AcademiaNaoExisteException, ExercicioJaCadastradoException;

	public void removerExercicio(Exercicio exercicio, Academia academia) throws ExercicioNaoExisteException;
	
	public void cadastrarPreescricao(Preescricao preecricao) throws PreescriçãJaExiste;

	public void cadastrarAvaliacaoNeumotora(AvaliacaoNeumotora avaliacaoNeumotora);
}
