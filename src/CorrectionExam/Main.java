package CorrectionExam;

public class Main {
    public static void main(String[] args) {
        Evaluation exam1 = new Evaluation("Exam1");
        exam1.setNote(90);

        Groupe tp1 = new Groupe("tp1");
        tp1.setNote(90);
        tp1.setNote(2);

        Evaluation exam2 = new Evaluation("Exam2");
        exam2.setNote(50);

        Groupe tp2 = new Groupe("tp2");
        tp2.setNote(20);
        tp2.setNotePairs(100);

        Evaluation exam3 = new Evaluation("Exam3");
        exam3.setNote(30);

        Groupe tp3 = new Groupe("tp3");
        tp3.setNote(100);
        tp3.setNotePairs(100);

        System.out.println(exam1.getNote());
        System.out.println(tp1.getNote());

        System.out.println(exam2.getNote());
        System.out.println(tp2.getNote());

        System.out.println(exam3.getNote());
        System.out.println(tp3.getNote());

        Cours math = new Cours(new Evaluation[]{exam1,exam2,exam3,tp1,tp2,tp3}, "Math");
        Cours philo = new Cours(new Evaluation[]{exam1,exam3,tp1,tp3}, "Math");
        System.out.println(math.isInTrouble());
        System.out.println(philo.isInTrouble());
        Etudiant max = new Etudiant(new Cours[]{math,philo}, "Fournier", "MAxime");
        max.echec();
    }
}
