package CorrectionExam;

public class Etudiant {
    protected String nomComplet;
    protected Cours[] cours;

    public Etudiant(String nomComplet,Cours[] cours) {
        this.nomComplet = nomComplet;
        this.cours = cours;
    }
    public void echec(){
        for(Cours cour : cours){
            if(cour.isInTrouble()){

            }
        }
    }
}
