import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Relojes");
        orden1.setCliente(new Cliente("Jordy","Lozada"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Patek phillep","Nautilus",3200));
        orden1.addProducto(new Producto("GUESS","Phonex",2700));
        orden1.addProducto(new Producto("Zanlangers","Jaguar",2500));
        orden1.addProducto(new Producto("Apple","Watch",5000));
        //SEGUNDA ORDEN

        OrdenCompra orden2 = new OrdenCompra("Prendas");
        orden2.setCliente(new Cliente("Mariana", "Lozada"));
        orden2.setFecha(new Date());

        Producto a = new Producto("mattel","ternunirn",200);

        orden2.addProducto(a);
        orden2.addProducto(a);
        orden2.addProducto(a);
        orden2.addProducto(a);

        OrdenCompra orden3 = new OrdenCompra("nada");






        //TERCERA ORDEN


        //Impresiond de los datos

        OrdenCompra[] ordenes = {orden1,orden2};

        for(OrdenCompra orden: ordenes){
            System.out.println(orden.getCliente());
            System.out.println(orden.getFecha());
            System.out.println(orden.getIdentificador());
            System.out.println(orden.getDescripcion());
            System.out.println(orden.total());

            for(Producto p: orden.getProductos()){
                System.out.println(p.getNombre() + " " + p.getFabricante() + " "
                        + p.getPrecio());


            }
            System.out.println("---------------------------------------------------SIGUENTE----------------------------" +
                    "---------------------");
        }

        //PRUEBAS ESTO NO ES PARTE DEL EJERCICIO
        System.out.println(orden3.getIdentificador());
        OrdenCompra an = new OrdenCompra(" ");
        System.out.println(an.getIdentificador());

        System.out.println(orden1.nada + " "+ orden2.nada + " "+orden3.nada + " "+ an.nada) ;
    }
}
