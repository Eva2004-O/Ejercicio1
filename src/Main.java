import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2000, 12, 13);
        LocalDate fecha2 = LocalDate.of(2010, 5, 30);
        Muggle m1 = new Muggle("Veron", fecha1);
        Muggle m2 = new Muggle("Petunia", fecha2, true);
        System.out.println(m1.eMaiorIdade());
        System.out.println(m2);
    }
}