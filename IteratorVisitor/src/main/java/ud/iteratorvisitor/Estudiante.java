/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.iteratorvisitor;

/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona{

    public Estudiante(String codigo, String nombre, String direccion, String telefono) {
        super(codigo, nombre, direccion, telefono);
    }
    
    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitarEstudiante(this);
    }
    
}
