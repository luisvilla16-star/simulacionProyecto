public class Anonimo extends Persona{

    private String encontradoEn;

    public Anonimo(String nombre,String encontradoEn){
        super(nombre);
        this.encontradoEn= encontradoEn;
    }
    public String encontradoEn(){
        return encontradoEn;
    }

    @Override
    public String toString() {
        return  super.toString() +" Encontrado en: " + encontradoEn;
    }

}
