
public class Qcm extends Examen {
	
	private int	nbQuestions;
	
	public Qcm(int nbQuestions) {
		this.nbQuestions = nbQuestions; 
	}
	
	public void setReponsesCorrectes(int nb) {
		super.setNote(nb * 20 / this.nbQuestions);
	}
}
