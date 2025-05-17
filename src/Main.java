import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2000, 12, 13);
        LocalDate fecha2 = LocalDate.of(2010, 5, 30);
        LocalDate fecha3 = LocalDate.of(1900, 4, 21);
        Muggle mu1 = new Muggle("Veron", fecha1);
        Muggle mu2 = new Muggle("Petunia", fecha2, true);
        Mago ma1 = new Mago("Harry", fecha2, "Saeta de Fuego", Casa.GRYFFINDOR);
        Mago ma2 = new Mago("Salazar", fecha1, "Saeta de Fuego", Casa.HUFFLEPUF);
        Profesor p1 = new Profesor("Minerva", fecha3, "Saeta de Fuego", Casa.RAVENCLAW);
        Profesor p2 = new Profesor("Remus", fecha3, "Saeta de Fuego", Casa.HUFFLEPUF);
        Hogwarts h1 = new Hogwarts();
        h1.engadirAlumno(ma1);
        h1.engadirAlumno(ma2);
        System.out.println(h1);
        h1.graduar(ma1);
        System.out.println(h1);
        System.out.println(mu1.eMaiorIdade());
        System.out.println(mu2);
        System.out.println(ma1);
        System.out.println(ma1.eMaiorIdade());
        System.out.println(p1);
        p1.disciplinar();
        p1.imponerDisciplina();
        h1.asignarProfesor(p1,"Magia");
        h1.asignarProfesor(p2, "Volar con escoba");
        h1.listarProfesores();
        System.out.println(h1.alumnadoCasa(Casa.RAVENCLAW));

    }
}