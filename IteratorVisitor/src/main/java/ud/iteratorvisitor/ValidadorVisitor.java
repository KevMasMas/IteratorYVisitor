package ud.iteratorvisitor;


public class ValidadorVisitor implements Visitor {

    @Override
    public void visitarEstudiante(Estudiante e) {
        if (e.getCodigo().length() != 4) {
            System.out.println("Estudiante con código inválido: " + e.getCodigo());
        }

        if (e.getNombre() == null || e.getDireccion() == null || e.getTelefono() == null || e.getTelefono().isEmpty()) {
            System.out.println("Datos incompletos para el estudiante: " + e.getCodigo());
        }
    }

    @Override
    public void visitarProfesor(Profesor p) {
        if (p.getCodigo().length() != 4) {
            System.out.println("Profesor con código inválido: " + p.getCodigo());
        }

        if (p.getNombre() == null || p.getDireccion() == null || p.getTelefono() == null || p.getTelefono().isEmpty()) {
            System.out.println("Datos incompletos para el profesor: " + p.getCodigo());
        }
    }
}
