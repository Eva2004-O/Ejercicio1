import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Hogwarts {
    private ArrayList<Mago> alumnos;
    HashMap<String, Profesor> materias;

    public Hogwarts() {
        alumnos = new ArrayList<>();
        materias = new HashMap<>();
    }

    public void engadirAlumno(Mago mago){
        Casa[] casas = Casa.values();
        Random r1 = new Random();
        int casaRandom = r1.nextInt(casas.length);
        mago.casa = casas[casaRandom];
        alumnos.add(mago);
    }

    public void graduar(Mago mago){
        Iterator<Mago> iterador = alumnos.iterator();
        while (iterador.hasNext()){
            Mago magos = iterador.next();
            if (magos == mago){
                iterador.remove();
            }
        }
    }
    public void  asignarProfesor(Profesor profesor, String materia){
        materias.put(materia,profesor);
    }
    public void listarProfesores(){
        Iterator<String> iterator = materias.keySet().iterator();
        while (iterator.hasNext()){
            String materia = iterator.next();
            System.out.println("La materia: "+ materia + " es impartida por el profesor " + materias.get(materia));
        }
    }

    public ArrayList<Mago> alumnadoCasa(Casa casa){
        ArrayList<Mago> alumnado = new ArrayList<>();
        for (Mago mago : alumnos){
            if (mago.casa.equals(casa)){
                alumnado.add(mago);
            }
        }
        return alumnado;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "alumnos=" + alumnos +
                '}';
    }
}
