package com.example.notas;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa la lógica para gestionar las notas.
 */
public class GradeManagerImpl implements GradeManager {
    private final List<Double> notas;

    public GradeManagerImpl() {
        this.notas = new ArrayList<>();
    }

    @Override
    public void addNota(double nota) {
        notas.add(nota);
    }

    @Override
    public double calcularSumaNotas() {
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        return suma;
    }

    @Override
    public double obtenerNotaMayor() {
        if (notas.isEmpty()) {
            return 0;
        }
        double mayor = notas.get(0);
        for (Double nota : notas) {
            if (nota > mayor) {
                mayor = nota;
            }
        }
        return mayor;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
