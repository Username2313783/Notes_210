package CorrectionExam;

public class Evaluation {

    protected float note;

    protected String type= "individuelle";
    protected String nom;

    public Evaluation(String nom) {
        this.nom = nom;
    }

    public float getNote() {
        return note;
    }

    public String getNom() {
        return nom;
    }
    public void setNote(float note) {
        this.note = note;
    }
}
