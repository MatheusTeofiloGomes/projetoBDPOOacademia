package exceptions;

public class AcademiaNaoExisteException extends Exception {
	public AcademiaNaoExisteException() {
		super("Academia nao existe");
	}
}
