import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2000, 12, 13);
        LocalDate fecha2 = LocalDate.of(2010, 5, 30);
        LocalDate fecha3 = LocalDate.of(1900, 4, 21);
        Muggle mu1 = new Muggle("Veron", fecha1);
        Muggle mu2 = new Muggle("Petunia", fecha2, true);
        Mago ma1 = new Mago("Harry", fecha2, "Saeta de Fuego", Casa.GRYFFINDOR);
        Profesor p1 = new Profesor("Minerva", fecha3, "Saeta de Fuego", Casa.RAVENCLAW);
        System.out.println(mu1.eMaiorIdade());
        System.out.println(mu2);
        System.out.println(ma1);
        System.out.println(ma1.eMaiorIdade());
        System.out.println(p1);
        p1.disciplinar();
        p1.imponerDisciplina();
    }
}