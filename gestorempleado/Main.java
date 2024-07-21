
package gestorempleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleado gestor = new GestorEmpleado();
        Scanner scanner = new Scanner(System.in);

        //agregar empleados
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la edad del empleado: ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese el salario del empleado: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            Empleado empleado = new Empleado(nombre, edad, salario);
            gestor.agregarEmpleado(empleado);

            System.out.print(" Desea agregar otro empleado? (si/no):? ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("no")) {
            } else {
                continuar = false;
            }
        }

        // detalles de los empleados existentes
        gestor.mostrarEmpleados();
    }
}

