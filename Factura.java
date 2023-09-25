

public class Factura extends Registrosuper{

    private String direccion;
    private String producto;
    private double pago;

    public Factura(String direccion, String producto, double pago){

        this.direccion = direccion;
        this.producto = producto;
        this.pago = pago;

    }

    // getters

    public String direccion getDireccion(){
        return direccion;
    }

    public String producto geProducto(){
        return producto;
    }

    public double pago getPago(){
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

    public void pagar(long monto){

        monto -= pago;

        System.out.println("Su cambio es de: $"+monto);
    }

} 