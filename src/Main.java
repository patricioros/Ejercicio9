public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(42);
        cliente.setNombre("Patricio");
        cliente.setTelefono(46499752);
        cliente.setCredito(400000);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(40);
        trabajador.setNombre("Pablo");
        trabajador.setTelefono(45440706);
        trabajador.setSalario(80000);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
    public int getEdad(){
        return  edad ;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTelefono(){
        return telefono;
    }

    public  void  setTelefono(int telefono){
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    int credito;
    public int getCredito(){
        return credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }

}
class Trabajador extends Persona{
    int salario;
    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}
