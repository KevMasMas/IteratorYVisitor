package ud.iteratorvisitor;

public class NotificadorVisitor implements Visitor {
    @Override
    public void visitarEstudiante(Estudiante e) {
        StringBuilder mensaje = new StringBuilder("[Notificación] Estudiante " + e.getCodigo() + ": ");

        boolean incompleto = false;
        if (e.getNombre() == null) {
            mensaje.append("nombre faltante. ");
            incompleto = true;
        }
        if (e.getDireccion() == null) {
            mensaje.append("dirección faltante. ");
            incompleto = true;
        }
        if (e.getTelefono() == null) {
            mensaje.append("teléfono faltante. ");
            incompleto = true;
        }

        // Validar longitud del código (11 dígitos para estudiantes)
        if (!e.getCodigo().matches("\\d{11}")) {
            mensaje.append("código inválido (debe tener 11 dígitos). ");
            incompleto = true;
        }

        if (incompleto) {
            System.out.println(mensaje.toString().trim());
        }
    }

    @Override
    public void visitarProfesor(Profesor p) {
        StringBuilder mensaje = new StringBuilder("[Notificación] Profesor " + p.getCodigo() + ": ");

        boolean incompleto = false;
        if (p.getNombre() == null) {
            mensaje.append("nombre faltante. ");
            incompleto = true;
        }
        if (p.getDireccion() == null) {
            mensaje.append("dirección faltante. ");
            incompleto = true;
        }
        if (p.getTelefono() == null) {
            mensaje.append("teléfono faltante. ");
            incompleto = true;
        }

        // Validar código del profesor: debe tener 4 dígitos numéricos
        if (!p.getCodigo().matches("\\d{4}")) {
            mensaje.append("código inválido (debe tener exactamente 4 dígitos). ");
            incompleto = true;
        }

        if (incompleto) {
            System.out.println(mensaje.toString().trim());
        }
    }
}
