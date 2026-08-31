public class Cuadrado implements Figuras {

    public double lado;

    public Cuadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea(){
        double resultado=lado*lado;
        return resultado;
    }

    @Override
    public String toString(){
        return "RESULTADO: " +calcularArea();
    }
}
