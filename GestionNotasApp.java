package com.example.notas;

/**
 * Clase principal que orquesta la aplicación.
 */
public class GestionNotasApp {
    public static void main(String[] args) {
        // Crear la UI para la entrada y salida
        NotaConsoleUI ui = new NotaConsoleUI();

        // Solicitar el nombre del docente
        String nombreDocente = ui.solicitarNombreDocente();

        // Crear el gestor de notas (aquí se podría usar inyección de dependencias)
        GradeManagerImpl gradeManager = new GradeManagerImpl();

        // Solicitar la cantidad de notas
        int cantidadNotas = ui.solicitarCantidadNotas();

        // Ingreso de cada nota
        for (int i = 1; i <= cantidadNotas; i++) {
            double nota = ui.solicitarNota(i);
            gradeManager.addNota(nota);
        }

        // Mostrar resultados
        ui.mostrarResultados(nombreDocente, gradeManager);
        ui.cerrarScanner();
    }
}
