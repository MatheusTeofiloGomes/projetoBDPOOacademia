import javax.persistence.criteria.CriteriaBuilder.In;

import exceptions.AcademiaNaoExisteException;
import exceptions.AlunoJaExisteException;
import exceptions.AlunoNaoExisteException;

public class AcademiaFacade implements InterfaceAcademia {

	private DAO<Academia> daoAcademia;
	private DAO<Aluno> daoAluno;
	private DAO<Instrutor> daoProf;
	private DAO<Exercicio> daoExercicio;

	@Override
	public void cadastrarAluno(Aluno aluno, Academia academia) throws AlunoJaExisteException,
			AcademiaNaoExisteException, AlunoNaoExisteException, AlunoJaCadastradoException {
		if (aluno == null) {
			throw new AlunoNaoExisteException();
		} else if (academia == null) {
			throw new AcademiaNaoExisteException();
		} else if (aluno.equals(daoAluno.find(Aluno.class, aluno.getId()))) {
			throw new AlunoJaExisteException();
		}
		Academia a = daoAcademia.find(Academia.class, academia.getNumeroAlvara());
		if (a.getAluno().contains(aluno)) {
			throw new AlunoJaCadastradoException();
		}

		a.getAluno().add(aluno);
		daoAcademia.update(a);
	}

	@Override
	public void removerAluno(Integer idAluno) throws AlunoNaoExisteException {
		DAO<Aluno> dao = new DAO<>();
		Aluno aluno = dao.find(Aluno.class, idAluno);
		if (aluno == null) {
			throw new AlunoNaoExisteException();
		}
		dao.remove(aluno);
	}

	@Override
	public void cadastrarProfessor(Instrutor instrutor, Academia academia) throws ProfessorJaExisteException,
			AcademiaNaoExisteException, ProfessorNaoExisteException, InstrutorJaCadastradoException {
		if (instrutor == null) {
			throw new ProfessorNaoExisteException();
		} else if (academia == null) {
			throw new AcademiaNaoExisteException();
		} else if (instrutor.equals(daoProf.find(Instrutor.class, instrutor.getCref()))) {
			throw new ProfessorJaExisteException();
		}
		Academia a = daoAcademia.find(Academia.class, academia.getNumeroAlvara());
		if (a.getInstrutores().contains(instrutor)) {
			throw new InstrutorJaCadastradoException();
		}

		a.getInstrutores().add(instrutor);
		daoAcademia.update(a);
	}

	@Override
	public void removerProfessor(Integer idProfessor) throws ProfessorNaoExisteException {
		if (idProfessor == null) {
			throw new ProfessorNaoExisteException();
		}
		if (daoProf.find(Instrutor.class, idProfessor) == null) {
			throw new ProfessorNaoExisteException();
		}
		Instrutor in = daoProf.find(Instrutor.class, idProfessor);
		daoProf.remove(in);
	}

	@Override
	public void cadastrarExercicios(Exercicio exercicio, Academia academia)
			throws ExercicioJaExisteException, AcademiaNaoExisteException, ExercicioJaCadastradoException {
		if (exercicio == null) {
			throw new ProfessorNaoExisteException();
		} else if (academia == null) {
			throw new AcademiaNaoExisteException();
		} else if (exercicio.equals(daoExercicio.find(Exercicio.class, exercicio.getId()))) {
			throw new ExercicioJaExisteException();
		}
		Academia a = daoAcademia.find(Academia.class, academia.getNumeroAlvara());
		if (a.getInstrutores().contains(exercicio)) {
			throw new InstrutorJaCadastradoException();
		}

		a.getExercicios().add(exercicio);
		daoAcademia.update(a);
	}

	@Override
	public void removerExercicio(Exercicio exercicio, Academia academia) throws ExercicioNaoExisteException {
		if (exercicio == null) {
			throw new ProfessorNaoExisteException();
		} else if (academia == null) {
			throw new AcademiaNaoExisteException();
		} else if (daoAcademia.find(Academia.class, academia.getNumeroAlvara()) == null) {
			throw new AcademiaNaoExisteException();
		} else if (daoExercicio.find(Exercicio.class, exercicio.getId()) == null) {
			throw new ExercicioNaoExisteException();
		} else if(!academia.getExercicios().contains(exercicio)) {
			throw new ExercicioForaDaAcademiaException();
		}
		
		Academia a = daoAcademia.find(Academia.class, academia.getNumeroAlvara());
		a.getExercicios().remove(exercicio);
		daoAcademia.update(a);

	}

	@Override
	public void cadastrarPreescricao(Preescricao preecricao) throws PreescriçãJaExiste {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrarAvaliacaoNeumotora(AvaliacaoNeumotora avaliacaoNeumotora) {
		// TODO Auto-generated method stub

	}

	public DAO<Academia> getDao() {
		return dao;
	}

	public void setDao(DAO<Academia> dao) {
		this.dao = dao;
	},

}
