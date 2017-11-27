
public class Projet extends Examen {

	public void setNote(int noteEcrite, int noteOrale) {
		super.setNote(noteEcrite + noteOrale);
	}
}
