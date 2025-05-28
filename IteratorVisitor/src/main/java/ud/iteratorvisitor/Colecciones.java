package ud.iteratorvisitor;

import java.util.*;

public class Colecciones {
    public static List<Estudiante> getEstudiantesArrayList() {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("E1", "Ana", "Calle 1", null));
        lista.add(new Estudiante("E2", "Luis", "Calle 2", "12345"));
        return lista;
    }

    public static Set<Estudiante> getEstudiantesTreeSet() {
        Set<Estudiante> set = new TreeSet<>(Comparator.comparing(Persona::getCodigo));
        set.add(new Estudiante("E3", "Carla", null, "54321"));
        set.add(new Estudiante("E4", "Pablo", "Calle 4", "98765"));
        return set;
    }
//Aqui van las colecciones de los profes
}
