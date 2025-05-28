/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.iteratorvisitor;

/**
 *
 * @author USUARIO
 */
public interface Visitor {
    void visitarEstudiante(Estudiante e);
    void visitarProfesor(Profesor p);
}
