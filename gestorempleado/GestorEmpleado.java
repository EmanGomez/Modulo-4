package gestorempleado;

import java.util.ArrayList;
public class GestorEmpleado{
    private final ArrayList<Empleado> empleados;

    public GestorEmpleado() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado Empleado : empleados) {
            Empleado.imprimirInformacion();
            System.out.println("-----------------------");
        }
    }
}