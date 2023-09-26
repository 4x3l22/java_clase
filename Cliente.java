import java.util.Scanner;
import factura.Factura;
public class Cliente {
    
    public static void main(String[] args) {
        byte num;
        String producto;
        int precio;
        String direccion;
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("REGISTRO USUARIO");
    
        System.out.println("Ingrese su Nombre");
        String nombre = scanner.nextLine();
    
        System.out.println("Ingrese su Apellido");
        String apellido = scanner.nextLine();
    
        System.out.println("Ingrese su Identificación");
        int identidad = scanner.nextInt();
    
        scanner.nextLine(); // Consumir el carácter de nueva línea
    
        System.out.println("Ingrese su Correo");
        String correo = scanner.nextLine();
    
        System.out.println("Ingrese su Numero de telefono");
        long telefono = scanner.nextLong();
    
        System.out.println("Ingrese el monto de recarga de cuenta");
        double pago = scanner.nextDouble();
    
        scanner.nextLine();
    
        System.out.println("Ingrese su dirección");
        direccion = scanner.nextLine();
    
        Factura objFactura = new Factura(direccion, null, pago, nombre, apellido, identidad, correo, telefono);
    
        do {
            System.out.println("¿Qué desea hacer ahora? Marque cualquiera de los siguientes números\n"+
            "1. ¿Desea comprar productos?\n2. Terminar registro?\n3. Ver factura\n4. Salir");
            num = scanner.nextByte();
    
            switch (num) {
                case 1:    
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    producto = scanner.nextLine();
    
                    objFactura.setProducto(producto);
    
                    System.out.println("Ingrese el valor del producto");
                    precio = scanner.nextInt();
    
                    objFactura.calcularpago(precio);
                break;
    
                case 2: 
                    scanner.nextLine();
                    System.out.println("Ingrese su dirección");
                    direccion = scanner.nextLine();
    
                    objFactura.setDireccion(direccion);
                break;
    
                case 3:
                    scanner.nextLine();
                    objFactura.imprimir();
                    break;
    
                default:
                break;
            }
        } while (num != 4);
    
        scanner.close();
    }
}
