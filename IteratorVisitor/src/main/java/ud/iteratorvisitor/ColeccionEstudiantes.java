package ud.iteratorvisitor;

import java.util.*;

public class ColeccionEstudiantes implements Iterable<Estudiante> {
    private List<Estudiante> estudiantes = new ArrayList<>();
    private Set<Estudiante> estudiantesSet = new TreeSet<>(Comparator.comparing(Persona::getCodigo));

    public ColeccionEstudiantes(List<Estudiante> lista, Set<Estudiante> set) {
        estudiantes.addAll(lista);
        estudiantesSet.addAll(set);
    }

    @Override
    public Iterator<Estudiante> iterator() {
        List<Estudiante> combinados = new ArrayList<>(estudiantes);
        combinados.addAll(estudiantesSet);
        return combinados.iterator();
    }
}