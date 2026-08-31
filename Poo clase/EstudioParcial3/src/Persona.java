public class Persona {
    protected String nombre;

    public Persona(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

}
