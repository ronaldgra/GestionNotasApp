package com.example.notas;

import java.util.Scanner;

/**
 * Se encarga de la interacción con el usuario (entrada/salida).
 */
public class NotaConsoleUI {
    private final Scanner scanner;

    public NotaConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarNombreDocente() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public int solicitarCantidadNotas() {
        System.out.print("Ingrese la cantidad de notas a registrar: ");
        return scanner.nextInt();
    }

    public double solicitarNota(int indice) {
        System.out.print("Ingrese la nota " + indice + ": ");
        return scanner.nextDouble();
    }

    public void mostrarResultados(String nombreDocente, GradeManagerImpl gradeManager) {
        System.out.println("\nResumen para el docente " + nombreDocente + ":");
        System.out.println("Notas ingresadas: " + gradeManager.getNotas());
        System.out.println("Suma de las notas: " + gradeManager.calcularSumaNotas());
        System.out.println("Nota mayor: " + gradeManager.obtenerNotaMayor());
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
