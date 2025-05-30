package ud.iteratorvisitor;

import javax.swing.JTextArea;


public class ValidadorVisitor implements Visitor {
    private JTextArea output;

    public ValidadorVisitor(JTextArea output) {
        this.output = output;
    }

    @Override
    public void visitarEstudiante(Estudiante e) {
        if (e.getNombre() == null) output.append("Estudiante " + e.getCodigo() + " sin nombre\n");
        if (e.getDireccion() == null) output.append("Estudiante " + e.getCodigo() + " sin dirección\n");
        if (e.getTelefono() == null) output.append("Estudiante " + e.getCodigo() + " sin teléfono\n");
    }

    @Override
    public void visitarProfesor(Profesor p) {
        if (p.getNombre() == null) output.append("Profesor " + p.getCodigo() + " sin nombre\n");
        if (p.getDireccion() == null) output.append("Profesor " + p.getCodigo() + " sin dirección\n");
        if (p.getTelefono() == null) output.append("Profesor " + p.getCodigo() + " sin teléfono\n");
    }
}

