
public class AcademiaFacade implements InterfaceAcademia{

	@Override
	public void cadastrarAluno(Aluno aluno, Academia academia) throws AlunoJaExisteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAluno(Integer idAluno) throws AlunoNaoExisteException {
		DAO<Aluno> dao = new DAO<>();
		Aluno aluno = dao.find(Aluno.class, idAluno);
		if(aluno == null) {
			throw new AlunoNaoExisteException();
		}
		dao.remove(aluno);
	}

	@Override
	public void cadastrarProfessor(Instrutor instrutor, Academia academia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarExercicios(Exercicio exercicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarPreescricao(Preescricao preecricao) throws PreescriçãJaExiste {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarAvaliacaoNeumotora(AvaliacaoNeumotora avaliacaoNeumotora) {
		// TODO Auto-generated method stub
		
	}

}
