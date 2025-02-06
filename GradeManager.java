package com.example.notas;

/**
 * Define los métodos para la gestión de notas.
 */
public interface GradeManager {
    void addNota(double nota);
    double calcularSumaNotas();
    double obtenerNotaMayor();
}
