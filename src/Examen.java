
public class Examen {
	
	private int	note;
	private String appreciation;

	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}

	public int getNote() {
		return this.note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Examen[Note: " + this.note + ", Appréciation: " + this.appreciation + "]";
	}
		
}
