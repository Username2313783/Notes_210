package CorrectionExam;

public class Groupe extends Evaluation{
    protected float notePairs;


    public Groupe(String nom) {
        super(nom);
        this.type = "Groupe";
    }

    @Override

    public float getNote() {
        return (float)(getNote()*.9 + notePairs*.1);
    }
    public float setNotePairs(float notePairs){
        this.notePairs = notePairs;
    }
}
