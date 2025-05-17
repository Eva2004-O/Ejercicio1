import java.time.LocalDate;

public class Mago extends Persoa{
    String TipoVasoira;
    Casa casa;

    public Mago(String nome, LocalDate fechaNacimiento, String tipoVasoira, Casa casa) {
        super(nome, fechaNacimiento);
        TipoVasoira = tipoVasoira;
        this.casa = casa;
    }

    @Override
    public boolean eMaiorIdade() {
        if (calcularIdade() >= 17) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mago{" +
                "TipoVasoira='" + TipoVasoira + '\'' +
                ", casa=" + casa +
                ", nome='" + nome + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
