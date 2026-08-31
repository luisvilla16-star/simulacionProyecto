public class Rectangulo extends Figura{
    public double base;
    public double altura;

    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2*base+2*altura;
    }

    @Override
    public String toString(){
        return "Color: " +color +" Area: " +calcularArea() +" Perimetro: " +calcularPerimetro();
    }
}
