import java.time.LocalDate;
import java.time.Period;

public abstract class Persoa {
    private String nome;
    private LocalDate fechaNacimiento;

    public Persoa(String nome, LocalDate fechaNacimiento) {
        this.nome = nome;
        this.fechaNacimiento = fechaNacimiento;
    }
    abstract boolean eMaiorIdade();

    protected int calcularIdade(){
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }

    @Override
    public String toString() {
        return "Persoa{" +
                "nome='" + nome + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
