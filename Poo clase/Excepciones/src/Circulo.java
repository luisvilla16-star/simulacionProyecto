public class Circulo extends Figura {
    public double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio=radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    @Override
    public double calcularPerimetro(){
        return Math.PI*2*radio;
    }

    @Override
    public String toString() {
        return "Color: " +color +" Area: " +calcularArea() +" Perimetro: " +calcularPerimetro();
    }
}
