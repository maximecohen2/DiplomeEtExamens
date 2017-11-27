
public class Qcm extends Examen {
	
	private int	_nbQuestions;
	
	public Qcm(int nbQuestions) {
		this._nbQuestions = nbQuestions; 
	}
	
	public void setReponsesCorrectes(int nb) {
		super.setNote(nb * 20 / this._nbQuestions);
	}
}
