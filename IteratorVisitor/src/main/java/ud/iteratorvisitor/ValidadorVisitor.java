package ud.iteratorvisitor;


public class ValidadorVisitor implements Visitor {

    @Override
    public void visitarEstudiante(Estudiante e) {
        boolean datosIncompletos = e.getNombre() == null || e.getDireccion() == null || e.getTelefono() == null;
        boolean codigoInvalido = e.getCodigo() == null || !e.getCodigo().matches("\\d{11}");

        if (datosIncompletos || codigoInvalido) {
            System.out.print("Estudiante " + e.getCodigo() + " tiene: ");
            if (datosIncompletos) System.out.print("datos incompletos ");
            if (codigoInvalido) System.out.print("código inválido (esperado 11 dígitos ej 20201020085)");
            System.out.println();
        }
    }

    @Override
    public void visitarProfesor(Profesor p) {
        boolean datosIncompletos = p.getNombre() == null || p.getDireccion() == null || p.getTelefono() == null;
        boolean codigoInvalido = p.getCodigo() == null || !p.getCodigo().matches("\\d{4}");

        if (datosIncompletos || codigoInvalido) {
            System.out.print("Profesor " + p.getCodigo() + " tiene: ");
            if (datosIncompletos) System.out.print("datos incompletos ");
            if (codigoInvalido) System.out.print("código inválido (esperado 4 dígitos)");
            System.out.println();
        }
    }
}

