package factura;
import login.Registrosuper;

public class Factura extends Registrosuper{

    private String direccion;
    private String producto;
    private double pago;

    public Factura(String direccion, String producto, double pago, String name, String lastname, int id, String mail, long phoneNumber){

        super(name, lastname, id, mail, phoneNumber);
        this.direccion = direccion;
        this.producto = producto;
        this.pago = pago;

    }

    // getters

    public String getDireccion(){
        return direccion;
    }

    public String getProducto(){
        return producto;
    }

    public double getPago(){
        return pago;
    }

    // setters

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setProducto(String producto){
        this.producto=producto;
    }

    public void setPago(double pago){
        this.pago=pago;
    }

    public void recargacuenta(double pagar){
        pago += pagar;
    }

    public void calcularpago(double pagar){
        pago -= pagar;
        System.out.println("total de cambio: "+pago);
    }

    public void imprimir() {
        System.out.println("Imprimiendo factura:");
        System.out.println("Nombre: "+getName()+" "+getLastname());
        System.out.println("Identificación: "+getId());
        System.out.println("Dirección: " + direccion);
        System.out.println("Producto: " + producto);
        System.out.println("Pago: $" + pago);
    }

}