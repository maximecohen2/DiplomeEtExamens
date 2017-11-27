
public class Qcm extends Examen {
	
	private int	nbQuestions;
	
	public Qcm(int nbQuestions) {
		this.nbQuestions = nbQuestions; 
	}
	
	public void setReponsesCorrectes(int nb) {
		super.setNote(nb * 20 / this.nbQuestions);
		if (nb < 8) {
			super.setAppreciation("insuffisant");
		} else if (nb >= 8 && nb < 12) {
			super.setAppreciation("passable");
		} else if (nb >= 12 && nb < 16) {
			super.setAppreciation("bien");
		} else {
			super.setAppreciation("très bien");
		}
		
	}
	
	public void setAppreciation() {
	}
	
	@Override
	public String toString() {
		return "QCM[Note: " + super.getNote() + ", Appréciation: " + super.getAppreciation() + "]";
	}
}
