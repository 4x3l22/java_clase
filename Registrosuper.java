public class Registrosuper {

    private String name;
    private String lastName;
    private int id;
    private String mail;
    private long phoneNumber;

    public Super(String name, String lastName, int id, String mail, long phoneNumber){

        this.name = name;
        this.lastName = lastName;
        this.id = id ;
        this.mail = mail;
        this.phoneNumber = phoneNumber;

    }

    // getters
    public String name getName(){
        return name;
    }

    public String lastName getLastname(){
        return lastName;
    }

    public int id getId(){
        return id;
    }

    public String mail getMail(){
        return mail;
    }

    public long phoneNumber getPhonenumber(){
        return phoneNumber;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String lastName){
        this.lastName = lastName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void getPhonenumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    
    
}