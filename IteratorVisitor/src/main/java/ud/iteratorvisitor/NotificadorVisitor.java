package ud.iteratorvisitor;

import javax.swing.JTextArea;

public class NotificadorVisitor implements Visitor {
    private JTextArea output;

    public NotificadorVisitor(JTextArea output) {
        this.output = output;
    }

    @Override
    public void visitarEstudiante(Estudiante e) {
        if (e.getNombre() == null) output.append("[Notificación] Estudiante " + e.getCodigo() + ": falta el nombre\n");
        if (e.getDireccion() == null) output.append("[Notificación] Estudiante " + e.getCodigo() + ": falta la dirección\n");
        if (e.getTelefono() == null) output.append("[Notificación] Estudiante " + e.getCodigo() + ": falta el teléfono\n");
    }

    @Override
    public void visitarProfesor(Profesor p) {
        if (p.getNombre() == null) output.append("[Notificación] Profesor " + p.getCodigo() + ": falta el nombre\n");
        if (p.getDireccion() == null) output.append("[Notificación] Profesor " + p.getCodigo() + ": falta la dirección\n");
        if (p.getTelefono() == null) output.append("[Notificación] Profesor " + p.getCodigo() + ": falta el teléfono\n");
    }
}
