public class Empleado  extends Persona{
    int num_legago;
    String cargo;
    double sueldo;

    public Empleado(int num_legago, String cargo, double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String  telefono){
        super(id,dni,nombre,apellido,domicilio,telefono);
        this.num_legago=num_legago;
        this.cargo=cargo;
        this.sueldo=sueldo;
    }

    public int getNum_legago() {
        return num_legago;
    }

    public void setNum_legago(int num_legago) {
        this.num_legago = num_legago;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return super.toString()  +" Numero de legago: " +num_legago +" Cargo:" +cargo +" Sueldo: " +sueldo;
    }


}
