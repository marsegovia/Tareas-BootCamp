
import Persona.cliente;

public class App {
    public static void main(String[] args) throws Exception 
    {
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();

    cliente.setEdad(22);
    cliente.setNombre("Martin");
    cliente.setTelefono(1100634979);
    cliente.setCredito(333);
    trabajador.setSalario(60000);


    int edad = cliente.getEdad();
    String nombre = cliente.getNombre();
    int telefono = cliente.getTelefono();
    int credito = cliente.getCredito();
    float salario = trabajador.getSalario();


        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Credito: " + credito);
        System.out.println("Salario: $" + salario);

    }
}
 
class Persona
{
    int edad;
    String nombre;
    int telefono;


    public void setEdad(int edad)
    {
        this.edad= edad;
    }
    public int getEdad()
    {
        return this.edad;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }

    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }
    public int getTelefono()
    {
        return this.telefono;
    }
}

class Cliente extends Persona
{
      int credito;
  
    public void setCredito(int credito)
    {
       this.credito = credito;
    }
     public int getCredito()
    {
        return this.credito;
    }
}

class Trabajador extends Persona
{
    float salario;

   public void setSalario(float salario)
    {
        this.salario= salario;
    }
     public float getSalario()
    {
        return this.salario;
    }
}