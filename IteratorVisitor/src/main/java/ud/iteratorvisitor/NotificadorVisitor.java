package ud.iteratorvisitor;

public class NotificadorVisitor implements Visitor {
    @Override
    public void visitarEstudiante(Estudiante e) {
        boolean datosIncompletos = e.getNombre() == null || e.getDireccion() == null || e.getTelefono() == null;
        boolean codigoInvalido = e.getCodigo() == null || !e.getCodigo().matches("\\d{11}");

        if (datosIncompletos || codigoInvalido) {
            System.out.print("[Notificación] Estudiante " + e.getCodigo() + ": ");
            if (datosIncompletos) System.out.print("complete sus datos. ");
            if (codigoInvalido) System.out.print("su código debe tener 11 dígitos (AAAA+facultad/ranking).");
            System.out.println();
        }
    }

    @Override
    public void visitarProfesor(Profesor p) {
        boolean datosIncompletos = p.getNombre() == null || p.getDireccion() == null || p.getTelefono() == null;
        boolean codigoInvalido = p.getCodigo() == null || !p.getCodigo().matches("\\d{4}");

        if (datosIncompletos || codigoInvalido) {
            System.out.print("[Notificación] Profesor " + p.getCodigo() + ": ");
            if (datosIncompletos) System.out.print("complete sus datos. ");
            if (codigoInvalido) System.out.print("su código debe ser de 4 dígitos.");
            System.out.println();
        }
    }
}

