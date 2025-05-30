/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.iteratorvisitor;

/**
 *
 * @author USUARIO
 */
public class main {
    public static void main(String[] args) {
        Visitor validador = new ValidadorVisitor();
        Visitor notificador = new NotificadorVisitor();

        ColeccionEstudiantes estudiantes = new ColeccionEstudiantes(
            Colecciones.getEstudiantesArrayList(),
            Colecciones.getEstudiantesTreeSet()
        );

        for (Estudiante e : estudiantes) {
            e.aceptar(validador);
            e.aceptar(notificador);
        }

        ColeccionProfesores profesores = new ColeccionProfesores(
            Colecciones.getProfesoresArrayList(),
            Colecciones.getProfesoresTreeSet()
        );

        for (Profesor p : profesores) {
            p.aceptar(validador);
            p.aceptar(notificador);
        }
    }
}
