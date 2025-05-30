package ud.iteratorvisitor;

public class NotificadorVisitor implements Visitor {
    @Override
    public void visitarEstudiante(Estudiante e) {
        if (e.getNombre() == null || e.getDireccion() == null || e.getTelefono() == null) {
            System.out.println("[Notificación] Estudiante " + e.getCodigo() + ": complete sus datos.");
        }
    }

    @Override
    public void visitarProfesor(Profesor p) {
        if (p.getNombre() == null || p.getDireccion() == null || p.getTelefono() == null) {
            System.out.println("[Notificación] Profesor " + p.getCodigo() + ": complete sus datos.");
        }
    }
}
