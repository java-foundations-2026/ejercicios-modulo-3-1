package modulo3_1_actividad11;

public class Actividad11 {
    public static void main(String[] args) throws Exception {
        String nombre = "Ana";
        double nota1 = 7.0;
        double nota2 = 8.0;
        double nota3 = 9.0;
        boolean asistencia = true;

        // TODO: calcula el promedio y muestra el informe.
        System.out.println("Estudiante: " + nombre);
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: " + promedio);
        System.out.println("Asistencia: " + asistencia);
    }
}
