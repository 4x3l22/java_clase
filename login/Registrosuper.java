package login;

public interface Metodos {

    void recargacuenta();
    void imprimir();
    void calcularpago();
    
}
public class Registrosuper implements Metodos{

    private String name;
    private String lastname;
    private int id;
    private String mail;
    private long phoneNumber;

    public Registrosuper(String name, String lastname, int id, String mail, long phoneNumber){

        this.name = name;
        this.lastname = lastname;
        this.id = id ;
        this.mail = mail;
        this.phoneNumber = phoneNumber;

    }

    // getters
    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public int getId(){
        return id;
    }

    public String getMail(){
        return mail;
    }

    public long getPhonenumber(){
        return phoneNumber;
    }
    
    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String lastName){
        this.lastname = lastName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setPhonenumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo comprobante genérico...");
    }

    @Override
    public void recargacuenta(){
        System.out.println("recargando..");
    }

    @Override
    public void calcularpago(){
        System.out.println("calculando pago");
    }

}