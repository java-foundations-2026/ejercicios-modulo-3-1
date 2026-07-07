package modulo3_1_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        String producto = "Agenda";
        double precioUnitario = 12.5;
        int cantidad = 3;
        double impuesto = 0.21;

        // TODO: calcula subtotal, impuesto aplicado y total.
        System.out.println("Producto: " + producto);
        double subtotal = precioUnitario * cantidad;
        System.out.println("Subtotal: " + subtotal);
        double impuestostotal = impuesto * subtotal;
        System.out.println("Impuesto: " + impuestostotal);
        double total = impuestostotal + subtotal;
        System.out.println("Total: " + total);
    }
}
