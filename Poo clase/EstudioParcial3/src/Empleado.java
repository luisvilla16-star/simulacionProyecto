public class Empleado extends Persona {

    private double salario;

    public Empleado(){
        this("Desconocido",0);
    }

    public Empleado(double salario){
        this("desconcocido",salario);
    }
    public Empleado(String nombre, double salario){
    super(nombre);
    this.salario=salario;
}

public double salario(){
        return salario;
}
    @Override
    public String toString() {
        return super.toString() +" Salario: " +salario;
    }
}
