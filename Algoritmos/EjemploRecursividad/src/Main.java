public class Main {
    public static void main(String[] args) {

        recursividad r = new recursividad();

        System.out.println("Serie N a 0:");
        System.out.println(r.serieN0(5));

        System.out.println("Serie 0 a N:");
        System.out.println(r.serie0N(5));

        System.out.println("Multiplicacion:");
        System.out.println(r.calculoMultiplicacion(5, 3));

        System.out.println("Fibonacci:");
        System.out.println(r.serieFibonacci(6));

        System.out.println("Primo:");
        System.out.println(r.primo(7, 2));

        int[] arreglo = {4, 8, 2, 10, 5};

        System.out.println("Buscar numero:");
        System.out.println(r.econtrarNumeroArreglo(10, arreglo, 0));

        System.out.println("Mayor del arreglo:");
        System.out.println(r.mayorArreglo(arreglo, 0, arreglo[0]));

        System.out.println("Aparicion inmediata:");
        System.out.println(r.aparicionInmediata("abc12def", '1', '2', 0));

        System.out.println("Orejas de conejos:");
        System.out.println(r.OrejasDeConejos(5));

        System.out.println("Suma de numeros:");
        System.out.println(r.sumaNumeros("abc2x5hola7", 0));
    }
}