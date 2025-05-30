package ud.iteratorvisitor;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Validador y Notificador");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 500);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);

            JButton procesarButton = new JButton("Procesar Datos");
            procesarButton.addActionListener(e -> {
                Visitor validador = new ValidadorVisitor(textArea);
                Visitor notificador = new NotificadorVisitor(textArea);

                ColeccionEstudiantes estudiantes = new ColeccionEstudiantes(
                        Colecciones.getEstudiantesArrayList(),
                        Colecciones.getEstudiantesTreeSet()
                );
                for (Estudiante est : estudiantes) {
                    est.aceptar(validador);
                    est.aceptar(notificador);
                }

                ColeccionProfesores profesores = new ColeccionProfesores(
                        Colecciones.getProfesoresArrayList(),
                        Colecciones.getProfesoresTreeSet()
                );
                for (Profesor prof : profesores) {
                    prof.aceptar(validador);
                    prof.aceptar(notificador);
                }
            });

            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(procesarButton, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
