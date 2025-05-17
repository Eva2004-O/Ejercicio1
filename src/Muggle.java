import java.time.LocalDate;

public class Muggle extends Persoa{
    private boolean crearMaxia;

    public Muggle(String nome, LocalDate fechaNacimiento) {
        super(nome, fechaNacimiento);
        crearMaxia = false;
    }

    public Muggle(String nome, LocalDate fechaNacimiento, boolean crearMaxia) {
        super(nome, fechaNacimiento);
        this.crearMaxia = crearMaxia;
    }

    @Override
    public boolean eMaiorIdade() {
        if (calcularIdade() > 18) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Muggle{" +
                "crearMaxia=" + crearMaxia +
                '}';
    }
}
