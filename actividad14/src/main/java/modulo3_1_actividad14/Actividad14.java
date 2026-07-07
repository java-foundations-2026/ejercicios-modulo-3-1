package modulo3_1_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        String producto = "Agenda";
        double precioUnitario = 12.5;
        int cantidad = 3;
        double impuesto = 0.21;

        // TODO: calcula subtotal, impuesto aplicado y total.

        //Subtotal
        double subtotal = precioUnitario * cantidad;

        //Impuesto
        double impuestoAplicado = subtotal * impuesto;

        //total
        double total = subtotal + impuestoAplicado;

        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precioUnitario + " €");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto Aplicado: " + impuestoAplicado + " €");
        System.out.println("Total: " + total + " €");
    }
}
