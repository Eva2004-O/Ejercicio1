import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Random;

public class Profesor extends Mago implements Docente {
    private static final String[] frases = new String[]{"Non é bo deixarse arrastrar polos soños e esquecer vivir", "A valentía sempre é a mellor opción"};

    public Profesor(String nome, LocalDate fechaNacimiento, String tipoVasoira, Casa casa) {
        super(nome, fechaNacimiento, tipoVasoira, casa);
    }

    @Override
    public void imponerDisciplina() {
        System.out.println("Silencio Totalis");
    }

    @Override
    public void disciplinar() {
        Random r1 = new Random();
        int fraseEscogida = r1.nextInt(frases.length);
        System.out.println(frases[fraseEscogida]);
    }
}
