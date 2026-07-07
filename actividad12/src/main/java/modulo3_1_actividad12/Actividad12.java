package modulo3_1_actividad12;

public class Actividad12 {
    public static void main(String[] args) throws Exception {
        String nombre = "Carlos";
        String departamento = "Ventas";
        double salarioMensual = 1800.0;
        boolean activo = true;

        // TODO: calcula el salario anual y muestra la tarjeta.

        double resultAnual = salarioMensual * 12;
        System.out.println("Empleado: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario Mensual: " + salarioMensual);
        System.out.println("Salario Anual: " + resultAnual);
        System.out.println("Activo: " + activo);


        /* Empleado: Carlos
        Departamento: Ventas
        Salario mensual: 1800.0
        Salario anual: 21600.0
        Activo: true */
    }
}
