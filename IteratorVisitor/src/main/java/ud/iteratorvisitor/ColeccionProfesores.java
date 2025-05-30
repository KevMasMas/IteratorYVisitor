package ud.iteratorvisitor;
import java.util.*;

public class ColeccionProfesores implements Iterable<Profesor> {
    private List<Profesor> listaProfesores;
    private Set<Profesor> setProfesores;

    public ColeccionProfesores(List<Profesor> lista, Set<Profesor> set) {
        this.listaProfesores = new ArrayList<>(lista);
        this.setProfesores = new TreeSet<>(Comparator.comparing(Profesor::getCodigo));
        this.setProfesores.addAll(set);
    }

    @Override
    public Iterator<Profesor> iterator() {
        List<Profesor> combinados = new ArrayList<>(listaProfesores);
        combinados.addAll(setProfesores);
        return combinados.iterator();
    }
}
