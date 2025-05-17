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
        alumnos.add(mago);
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
    
}
