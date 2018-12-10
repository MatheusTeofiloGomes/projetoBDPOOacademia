
public interface InterfaceAcademia {
	public void cadastrarAluno(Aluno aluno, Academia academia) throws AlunoJaExisteException;
	public void removerAluno(Integer idAluno) throws AlunoNaoExisteException;
	public void cadastrarProfessor(Instrutor instrutor, Academia academia);
	public void cadastrarExercicios(Exercicio exercicio);
	public void cadastrarPreescricao(Preescricao preecricao) throws PreescriçãJaExiste;
	public void cadastrarAvaliacaoNeumotora(AvaliacaoNeumotora avaliacaoNeumotora);
	

}
