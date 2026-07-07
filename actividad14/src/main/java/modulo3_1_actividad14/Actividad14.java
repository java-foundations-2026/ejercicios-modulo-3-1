package modulo3_1_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        String producto = "Agenda";
        double precioUnitario = 12.5;
        int cantidad = 3;
        double impuesto = 0.21;
        double precioImpuesto;
        double precioTotal;

        // TODO: calcula subtotal, impuesto aplicado y total.
        
        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: " + (precioUnitario = precioUnitario * cantidad)+" €");
        System.out.println("Impuesto: " + (precioImpuesto = precioUnitario * impuesto)+" €");
        System.out.println("Total: " + (precioUnitario + precioImpuesto )+" €");
    }
}
