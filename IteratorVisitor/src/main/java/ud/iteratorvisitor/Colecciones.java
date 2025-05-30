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
    
    public static List<Profesor> getProfesoresArrayList() {
        List<Profesor> lista = new ArrayList<>();
        lista.add(new Profesor("P1", "María", "Cra 10", "11111"));
        lista.add(new Profesor("P2", "Jorge", "Cra 15", null)); // teléfono nulo para probar validación
         return lista;
}

    public static Set<Profesor> getProfesoresTreeSet() {
         Set<Profesor> set = new TreeSet<>(Comparator.comparing(Persona::getCodigo));
        set.add(new Profesor("P3", "Lucía", "Av 20", "22222"));
        set.add(new Profesor("P4", null, "Av 25", "33333")); // nombre nulo para probar validación
        return set;
}


     
}
