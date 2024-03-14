package com.mycompany.ejerciciopn22;
import java.util.Scanner;
public class EjercicioPN22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el salario básico por hora del empleado: ");
        double salarioHora = scanner.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        double salarioMensual = salarioHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual del empleado: $" + salarioMensual);
        } else {
            System.out.println("Nombre del empleado: " + nombre);
        }

        scanner.close();
    }
}
