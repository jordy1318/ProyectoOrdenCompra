import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    public final int nada;
    private static int ultimaOrden=0; //esta debe de ser static ya que al ser de la clase cada que creemos una orden se incrementa
    //no importa que sean muchas instanacias todas comparten el mismo valor
    private  int indiceLista=0; // esta no debe de ser static por que necesito que para cada instancia individual se genere desde 0;

    private Producto[] productos;

    //CREACION DEL CONSTRUCTOR SOLO CON LA INICIALIZACION DE LA DESCRIPCION//
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimaOrden;
        this.productos = new Producto[4];
        this.nada=20;

    }
    //METEDOS GETTER PARA TODOS LOS ATRIBUTOS//
    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    //IMPREMENTACION DE LOS METODOS SOLO PARA LOS ATRIBUTOS DE CLIENTE Y FECHA


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //METODO ADD
    public void addProducto(Producto producto){
        if(indiceLista < this.productos.length) {
            this.productos[indiceLista++] = producto;
        }
    }


    //METODO DE TOTAL
    public int total(){
        int total=0;
        for(Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }

}
